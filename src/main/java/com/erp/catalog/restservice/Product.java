package com.erp.catalog.restservice;

public class Product {
	private final long id;
	private final String sku;
	private final String name;
	private final long mrp;

	public Product(long id, String sku, String name, long mrp) {
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.mrp = mrp;
	}

	public long getId() {
		return id;
	}

	public String getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public long getMrp() {
		return mrp;
	}
	
}
