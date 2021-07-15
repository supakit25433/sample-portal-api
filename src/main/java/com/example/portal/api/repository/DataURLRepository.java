package com.example.portal.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.portal.api.model.DataURL;

@Repository
public class DataURLRepository {

	@PersistenceContext
	private EntityManager em;
	
	public List<DataURL> getAllData() {
		Query q = em.createQuery("from DataURL");
		return q.getResultList();
	}
	
	public DataURL searchByPath(String path_variable) {
		Query q = em.createQuery("from DataURL where path_variable = :PATH_VARIABLE");
		q.setParameter("PATH_VARIABLE", path_variable);
		List<DataURL> data = q.getResultList();
		return data.isEmpty()?null:(DataURL) data.get(0);
	}
	
	public DataURL searchByJSONArrayPath(String path_variable) {
		Query q = em.createQuery("from DataURL where response_type = :RESPONSE_TYPE AND path_variable = :PATH_VARIABLE");
		q.setParameter("RESPONSE_TYPE", "JSONArray");
		q.setParameter("PATH_VARIABLE", path_variable);
		List<DataURL> data = q.getResultList();
		return data.isEmpty()?null:(DataURL) data.get(0);
	}
	
	public DataURL searchByJSONObjectPath(String path_variable) {
		Query q = em.createQuery("from DataURL where response_type = :RESPONSE_TYPE AND path_variable = :PATH_VARIABLE");
		q.setParameter("RESPONSE_TYPE", "JSONObject");
		q.setParameter("PATH_VARIABLE", path_variable);
		List<DataURL> data = q.getResultList();
		return data.isEmpty()?null:(DataURL) data.get(0);
	}
	
	public DataURL searchByTypeAndPath(String response_type, String path_variable) {
		Query q = em.createQuery("from DataURL where response_type = :RESPONSE_TYPE AND path_variable = :PATH_VARIABLE");
		q.setParameter("RESPONSE_TYPE", response_type);
		q.setParameter("PATH_VARIABLE", path_variable);
		List<DataURL> data = q.getResultList();
		return data.isEmpty()?null:(DataURL) data.get(0);
	}
	
}
