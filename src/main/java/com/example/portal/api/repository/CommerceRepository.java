package com.example.portal.api.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.stereotype.Repository;

@Repository
public class CommerceRepository {

	public List<Object> getCPFimporterexporter() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/importers-exporters?search_type=name&keyword=ซีพีเอฟ&is_importer=1&is_exporter=1");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getDepartmentMemberType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/ditp-member-types");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getRiceTrader() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/rice-entrepreneurs?name_keyword=สยาม");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getSearchDepartmentMemberByType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/ditp-members?member_type_id=2&limit=2");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getSearchCopyrightByKeyword() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/copyright-details-by-keyword?keyword=มะขามป้อม");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getSearchTrademarkByKeyword() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/trademark-details-by-keyword?keyword=มะขามป้อม");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getProductInformation() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/products?keyword=มะพร้าว");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getThailandInternationalOverview() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/summary-countries?year=2017&month=12");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getAgriculturalProduct() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/gis-products?keyword=มะพร้าว&sell_type=wholesale");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getActivityType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://dataapi.moc.go.th/ditp-activity-types");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
}
