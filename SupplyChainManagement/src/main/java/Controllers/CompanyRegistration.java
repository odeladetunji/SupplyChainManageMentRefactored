package Controllers;

import Models.Login;
import Models.Registration;
import Repository.LoginRepository;
import Repository.RegistrationRepository;
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
@Controller
@EnableAutoConfiguration
@RestController
public class CompanyRegistration {

    private final RegistrationRepository repository;
    private final LoginRepository login;
    public EndPoints endPoints;

    //using dependency injection!
    CompanyRegistration(RegistrationRepository repository, LoginRepository login){
        this.repository = repository;
        this.login = login;
    }

    @PostMapping(value = "/CompanyRegistration")
    public Boolean RegisterCompany(@RequestBody Registration company){
        Iterable<Registration> result = repository.findDistinctByAdminEmail(company.getAdminEmail());
        int value = ((List<Registration>) result).size();
        boolean output = false;
        if (value != 1){
            output = true;
            repository.save(company);
        }

        return output;
    }

    @PostMapping(value = "/LoginCompany")
    public Boolean Login(@RequestBody Login user){
        List<Login> checkCredentials = login.checkCredentials(user.getUsername(), user.getPassword());
        return checkCredentials.isEmpty();
    }

    @GetMapping(value = "/test")
    public String hello(){
        return "test successfull";
    }
}






