package com.optigestion.CRUD.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public List<Requerimiento> getProducts() {
		return List.of( 
			new Requerimiento(
			1, "Product 1", "Description 1", 10.0, 100
			),
			new Requerimiento(
			1, "Product 2", "Description 2", 10.0, 100
			)
		);
	}
}
