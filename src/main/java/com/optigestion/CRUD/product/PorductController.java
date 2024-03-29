package com.optigestion.CRUD.product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/products")
public class PorductController {
    
	private final ProductService productService;

    @Autowired
    public PorductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping
    public List<Requerimiento> getProducts() {
        return productService.getProducts();
    }

}
