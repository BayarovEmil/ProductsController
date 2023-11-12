package kodlamaio.northwind.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buissness.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/database")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
