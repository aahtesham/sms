package com.codeshark.sms.commons.enumeration;

public enum AppUserTypeEnum {
	Student(1), Teacher(2);
		           
	private int value;

	AppUserTypeEnum(int code) {
		this.value = code;
	}

	public int getValue() {

		return value;
	}
}
