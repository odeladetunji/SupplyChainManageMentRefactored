package Repository;

import Models.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Products, Long> {
    List<Products> findAllBy();
}
