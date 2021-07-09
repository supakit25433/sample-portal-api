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
public class ResourceRepository {

	public List<Object> getCDMProject() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://data.go.th/dataset/9d8b9a9d-b706-4920-aa1f-9c137630db62/resource/24cc4f8f-623c-4537-9f47-483c5c3bc038/download/cdm_db.json");
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
		responseStrBuilder.delete(0, 102);
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
}
