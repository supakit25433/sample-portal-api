package com.example.portal.api.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

@Repository
public class InteriorRepository {

	public Map<String, Object> getProvincialLocalOfficeLocation() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=df922923-e009-4dee-92fc-d963a86ce4b8&limit=100");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.defaultCharset()));
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeLocation() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=981ffa6f-2700-407e-9056-0ee05810adc6&limit=8000");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.defaultCharset()));
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeWebsite() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=7782218d-baab-4f7d-8bd7-21f2dddbbe89&limit=10000");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.defaultCharset()));
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	public Map<String, Object> getLocalAdministrativeOrganizationOfficeCode() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/opend-search/vir_9793_1611202992/query?dsname=vir_9793_1611202992&path=vir_9793_1611202992&property=col_4&operator=S_EQUALS&valueLiteral=%E0%B8%81%E0%B8%A3%E0%B8%B0%E0%B8%9A%E0%B8%B5%E0%B9%88&loadAll=1&type=json&limit=1000&offset=0");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.defaultCharset()));
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	public Map<String, Object> getLocalAdministrativeOrganizationSchoolLocation() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=535fa018-7e31-42cb-99bb-15525be05373&limit=2000");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.defaultCharset()));
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> so = result.toMap();
		return so;
	}
	
}
