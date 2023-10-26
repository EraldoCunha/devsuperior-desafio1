package com.devsuperior.desafio1.entities;

public class Order {

	private Integer code;
	private Double basic;
	private Double Discount;
	
	public Order() {
	}

	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		Discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscount() {
		return Discount;
	}

	public void setDiscount(Double discount) {
		Discount = discount;
	}
}
