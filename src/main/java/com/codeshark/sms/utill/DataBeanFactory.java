package com.codeshark.sms.utill;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import com.codeshark.sms.commons.decorator.SMSDecorator;
import com.codeshark.sms.commons.enumeration.ReturnStatusEnum;

@Component
public class DataBeanFactory {
	
	public Object populateDataBeanFromJSON(Class<?> clazz, SMSDecorator decorator, String json){
		Object object = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			object = clazz.newInstance();
			if(json != null && json.trim().length() > 0) {
				object = mapper.readValue(json, clazz);
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
			decorator.setResponseMessage("Invalid JSON");
			decorator.setReturnCode(ReturnStatusEnum.INVALID_DATA.getValue());
			decorator.getErrors().add("Provided input is not in valid JSON form");
		} catch (JsonMappingException e) {
			e.printStackTrace();
			decorator.setResponseMessage("Invalid JSON");
			decorator.setReturnCode(ReturnStatusEnum.INVALID_DATA.getValue());
			decorator.getErrors().add("Provided input is not mapping with JSON properties");
		} catch (IOException e) {
			e.printStackTrace();
			decorator.setResponseMessage("Invalid JSON");
			decorator.setReturnCode(ReturnStatusEnum.INVALID_DATA.getValue());
			decorator.getErrors().add("JSON input/output error");
		} catch (Exception e){
			e.printStackTrace();
			decorator.setResponseMessage("Invalid JSON");
			decorator.setReturnCode(ReturnStatusEnum.INVALID_DATA.getValue());
			decorator.getErrors().add("Invalid JSON");
		}		
		return object;
	}	

}
