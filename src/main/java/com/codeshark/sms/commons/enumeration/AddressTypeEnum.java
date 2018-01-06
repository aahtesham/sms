package com.codeshark.sms.commons.enumeration;

public enum AddressTypeEnum {

	Mailing(1),POBox(2),Residential(3);
	private int value;
	
	AddressTypeEnum(int code) {
		this.value = code;
	}
	public int getValue( ) {

		return value;
	}
	
}
