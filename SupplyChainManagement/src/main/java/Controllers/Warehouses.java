package Controllers;

import Data.WarehouseIdentity;
import Models.Warehouse;
import Reusable.EndPoints;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ComponentScan
@EnableAutoConfiguration
@RestController
@Controller
public class Warehouses {
    EndPoints endPoints;
    @GetMapping(value = "/warehouseCheck")
   public List<Warehouse> CheckWareHouse(){
      return endPoints.checkWarehouses();
   }

   @PostMapping(value = "/addingProductToWarehoues")
   public boolean addProductToWareHouse(@RequestBody Warehouse product){
       return endPoints.addProductToWarehouse(product);
   }

   @PostMapping(value = "/subtractingProductFromWarehouse")
   public boolean subtractingProductFromWarehouse(@RequestBody Warehouse product){
        return endPoints.subtractProductFromWarehouse(product);
    }
}




