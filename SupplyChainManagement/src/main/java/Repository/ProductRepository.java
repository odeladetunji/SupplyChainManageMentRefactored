package Repository;

import Models.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Products, Long> {
    List<Products> getAperticularProduct(Long id);
    List<Products> findAll();
}
