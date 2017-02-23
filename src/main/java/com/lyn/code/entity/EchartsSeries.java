package com.lyn.code.entity;

public class EchartsSeries {

	private String name;
	private String type;
	private int[] data;

	public EchartsSeries(String name, String type, int[] data) {
		super();
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

}
