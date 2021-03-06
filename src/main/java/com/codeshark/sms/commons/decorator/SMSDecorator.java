package com.codeshark.sms.commons.decorator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SMSDecorator {
	
	private Set<String> errors = new HashSet<>();
	private Map<String, String> info = new HashMap<>();
	private Map<String, Object> responseMap = new HashMap<>();
	private String responseMessage = null;
	private Object dataBean;
	private String queryTime = "";
	private String apiRequestName = "";
	private String returnCode = "";
	private String success = "SUCCESS";
	private String failure = "FAILURE";
	
	public String getApiRequestName() {
		return apiRequestName;
	}

	public void setApiRequestName(String apiRequestName) {
		this.apiRequestName = apiRequestName;
	}

	public String getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public Set<String> getErrors() {
		return errors;
	}

	public void setErrors(Set<String> errors) {
		this.errors = errors;
	}

	public Map<String, String> getInfo() {
		return info;
	}

	public void setInfo(Map<String, String> info) {
		this.info = info;
	}

	public Object getDataBean() {
		return dataBean;
	}
	
	public void setDataBean(Object dataBean) {
		this.dataBean = dataBean;
	}

	public Map<String, Object> getResponseMap() {
		return responseMap;
	}

	public void setResponseMap(Map<String, Object> responseMap) {
		this.responseMap = responseMap;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getFailure() {
		return failure;
	}

	public void setFailure(String failure) {
		this.failure = failure;
	}
}
