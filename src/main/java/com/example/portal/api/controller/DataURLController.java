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
import com.example.portal.api.repository.DataURLRepository;

@RestController
@RequestMapping("/v1/driven")
public class DataURLController {

	@Autowired
	DataURLRepository dur;
	
	@RequestMapping(path = "/overall", method = RequestMethod.GET)
	public List<DataURL> getAllData() {
		List<DataURL> list = dur.getAllData();
		return list;
	}
	
	@RequestMapping(path = "/specific/data/{path_variable}", method = RequestMethod.GET)
	public DataURL getDataByKeyword(@PathVariable String path_variable) {
		DataURL du = dur.searchByPath(path_variable);
		return du;
	}
	
	// เป็นไปได้ไหมที่เราจะสามารถเปลี่ยน return type ไปตามเงื่อนไข
	
	@RequestMapping(path = "/post/JSONArray", method = RequestMethod.POST)
	public List<Object> postJSONArray(@RequestBody PostVariable v) {
		DataURL du = dur.searchByJSONArrayPath(v.getPath_variable());
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + v.getPath_variable() + " in this database");
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
	
	@RequestMapping(path = "/post/JSONObject", method = RequestMethod.POST)
	public Map<String, Object> postJSONObject(@RequestBody PostVariable v) {
		DataURL du = dur.searchByJSONObjectPath(v.getPath_variable());
		if(du == null) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Not found information that path_variable : " + v.getPath_variable() + " in this database");
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
