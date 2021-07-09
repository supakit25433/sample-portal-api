package com.example.portal.api.repository;

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
import org.springframework.stereotype.Repository;

@Repository
public class HealthRepository {
	
	public List<Object> getWasteStat2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/wastesurveil/default/data?year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}
	
	public List<Object> getInGreen2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/envgchos/envgchos/data?atype=1&year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}
	
	public List<Object> getOutGreen2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/envgchos/envgchos/data?atype=2&year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}
	
	public List<Object> getHealthy2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/envrisk/data/data?year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}
	
	public List<Object> getServiceLevel2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/dashboard/ehabasic/data?year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}
	
	public List<Object> getDrinkingWaterQuality2020() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dashboard.anamai.moph.go.th/envwaterquality/envwaterquality/data?year=2020");
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
		JSONArray array = (JSONArray) result.get("data");
		List<Object> so = array.toList();
		return so;
	}

	public Map<String, Object> getDailyCovid() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://covid19.th-stat.com/json/covid19v2/getTodayCases.json");
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
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	public Map<String, Object> getTimelineCovid() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://covid19.th-stat.com/json/covid19v2/getTimeline.json");
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
	
	public Map<String, Object> getCaseCovid() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://covid19.th-stat.com/json/covid19v2/getSumCases.json");
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
