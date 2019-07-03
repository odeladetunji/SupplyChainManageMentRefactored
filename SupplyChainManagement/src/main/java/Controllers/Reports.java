package Controllers;

import Reusable.EndPoints;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@EnableAutoConfiguration
@RestController
@ComponentScan
public class Reports {
    EndPoints endPoints;

    @PostMapping(value = "/submitReport")
    public boolean submitReport(@RequestBody Models.Reports reports){
        return endPoints.submitReport(reports);
    }

    @GetMapping(value = "/getAllReports")
    public List<Models.Reports> LastReports(){
        Iterable<Models.Reports> result = endPoints.lastReports();
        return ((List<Models.Reports>) result);
    }

    @GetMapping(path = "/missingReports")
    public List<Models.Reports> missingReports(){

    }

    @GetMapping(value = "/reportHistory")
    public List<Models.Reports> reportHistory(@RequestBody Models.Reports reports){

    }

    @GetMapping(path = "/reportHistoryOld")
    public List<Models.Reports> reportHistoryIsGreater(@RequestBody Models.Reports report){

    }

    @GetMapping(path = "/reportHistoryIsLessDan")
    public List<Models.Reports> reportHistoryIsLessDan(@RequestBody Models.Reports report){

    }

    @GetMapping(path = "/reportHistoryRange")
    public List<Models.Reports> reportHistoryRange(@RequestBody Models.Reports report){

    }

    @GetMapping(path = "/specificStoreReportHistory")
    public List<Models.Reports> specificStoreReportHistory(@RequestBody Models.Reports report){

    }
}
