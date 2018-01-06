/*
 * @Project   : BCRS-Common
 * @Package   : com.tabs.bcrs.exception.base
 * @FileName  : BaseException.java
 *
 * Copyright � 2011-2012
 * Trans-Atlantic Business Solutions, 
 * All rights reserved.
 * 
 */
package com.codeshark.sms.commons.exception.base;

import com.codeshark.sms.domain.base.BaseModel;

import java.io.Serializable;


/**
 * @author    : Zeeshan Mirza
 * @Date      : Nov 28, 2011
 * @version   : Ver. 1.0.0
 *
 * 						   <center><b>BaseException.java</b></center>
 * 						<center><b>Modification History</b></center>
 * <pre>
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
public abstract class BaseException extends Exception implements Serializable {

	private static final long	serialVersionUID	= -333615771065171715L;

	private String	customMsg;
	private String	exceptionDescription;

	
	/**
	 * @Constructor
	 * @param customMsg
	 * @param exceptionDescription
	 * @param className
	 * @param methodName
	 */
	public BaseException(
			String customMsg, String exceptionDescription, String className, String methodName ) {
		
		this.setCustomMsg( customMsg );
		this.setExceptionDescription( exceptionDescription );
	//	ExceptionLogger.logException( customMsg + exceptionDescription, className, methodName, this );

	}
	
	/**
	 * set the customized exception message and logs the exception details
	 * 
	 * @param customMsg
	 * @param exceptionDescription
	 * @param className
	 * @param methodName
	 * @param ex
	 * 
	 */
	public BaseException(
			String customMsg, String exceptionDescription, String className, String methodName, Exception ex ) {

		this.setCustomMsg( customMsg );
		this.setExceptionDescription( exceptionDescription );
	//	ExceptionLogger.logException( customMsg + exceptionDescription, className, methodName, this );

	}

	/**
	 * @Constructor
	 * @param customMsg
	 * @param exceptionDescription
	 * @param className
	 * @param methodName
	 * @param baseModel
	 */
	public BaseException(
			String customMsg, String exceptionDescription, String className, String methodName, BaseModel baseModel ) {
		
		this( customMsg, exceptionDescription, className, methodName, baseModel, null );

	}
	
	
	/**
	 * set the customized exception message and logs the exception details
	 * 
	 * @param customMsg
	 * @param exceptionDescription
	 * @param className
	 * @param methodName
	 * @param ex
	 */
	public BaseException(
			String customMsg, String exceptionDescription, String className, String methodName, BaseModel baseModel,
			Exception ex ) {

		this.setCustomMsg( customMsg );
		this.setExceptionDescription( exceptionDescription );
	//	ExceptionLogger.logException( customMsg + exceptionDescription, className, methodName, baseModel, this );
	}

	/**
	 * set the custom message in
	 * 
	 * @param customMsg
	 */
	public void setCustomMsg( String customMsg ) {

		this.customMsg = customMsg;
	}

	/**
	 * @return String
	 */
	public String getCustomMsg( ) {

		return customMsg;
	}

	/**
	 * @return exceptionDescription
	 */
	public String getExceptionDescription( ) {

		return exceptionDescription;
	}

	/**
	 * @param exceptionDescription
	 */
	public void setExceptionDescription( String exceptionDescription ) {

		this.exceptionDescription = exceptionDescription;
	}

}
