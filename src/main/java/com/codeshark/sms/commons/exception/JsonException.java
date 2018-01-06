/*
 * @Project : BCRS-Common
 * 
 * @Package : com.tabs.bcrs.exception.json
 * 
 * @FileName : JsonParseException.java
 * 
 * Copyright � 2011-2012 Trans-Atlantic Business Solutions, All rights reserved.
 */

package com.codeshark.sms.commons.exception;

import com.codeshark.sms.commons.exception.base.BaseException;
import com.codeshark.sms.domain.base.BaseModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;


/**
 * @author : Zeeshan Mirza
 * @Date : Nov 25, 2011
 * @version : Ver. 1.0.0
 * 
 *          <center><b>JsonParseException.java</b></center> <center><b>Modification
 *          History</b></center>
 * 
 *          <pre>
 * 
 * ________________________________________________________________________________________________
 * 
 *  Developer				Date		     Version		Operation		Description
 * ________________________________________________________________________________________________ 
 * 
 * 
 * ________________________________________________________________________________________________
 * </pre>
 * 
 */
public class JsonException extends BaseException {

	private static final long	serialVersionUID	= 7873266026084799466L;

	/**
	 * @Constructor
	 * @param customMsg
	 * @param exceptionDescription
	 * @param className
	 * @param methodName
	 * @param baseEntity
	 * @param ex
	 */
	public JsonException(
			String customMsg, String exceptionDescription, String className, String methodName, BaseModel baseEntity,
			Exception ex ) {
		super( customMsg, exceptionDescription, className, methodName, baseEntity, ex );

		if( ex instanceof JsonParseException){
			
		} else if ( ex instanceof JsonMappingException){
			
		} else if ( ex instanceof IOException ){
			
		} else {
			
		}
	}

}
