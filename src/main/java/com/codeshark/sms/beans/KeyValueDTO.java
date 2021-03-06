
package com.codeshark.sms.beans;

import com.codeshark.sms.beans.base.BaseDTO;



public class KeyValueDTO extends BaseDTO {

	public KeyValueDTO( ) {

		super( );
	}

	public KeyValueDTO( Long key, String value ) {

		super( );
		this.key = key;
		this.value = value;
	}
	
	/**
	 * @author Zeeshan Mirza
	 * @Constructor
	 * @param key
	 * @param value
	 * @param description
	 */
	public KeyValueDTO( Long key, String value, String description ) {

		this( key, value );
		this.description = description;
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 671142310898720441L;
	private Long				key;
	private String				value;
	private String				description;

	/**
	 * @return the key
	 */
	public Long getKey( ) {

		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey( Long key ) {

		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue( ) {

		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue( String value ) {

		this.value = value;
	}

	/**
	 * @return the description
	 */
	public String getDescription( ) {

		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription( String description ) {

		this.description = description;
	}

}
