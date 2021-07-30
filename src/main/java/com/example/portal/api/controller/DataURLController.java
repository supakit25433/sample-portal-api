package com.example.portal.api.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.portal.api.model.DataURL;
import com.example.portal.api.model.PostVariable;
import com.example.portal.api.model.ResponseUrl;
import com.example.portal.api.repository.DataURLRepository;
import com.example.portal.api.repository.ResponseUrlRepository;

@RestController
@RequestMapping("/v1/driven")
public class DataURLController {

	@Autowired
	DataURLRepository dur;
	
	@Autowired
	ResponseUrlRepository rur;
	
	// จะเป็น API method GET สำหรับการเรียกดูข้อมูลทั้งหมดของ path API ที่ถูกจัดเก็บไว้ภายใน Database
	@RequestMapping(path = "/overall", method = RequestMethod.GET)
	public List<DataURL> getAllData() {
		List<DataURL> list = dur.getAllData();
		return list;
	}
	
	// จะเป็น API method GET ใช้สำหรับการเรียกดูข้อมูลของ Path API ที่เราจัดเก็บไว้ภายใน Database แบบเจาะจง
	// เราจะส่ง path variable ไปภายใน URL path เพื่อนำไปอ่านข้อมูลจาก Database
	@RequestMapping(path = "/specific/data/{path_variable}", method = RequestMethod.GET)
	public DataURL getDataByKeyword(@PathVariable String path_variable) {
		DataURL du = dur.searchByPath(path_variable);
		return du;
	}
	
	// API method POST โดยจะมีการส่ง request body เป็น path_variable ไปด้วย และหลังจากเรียกใช้งาน API สำเร็จ ข้อมูลที่ได้ (response) จะถูกบันทึกลงภายใน Database
	// แยก API method POST เป็น 2 ตัว เนื่องจาก API แต่ละตัว ส่ง response กลับมาไม่เหมือนกัน
	@RequestMapping(path = "/post/JSONArray", method = RequestMethod.POST)
	public List<Object> postJSONArray(@RequestBody PostVariable v) {
		DataURL du = dur.searchByJSONArrayPath(v.getPath_variable());
		int responseCode = 0;
		String responseMessage = "";
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + v.getPath_variable() + " in this database");
		} else {
			StringBuilder responseStrBuilder = new StringBuilder();
			try {
				URL url = new URL(du.getUrl()+"?year="+du.getYear()+"&month="+du.getMonth()+"&keyword="+du.getKeyword()+"&atype="+du.getAtype()+"&type_news="+du.getType_news()+"&fiscal_year="+du.getFiscal_year()+"&member_type_id="+du.getMember_type_id()+"&name_keyword="+du.getName_keyword()+"&search_type="+du.getSearch_type()+"&sell_type="+du.getSell_type()+"&juristic_id="+du.getJuristic_id()+"&resource_id="+du.getResource_id()+"&limit="+du.getLimit()+"&api-key="+du.getApi_key());
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Ocp-Apim-Subscription-Key", du.getOcp_Apim_Subscription_Key());
				connection.setRequestProperty("api-key", du.getApi_key());
				connection.setRequestProperty("Content-Type", "application/json");
				responseCode = connection.getResponseCode();
				responseMessage = responseMessage + connection.getResponseMessage();
				if(responseCode == HttpURLConnection.HTTP_OK) {		
					BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
					String line = "";	
					while((line = br.readLine()) != null) {
						responseStrBuilder.append(line);	
					}
					connection.getInputStream().close();
				}
				connection.disconnect();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			boolean found = rur.haveInDbByPathVariable(v.getPath_variable());
			if(found == false) {
				ResponseUrl rd = new ResponseUrl();
				rd.setPath_variable(du.getPath_variable());
				rd.setResponse_type(du.getResponse_type());
				rd.setResponse_code(responseCode);
				rd.setResponse_message(responseMessage);
				rd.setResponse_data(responseStrBuilder.toString());
				rur.addResponseUrl(rd);
			} else {
				ResponseUrl rd = new ResponseUrl();
				rd.setPath_variable(du.getPath_variable());
				rd.setResponse_type(du.getResponse_type());
				rd.setResponse_code(responseCode);
				rd.setResponse_message(responseMessage);
				rd.setResponse_data(responseStrBuilder.toString());
				rur.updateResponseUrl(rd);
			}
			JSONArray jo = new JSONArray(responseStrBuilder.toString());
			List<Object> response = jo.toList();
			return response;
		}
	}
	
	// API method POST โดยจะมีการส่ง request body เป็น path_variable ไปด้วย และหลังจากเรียกใช้งาน API สำเร็จ ข้อมูลที่ได้ (response) จะถูกบันทึกลงภายใน Database
	// แยก API method POST เป็น 2 ตัว เนื่องจาก API แต่ละตัว ส่ง response กลับมาไม่เหมือนกัน
	@RequestMapping(path = "/post/JSONObject", method = RequestMethod.POST)
	public Map<String, Object> postJSONObject(@RequestBody PostVariable v) {
		DataURL du = dur.searchByJSONObjectPath(v.getPath_variable());
		int responseCode = 0;
		String responseMessage = "";
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + v.getPath_variable() + " in this database");
		} else {
			StringBuilder responseStrBuilder = new StringBuilder();
			try {
				URL url = new URL(du.getUrl()+"?year="+du.getYear()+"&month="+du.getMonth()+"&keyword="+du.getKeyword()+"&atype="+du.getAtype()+"&type_news="+du.getType_news()+"&fiscal_year="+du.getFiscal_year()+"&member_type_id="+du.getMember_type_id()+"&name_keyword="+du.getName_keyword()+"&search_type="+du.getSearch_type()+"&sell_type="+du.getSell_type()+"&juristic_id="+du.getJuristic_id()+"&resource_id="+du.getResource_id()+"&limit="+du.getLimit()+"&api-key="+du.getApi_key());
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				System.out.println(url);
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Ocp-Apim-Subscription-Key", du.getOcp_Apim_Subscription_Key());
				connection.setRequestProperty("api-key", du.getApi_key());
				System.out.println(du.getApi_key());
				connection.setRequestProperty("Content-Type", "application/json");
				responseCode = connection.getResponseCode();
				responseMessage = responseMessage + connection.getResponseMessage();
				if(responseCode == HttpURLConnection.HTTP_OK) {		
					BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
					String line = "";	
					while((line = br.readLine()) != null) {
						responseStrBuilder.append(line);	
					}
					connection.getInputStream().close();
				}
				connection.disconnect();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			boolean found = rur.haveInDbByPathVariable(v.getPath_variable());
			System.out.println(found);
			if(found == false) {
				ResponseUrl rd = new ResponseUrl();
				rd.setPath_variable(du.getPath_variable());
				rd.setResponse_type(du.getResponse_type());
				rd.setResponse_code(responseCode);
				rd.setResponse_message(responseMessage);
				rd.setResponse_data(responseStrBuilder.toString());
				rur.addResponseUrl(rd);
			} else {
				ResponseUrl rd = new ResponseUrl();
				rd.setPath_variable(du.getPath_variable());
				rd.setResponse_type(du.getResponse_type());
				rd.setResponse_code(responseCode);
				rd.setResponse_message(responseMessage);
				rd.setResponse_data(responseStrBuilder.toString());
				rur.updateResponseUrl(rd);
			}
			System.out.println(responseStrBuilder.toString());
			JSONObject jo = new JSONObject(responseStrBuilder.toString());
			Map<String, Object> response = jo.toMap();
			return response;
		}
	}
	
	// API method GET ใช้สำหรับการทดสอบว่า เราสามารถดึงข้อมูลจาก Database และนำมาใช้งานสำหรับการเรียกใช้งาน API ได้หรือไม่
	// เราจะส่ง path variable ไปภายใน URL path เพื่อนำไปอ่านข้อมูลจาก Database
	@RequestMapping(path = "/response/JSONArray/{path_variable}", method = RequestMethod.GET)
	public List<Object> getJSONArray(@PathVariable String path_variable) {
		DataURL du = dur.searchByJSONArrayPath(path_variable);
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + path_variable + " in this database");
		} else {
			StringBuilder responseStrBuilder = new StringBuilder();
			try {
				URL url = new URL(du.getUrl()+"?year="+du.getYear()+"&month="+du.getMonth()+"&keyword="+du.getKeyword()+"&atype="+du.getAtype()+"&type_news="+du.getType_news()+"&fiscal_year="+du.getFiscal_year()+"&member_type_id="+du.getMember_type_id()+"&name_keyword="+du.getName_keyword()+"&search_type="+du.getSearch_type()+"&sell_type="+du.getSell_type());
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Ocp-Apim-Subscription-Key", du.getOcp_Apim_Subscription_Key());
				connection.setRequestProperty("api-key", du.getApi_key());
				connection.setRequestProperty("Content-Type", "application/json");
				int responseCode = connection.getResponseCode();
				if(responseCode == HttpURLConnection.HTTP_OK) {		
					BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
					String line = "";	
					while((line = br.readLine()) != null) {
						responseStrBuilder.append(line);	
					}
					connection.getInputStream().close();
				}
				connection.disconnect();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			JSONArray jo = new JSONArray(responseStrBuilder.toString());
			List<Object> response = jo.toList();
			return response;
		}
	}
	
	// API method GET ใช้สำหรับการทดสอบว่า เราสามารถดึงข้อมูลจาก Database และนำมาใช้งานสำหรับการเรียกใช้งาน API ได้หรือไม่
	// เราจะส่ง path variable ไปภายใน URL path เพื่อนำไปอ่านข้อมูลจาก Database
	@RequestMapping(path = "/response/JSONObject/{path_variable}", method = RequestMethod.GET)
	public Map<String, Object> getJSONObject(@PathVariable String path_variable) {
		DataURL du = dur.searchByJSONObjectPath(path_variable);
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + path_variable + " in this database");
		} else {
			StringBuilder responseStrBuilder = new StringBuilder();
			try {
				URL url = new URL(du.getUrl()+"?year="+du.getYear()+"&month="+du.getMonth()+"&keyword="+du.getKeyword()+"&atype="+du.getAtype()+"&type_news="+du.getType_news()+"&fiscal_year="+du.getFiscal_year()+"&member_type_id="+du.getMember_type_id()+"&name_keyword="+du.getName_keyword()+"&search_type="+du.getSearch_type()+"&sell_type="+du.getSell_type());
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Ocp-Apim-Subscription-Key", du.getOcp_Apim_Subscription_Key());
				connection.setRequestProperty("api-key", du.getApi_key());
				connection.setRequestProperty("Content-Type", "application/json");
				int responseCode = connection.getResponseCode();
				if(responseCode == HttpURLConnection.HTTP_OK) {		
					BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
					String line = "";	
					while((line = br.readLine()) != null) {
						responseStrBuilder.append(line);	
					}
					connection.getInputStream().close();
				}
				connection.disconnect();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			JSONObject jo = new JSONObject(responseStrBuilder.toString());
			Map<String, Object> response = jo.toMap();
			return response;
		}
	}
	
}
