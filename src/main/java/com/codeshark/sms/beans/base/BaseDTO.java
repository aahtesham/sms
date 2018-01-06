/*
 * @Project   : 
 * @Package   : 
 * @FileName  : 
 *
 * Copyright � 
 * Trans-Atlantic Business Solutions,
 * All rights reserved.
 *
 */
package com.codeshark.sms.beans.base;
import com.codeshark.sms.domain.base.BaseModel;

import java.io.Serializable;


public class  BaseDTO extends BaseModel implements Serializable{

	private static final long	serialVersionUID	= 4153471587344951507L;
	
	// Only for development in Flex, please do not change it
	private boolean devMode = false;
	



	public boolean isDevMode() {
		return devMode;
	}


	public void setDevMode(boolean devMode) {
		this.devMode = devMode;
	}
	





}
