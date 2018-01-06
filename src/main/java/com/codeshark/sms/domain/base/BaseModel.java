
package com.codeshark.sms.domain.base;

import java.io.Serializable;


public abstract class BaseModel implements Serializable{


	private static final long	serialVersionUID	= 4634813711846215219L;
	private Boolean isSave   = null;
	private Boolean isDelete = null;
	



	public Boolean getIsSave( ) {
		
		return isSave;
	}

	
	public void setIsSave( Boolean isSave ) {
	
		this.isSave = isSave;
	}


	
	public Boolean getIsDelete( ) {
	
		return isDelete;
	}


	
	public void setIsDelete( Boolean isDelete ) {
	
		this.isDelete = isDelete;
	}

	


}
