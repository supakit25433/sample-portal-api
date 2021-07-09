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
public class EducationRepository {
	
	public List<Object> getUniversity() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/univ_uni_11_06");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getDemonstration() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/satit_sch_11_01");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getDemonstrationNameAndGender() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/SATIT_STD_11_03");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getUniversityData2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/5_2563UOC_UNIV");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getWorkCondition2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/4_2563UOC_QUESTIONNAIRE");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getGraduateData2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/3_2563uoc_graduate");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getStaffData2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/2_2563uoc_staff");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getStudentData2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/1_2563uoc_student");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getUniversityCourse() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_CUR_11_01");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getNumberOfGraduateByInstitution2562() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_GRD_11_02");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getUniversityListByGroup() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_UNI_11_01");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getNumberOfGraduateByFacultyAndDepartment2562() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_GRD_11_01");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getNumberOfStudent2562() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_STD_11_02");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getNumberOfStaff2563() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("http://202.44.139.145/api/public/opendata/UNIV_STF_12_01");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getResearcherListOfEconomicAnimal() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_EcoAnimal");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getResearcherListOfEnergy() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_Energy");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getResearcherListOfTechnology() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_TectIndustry");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getResearcherListOfWaterManagement() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_WaterManagement");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
	public List<Object> getResearcherListOfZeroWaste() {
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			URL url = new URL("https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_Zerowaste");
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
		JSONArray result = new JSONArray(responseStrBuilder.toString());
		List<Object> al = result.toList();
		return al;
	}
	
}
