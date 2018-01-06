package com.codeshark.sms.commons.enumeration;

public enum BioMetricTypeEnum {

	Face(1), Vehical(1), Licence(2), Insuranse(3), Registration(4) ;
	private int value;
	
	BioMetricTypeEnum(int code) {
		this.value = code;
	}
	public int getValue( ) {

		return value;
	}
}
