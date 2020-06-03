package com.erp.catalog.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/product")
	public Product createProduct(@RequestParam(value = "sku") String sku,
								@RequestParam(value = "name") String name,
								@RequestParam(value = "mrp") long mrp) {
		return new Product(counter.incrementAndGet(), sku, name, mrp);
	}
}
