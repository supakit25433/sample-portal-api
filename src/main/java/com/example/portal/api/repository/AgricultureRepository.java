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
public class AgricultureRepository {

	public List<Object> getAgriculturalPriceDaily() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL(
					"https://data.go.th/dataset/866a5af2-6a94-4ddd-8e56-7fb086da0986/resource/e2e15d4d-e322-409b-bc02-73329edb0253/download/noit11561118811.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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
		responseStrBuilder.delete(0, 1);
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}

	public Map<String, Object> getImportFertilizerFormula() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL(
					"https://opend.data.go.th/get-ckan/datastore_search?resource_id=b3eb89c1-05b2-4a83-9806-ff8231f44123");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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

	public Map<String, Object> getImportFertilizerCountry() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL(
					"https://opend.data.go.th/get-ckan/datastore_search?resource_id=c009c775-cc85-4697-97de-e1d612ae2dbe");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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

	public Map<String, Object> getImportFertilizerImportantFormula() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL(
					"https://opend.data.go.th/get-ckan/datastore_search?resource_id=853f67b5-461d-4bd2-a800-97fbdefff97c");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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

	public List<Object> getQRestaurantList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://qrestaurant.acfs.go.th/qrest_api_send.php");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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

	public Map<String, Object> getAgriculturalStandards() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://www.acfs.go.th/services/public/commodity-standard/api/get/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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

	public List<Object> getRoyalRainMakingActionPlan() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opendata.royalrain.go.th/rainmaking_plan");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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
		JSONArray data = (JSONArray) result.get("data");
		List<Object> response = data.toList();
		return response;
	}

	public List<Object> getRoyalRainMakingResults() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opendata.royalrain.go.th/rainmaking_result");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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
		JSONArray data = (JSONArray) result.get("data");
		List<Object> response = data.toList();
		return response;
	}

	public List<Object> getRoyalRainMakingRainyArea() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opendata.royalrain.go.th/operate_result");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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
		JSONArray data = (JSONArray) result.get("data");
		List<Object> response = data.toList();
		return response;
	}

	public List<Object> getRoyalRainMakingTargetArea() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://opendata.royalrain.go.th/operate_target");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("api-key", "JCizH1CqrBBt8WnUEb558zNgz9SYy1TP");
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
				String line = "";
				while ((line = br.readLine()) != null) {
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
		JSONArray data = (JSONArray) result.get("data");
		List<Object> response = data.toList();
		return response;
	}

}
