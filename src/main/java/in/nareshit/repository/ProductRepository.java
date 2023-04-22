package in.nareshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nareshit.entity.Product;
@Repository //Optional
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
