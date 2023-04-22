package in.nareshit.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.entity.Product;
import in.nareshit.repository.ProductRepository;

@Component
public class BasicOperations implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		// 1. ------------save-----------
		System.out.println("Runner Executed!");
		productRepository.save(new Product("Ganesh Ji", 55.55, "Yellow"));
		productRepository.save(new Product("Ramesh Ji", 66.66, "Pink"));
		productRepository.save(new Product("Suresh Ji", 77.77, "Green"));
		productRepository.save(new Product("Rajesh Ji", 88.88, "Purple"));

		// 2. ----------------find--------------

		Optional<Product> p = productRepository.findById(4);
		if (p.isPresent()) {
			System.out.println(p.get());
		} else {
			System.out.println("Data Not Found!");
		}
		// 3. -------------------delete---------
		// 3.1 Delete by specific Id 
		//productRepository.deleteById(2);
		//3.2 Delete all Rows one by
		// one in (Sequence order) 
		//productRepository.deleteAll(); //Multiple Query fired No of record = no of Query 
		//3.3 Delete all rows in Batch (Single Query fired)
		productRepository.deleteAllInBatch();

	}

}
