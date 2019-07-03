package Controllers;

import Models.Manager;
import Repository.ManagerRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
@EnableAutoConfiguration
public class Registration {
    ManagerRepository repository;
    Registration(ManagerRepository repository){
        this.repository = repository;
    }

    @PostMapping(value = "/managerRegistration")
    public boolean registerManager(@RequestBody Manager manager){
        try{
            repository.save(manager);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}


