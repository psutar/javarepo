package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String uuid;
	String name;
	String address;
	List<Discount> eligibleDiscount = new ArrayList<Discount>();
	List<PurchasedProduct> products = new ArrayList<PurchasedProduct>();
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Discount> getEligibleDiscount() {
		return eligibleDiscount;
	}
	public void setEligibleDiscount(List<Discount> eligibleDiscount) {
		this.eligibleDiscount = eligibleDiscount;
	}
	public List<PurchasedProduct> getProducts() {
		return products;
	}
	public void setProducts(List<PurchasedProduct> products) {
		this.products = products;
	}

}
