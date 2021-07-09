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

	// unable to find valid certification path to requested target
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
//		System.out.println(responseStrBuilder.toString());
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
}
