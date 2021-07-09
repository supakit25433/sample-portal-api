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
public class StockRepository {

	public List<Object> getApprovalOfficeType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/license_type/company");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getApprovalPersonType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/license_type/person");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getBuySellType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/product/secu_type");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getCurrency() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/product/currency_code");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getActionType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/investoralert/action_type");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getOfferingType() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/common/ref/product/offering_type");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "e356f501740a491b857dffc3a20b155a");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getAssetManagementList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/FundFactsheet/fund/amc");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "4a61c33d41d84c5ea1aa01dd191e1b99");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getDataDailyList() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/FundDailyInfo/amc");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "7c94fcee63d2462dbb2c4ed441ed3bf4");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getLicensedCorporation() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/LicenseCheck/licensee/company");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "b755c209d8764635952a7eea0a661b91");
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
		List<Object> so = result.toList();
		return so;
	}
	
	public List<Object> getWarnInformationInvestor() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.sec.or.th/LicenseCheck/licensee/investoralert/alertdetail");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
			connection.setRequestProperty("Ocp-Apim-Subscription-Key", "b755c209d8764635952a7eea0a661b91");
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
		List<Object> so = result.toList();
		return so;
	}
	
}
