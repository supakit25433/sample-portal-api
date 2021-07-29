package com.example.portal.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.portal.api.model.ResponseUrl;

@Repository
public class ResponseUrlRepository {

	@PersistenceContext
	private EntityManager em;
	
	public boolean haveInDbByPathVariable(String path_variable) {
		Query q = em.createQuery("from ResponseUrl where path_variable = :PATH_VARIABLE");
		q.setParameter("PATH_VARIABLE", path_variable);
		List<ResponseUrl> ru = q.getResultList();
		return ru.isEmpty()?false:true;
	}
	
	@Transactional
	public ResponseUrl addResponseUrl(ResponseUrl ru) {
		em.persist(ru);
		return ru;
	}
	
	@Transactional
	public void updateResponseUrl(ResponseUrl ru) {
		Query q = em.createNativeQuery("UPDATE response_url SET response_type = :RESPONSE_TYPE, response_code = :RESPONSE_CODE, response_message = :RESPONSE_MESSAGE, response_data = :RESPONSE_DATA WHERE path_variable = :PATH_VARIABLE");
		q.setParameter("RESPONSE_TYPE", ru.getResponse_type());
		q.setParameter("RESPONSE_CODE", ru.getResponse_code());
		q.setParameter("RESPONSE_MESSAGE", ru.getResponse_message());
		q.setParameter("RESPONSE_DATA", ru.getResponse_data());
		q.setParameter("PATH_VARIABLE", ru.getPath_variable());
		q.executeUpdate();
	}
	
}
