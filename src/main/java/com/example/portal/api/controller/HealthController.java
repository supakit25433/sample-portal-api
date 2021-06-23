package com.example.portal.api.controller;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.portal.api.repository.HealthRepository;

@RestController
@RequestMapping("/v1")
public class HealthController {

	@Autowired
	HealthRepository hr;
	
	@RequestMapping(path = "/health/covid-19/daily", method = RequestMethod.GET)
	public Map<String, Object> getDailyCovid() throws Exception {
//		Map<String, Object> response = hr.getDailyCovid();
//		return response;
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
		System.out.println(result);
		Map<String, Object> so = result.toMap();
		return so;
	}
	
	@RequestMapping(path = "/health/covid-19/timeline", method = RequestMethod.GET)
	public Map<String, Object> getTimelineCovid() {
		Map<String, Object> tlcl = hr.getTimelineCovid();
		return tlcl;
	}
	
	@RequestMapping(path = "/health/covid-19/bycase", method = RequestMethod.GET)
	public Map<String, Object> getCaseCovid() {
		Map<String, Object> ccl = hr.getCaseCovid();
		return ccl;
	}
	
}
