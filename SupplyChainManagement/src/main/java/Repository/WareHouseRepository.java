package Repository;

import Models.Warehouse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WareHouseRepository extends CrudRepository<Warehouse, Long> {
    List<Warehouse> findWarehouseByItemEquals();
    List<Warehouse> findByItemOrderByIdDesc(String item);
    List<Warehouse> findDistinctByCityOrderByIdDesc();
    List<Warehouse> findByCityAndItem(String city, String item);
    List<Warehouse> findDistinctByCity();
}
