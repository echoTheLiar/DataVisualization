package com.lyn.code.entity;

public class TestEntity {

	private final long code;
	private final String msg;

	public TestEntity(long code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public long getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
