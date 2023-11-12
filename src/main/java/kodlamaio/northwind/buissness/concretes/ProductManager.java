package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.ProductService;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
@Service
public class ProductManager implements ProductService{
	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}	
}
