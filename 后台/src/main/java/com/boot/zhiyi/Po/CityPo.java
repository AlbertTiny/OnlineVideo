package com.boot.zhiyi.Po;

public class CityPo {
	private Integer id;
	private Integer province_id;
	private String city_name;
	private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProvince_id() {
		return province_id;
	}
	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CityPo [id=" + id + ", province_id=" + province_id + ", city_name=" + city_name + ", description="
				+ description + "]";
	}
	
}
