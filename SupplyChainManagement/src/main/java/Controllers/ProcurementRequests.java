package Controllers;

import Data.ProcurementRequestIdentity;
import Models.ProcurementRequest;
import Repository.ProcurementRequestRepository;
import Reusable.EndPoints;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan
@EnableAutoConfiguration
@RestController
@Controller
public class ProcurementRequests {
    EndPoints endPoints;

    @PostMapping(value = "/procurementRequest")
    public Boolean Request(@RequestBody ProcurementRequestIdentity procure){
        endPoints.procurementRequest(procure);
        return true;
    }
}


