package com.codeshark.sms.utill;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.codeshark.sms.beans.ResponseObject;
import com.codeshark.sms.commons.decorator.SMSDecorator;

@Component
@Scope("prototype")
public class DecoratorUtil{

	Logger logger = Logger.getLogger(DecoratorUtil.class);

	public ResponseObject responseToClient(SMSDecorator decorator) {
		ResponseObject responseObject = new ResponseObject();
		if ((decorator.getReturnCode() != null && decorator.getReturnCode()
				.equals("RSC003")) || decorator.getErrors().size() > 0 || decorator.getReturnCode()
				.equals("FAILURE")) {//RSC003 failure code
			decorator.getResponseMap().put("Errors", decorator.getErrors());
			responseObject.setReturnType(decorator.getFailure());
			//responseObject.setReturnCode(decorator.getReturnCode());
			responseObject.setReturnMessage(decorator.getResponseMessage());
			responseObject.setReturnData(decorator.getResponseMap());
			responseObject.setQueryTimeInMilli(decorator.getQueryTime());
		} else {
			if (decorator.getInfo().size() > 0) {
				decorator.getResponseMap().put("INFO", decorator.getInfo());
			}
			responseObject.setReturnType(decorator.getSuccess());
//			responseObject.setReturnCode(decorator.getReturnCode());  //TODO 
			responseObject.setReturnMessage(decorator.getResponseMessage());
			responseObject.setReturnData(decorator.getResponseMap());
			responseObject.setQueryTimeInMilli(decorator.getQueryTime());
		}
		if(responseObject.getReturnMessage() != null && responseObject.getReturnMessage().equalsIgnoreCase(
				"javax.net.ssl.SSLHandshakeException: Received fatal alert: certificate_unknown")){
			responseObject.setReturnMessage(
					"Apple apns server is not responding, please try agian latter");
		}
		return responseObject;
	}

}