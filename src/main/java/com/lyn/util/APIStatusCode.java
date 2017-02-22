package com.lyn.util;

/**
 * api status code and msg
 * 
 * @author Liu Yuning
 *
 */
public enum APIStatusCode {

	/**
	 * success
	 */
	SUCCESS("200", "success!"),

	/**
	 * invalid input
	 */
	INVALID_INPUT("461", "invalid input!"),

	/**
	 * input too large
	 */
	INPUT_TOO_LARGE("462", "the input value is too large!"),

	/**
	 * unknown error
	 */
	UNKNOWN_ERROR("499", "unknown error...");

	private String apiResultCode;
	private String apiResultMsg;

	private APIStatusCode(String apiResultCode, String apiResultMsg) {
		this.apiResultCode = apiResultCode;
		this.apiResultMsg = apiResultMsg;
	}

	public String apiResultCode() {
		return apiResultCode;
	}

	public String apiResultMsg() {
		return apiResultMsg;
	}

}
