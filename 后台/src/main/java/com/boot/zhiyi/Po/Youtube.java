package com.boot.zhiyi.Po;

public class Youtube {
	private Integer id;
	private String name;
	private String url;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Youtube( String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public Youtube() {
		super();
	}
	
	
}
