package Controllers;

import Data.ProductsIdentity;
import Models.Registration;
import Reusable.EndPoints;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@ComponentScan
@EnableAutoConfiguration
@RestController
@Controller
public class Products {
    EndPoints endPoints;
    @GetMapping(value = "/products")
    public List<ProductsIdentity> getAllProducts(){
        return endPoints.getAllProducts();
    }
}












