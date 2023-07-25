package org.sp.app0724.openapi;

public class Store {
	private double lati;
	private double longi;
	private String addr;
	private String name;
	private String type;
	private String phone;
	private String main;
	/*
	{
		"경도": "127.0646503",
		"데이터기준일자": "2021-01-29",
		"소재지(도로명)": "서울특별시 광진구 동일로 114 (화양동)",
		"업소명": "(주)남원추어탕",
		"업태": "한식",
		"위도": "37.5426714",
		"전화번호": "02-498-8649",
		"주취급음식": "추어탕"
	}
	*/
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	
}
