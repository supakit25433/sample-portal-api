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
public class PrimeministerRepository {

	public List<Object> getInsigniaList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/c8dd92c4-3d1f-4e57-ac12-04ce526049fa/resource/4a209f3d-c245-4b17-8220-c1d956e9b67c/download/decor_34915fd3-c33d-4f64-b670-269f7012c710.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getGovernmentGazetteAnnouncement() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/691f1e1f-8edc-4934-b1cf-74076a146417/resource/72ff3f17-23e6-4179-a7fa-ffbb166d1f9c/download/ratchakitcha.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public Map<String, Object> getMinistry(){
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/govspending/bbministry?api-key=JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8")));
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
	
	public Map<String, Object> getBudgetAndDisbursement2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/govspending/bbgf_summary?api-key=JCizH1CqrBBt8WnUEb558zNgz9SYy1TP&year=2563");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
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
	
	public Map<String, Object> getProvinceList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/govspending/bbgfmisprovince?api-key=JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
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
	
	public Map<String, Object> getDepartmentList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/govspending/bbagc?api-key=JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
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
	
	public Map<String, Object> getJuristicOfSinosiam() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opend.data.go.th/moc/juristic?api-key=JCizH1CqrBBt8WnUEb558zNgz9SYy1TP&juristic_id=0105537004444");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
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
