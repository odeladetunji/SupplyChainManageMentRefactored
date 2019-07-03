package Controllers;

import Data.StoreIdentity;
import Models.OutletLogs;
import Models.Outlets;
import Repository.ManagerRepository;
import Repository.OutletsRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@ComponentScan
@EnableAutoConfiguration
@RestController
@Controller
public class Stores {
   private OutletsRepository repository;
   private ManagerRepository repo;
   private OutletsRepository outlets;
   OutletLogs [] logsContainer;

   //constructor
   Stores(OutletsRepository repository, ManagerRepository repo, OutletsRepository outlets){
       this.repository = repository;
       this.repo = repo;
       this.outlets = outlets;
   }

   private String getAllProductsQuantity(Long identity){
       return "something";
   }

   @GetMapping(value = "/storeIdentity")
   public TreeMap getAllStoreInfo(){

       TreeMap container = new TreeMap();

       Iterable<Outlets> storeinfo = repository.findAll();
       for (Outlets param : storeinfo){
          StoreIdentity aStore = new StoreIdentity(param.getId(),
                  param.getIdentity(), param.getBranchAddress(), param.getBranchCity(),
                  param.getBranchManager(), param.getTelephone(), param.getBranchName(),
                  param.getProductName(), param.getQuantityRemaining(), param.getAssetValue(),
                  param.getState(), param.getLocalgovernment(), param.getCountry(), param.getEmail()){
          };

          container.put("storeInfo", aStore);
          getAllProductsQuantity(param.getId());
       }

       return container;
   }

   public Iterable<Models.Registration> getAllManager(){
       Iterable<Models.Registration> managers = repo.findAll();
       return managers;
   }
}
