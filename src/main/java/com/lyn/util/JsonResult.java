package com.lyn.util;

/**
 * format api return result
 * 
 * @author Liu Yuning
 *
 */
public class JsonResult {

	private String code;
	private String msg;
	private Object obj;

	public JsonResult(APIStatusCode apiStatusCode, Object obj) {
		this.setCode(apiStatusCode);
		this.setMsg(apiStatusCode);
		this.setObj(obj);
	}

	public String getCode() {
		return code;
	}

	public void setCode(APIStatusCode apiStatusCode) {
		this.code = apiStatusCode.apiResultCode();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(APIStatusCode apiStatusCode) {
		this.msg = apiStatusCode.apiResultMsg();
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
