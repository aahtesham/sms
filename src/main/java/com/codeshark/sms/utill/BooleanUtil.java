/*
 * @Project   : BCRS-Common
 * @Package   : com.tabs.bcrs.utils
 * @FileName  : BooleanUtil.java
 *
 * Copyright � 2011-2012
 * Trans-Atlantic Business Solutions, 
 * All rights reserved.
 * 
 */
package com.codeshark.sms.utill;

import java.io.Serializable;


/**
 * @author    : Ahtesham Asif
 * @Date      : 1 Jan 2018
 * @version   : Ver. 1.0.0
 *
 * 						   <center><b>BooleanUtil.java</b></center>
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
public class BooleanUtil implements Serializable{
	
	public static final short TRUE_SHORT= 1; 
	public static final short FALSE_SHORT= 0; 
	

	
	/**
	 * @author      : Waqas Nisar
	 * @Date        : Dec 1, 2011
	 *
	 * @Description :
	 *
	 * @param shortValue
	 * @return      
	 */
	public static boolean  getBooleanValue(Short shortValue) {

		return shortValue != null && shortValue.shortValue() != FALSE_SHORT;

	}
	
	/**
	 * 
	 * @author      : zeeshan.ahmad
	 * @Date        : Jul 10, 2012
	 *
	 * @Description :
	 *
	 * @param booleanValue
	 * @return
	 */
	public static boolean getBooleanValue(Boolean booleanValue) {
		return booleanValue != null && booleanValue.booleanValue();
	}
	
	
	/**
	 * @author      : Waqas Nisar
	 * @Date        : Dec 1, 2011
	 *
	 * @Description :
	 *
	 * @param booleanValue
	 * @return      
	 */
	public static short  getShortValue(Boolean booleanValue){
		
		if (booleanValue != null){
			if (booleanValue.booleanValue( ) ){
				return TRUE_SHORT;
			}
		}
		return FALSE_SHORT;
	}
	
	/**
	 * @author      : Waqas
	 * @Date        : Feb 20, 2012
	 *
	 * @Description :
	 *
	 * @return      
	 */
	public short getTrueShort(){
		return TRUE_SHORT;
	}
	
	/**
	 * @author      : Waqas
	 * @Date        : Feb 20, 2012
	 *
	 * @Description :
	 *
	 * @return      
	 */
	public short getFalseShort(){
		return FALSE_SHORT;
	}
	
	/**
	 * @author      : Waqas
	 * @Date        : Jul 10, 2012
	 *
	 * @Description : to give boolean value
	 *
	 * @return      
	 */
	public static boolean getValue(Boolean value){

		return value != null && value;
	}


}
