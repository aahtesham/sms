/**
 * @Project : 
 * @Package : com.tgi.safeher.entity.base
 * @FileName : BaseEntity.java
 * 
 *           Copyright � 2016 Trans-Atlantic Business Solutions, All rights
 *           reserved.
 * 
 */

package com.codeshark.sms.domain.base;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Transient;


public class BaseEntity extends BaseModel {


	private Short		isDeleted;

	private Timestamp	createdDate;
	private Long		createdBy;

	private Timestamp	updatedDate;
	private Long		updatedBy;
	
	private Long 		loginSessionId;
	
		


	@Transient
	@Column( name = "is_deleted" )
	public Short getIsDeleted( ) {
	
		return isDeleted;
	}


	
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted( Short isDeleted ) {
	
		this.isDeleted = isDeleted;
	}


	
	/**
	 * @return the createdDate
	 */
	@Transient
	@Column( name = "created_date", length = 23 )
	public Timestamp getCreatedDate( ) {
	
		return createdDate;
	}


	
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate( Timestamp createdDate ) {
	
		this.createdDate = createdDate;
	}


	
	/**
	 * @return the createdBy
	 */
	@Transient
	@Column( name = "created_by", precision = 11, scale = 0 )
	public Long getCreatedBy( ) {
	
		return createdBy;
	}


	
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy( Long createdBy ) {
	
		this.createdBy = createdBy;
	}


	
	/**
	 * @return the updatedDate
	 */
	@Transient
	@Column( name = "updated_date", length = 23 )
	public Timestamp getUpdatedDate( ) {
	
		return updatedDate;
	}


	
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate( Timestamp updatedDate ) {
	
		this.updatedDate = updatedDate;
	}


	
	/**
	 * @return the updatedBy
	 */
	@Transient
	@Column( name = "updated_by", precision = 11, scale = 0 )
	public Long getUpdatedBy( ) {
	
		return updatedBy;
	}


	
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy( Long updatedBy ) {
	
		this.updatedBy = updatedBy;
	}


	
	/**
	 * @return the updatedBy
	 */
	@Transient
	@Column( name = "login_session_id", precision = 9, scale = 0 )
	public Long getLoginSessionId( ) {
	
		return loginSessionId;
	}



	
	/**
	 * @param loginSessionId the loginSessionId to set
	 */
	public void setLoginSessionId( Long loginSessionId ) {
	
		this.loginSessionId = loginSessionId;
	}
	
	
	

}
