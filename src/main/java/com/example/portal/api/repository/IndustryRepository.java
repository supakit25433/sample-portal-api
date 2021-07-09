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
public class IndustryRepository {

	public Map<String, Object> getMineral2016() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/36afe1d3-37ab-4098-a2f6-a1b2f301eef4/resource/822d7054-2d97-4c12-8a8e-ac8067e064ca/download/production2016_20180321_ogd.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> al = result.toMap();
		return al;
	}
	
	public Map<String, Object> getMineral2015() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/07025c16-8aef-4652-b4d5-7db60747a91e/resource/d23b8716-0fa7-4443-8953-3113005b4910/download/production2015_20160905_ogd.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> al = result.toMap();
		return al;
	}
	
	public Map<String, Object> getMineral2014() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/d670eda1-aefd-49a0-b1d4-60cae0cd5128/resource/1f3feb1a-6d10-4dc3-8d7f-8508fb628c52/download/production2014_20160824_ogd.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
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
		JSONObject result = new JSONObject(responseStrBuilder.toString());
		Map<String, Object> al = result.toMap();
		return al;
	}
	
}
