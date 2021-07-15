package com.example.portal.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_driven")
public class DataURL {

	@Id
	private Integer auto_id;
	private String category;
	private String name;
	private String path_variable;
	private String response_type;
	@Column(columnDefinition = "TEXT", length = 65535)
	private String url;
	@Column(columnDefinition = "TEXT", length = 65535)
	private String Ocp_Apim_Subscription_Key;
	@Column(columnDefinition = "TEXT", length = 65535)
	private String api_key;
	private String year;
	private String month;
	private String keyword;
	private String atype;
	private String type_news;
	private String fiscal_year;
	private String member_type_id;
	private String name_keyword;
	private String search_type;
	private String sell_type;

	public Integer getAuto_id() {
		return auto_id;
	}

	public void setAuto_id(Integer auto_id) {
		this.auto_id = auto_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath_variable() {
		return path_variable;
	}

	public void setPath_variable(String path_variable) {
		this.path_variable = path_variable;
	}

	public String getResponse_type() {
		return response_type;
	}

	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOcp_Apim_Subscription_Key() {
		return Ocp_Apim_Subscription_Key;
	}

	public void setOcp_Apim_Subscription_Key(String ocp_Apim_Subscription_Key) {
		Ocp_Apim_Subscription_Key = ocp_Apim_Subscription_Key;
	}

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public String getType_news() {
		return type_news;
	}

	public void setType_news(String type_news) {
		this.type_news = type_news;
	}

	public String getFiscal_year() {
		return fiscal_year;
	}

	public void setFiscal_year(String fiscal_year) {
		this.fiscal_year = fiscal_year;
	}

	public String getMember_type_id() {
		return member_type_id;
	}

	public void setMember_type_id(String member_type_id) {
		this.member_type_id = member_type_id;
	}

	public String getName_keyword() {
		return name_keyword;
	}

	public void setName_keyword(String name_keyword) {
		this.name_keyword = name_keyword;
	}

	public String getSearch_type() {
		return search_type;
	}

	public void setSearch_type(String search_type) {
		this.search_type = search_type;
	}

	public String getSell_type() {
		return sell_type;
	}

	public void setSell_type(String sell_type) {
		this.sell_type = sell_type;
	}

}
