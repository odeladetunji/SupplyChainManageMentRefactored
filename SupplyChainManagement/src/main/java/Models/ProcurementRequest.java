package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ProcurementRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String product;
    @JsonProperty
    private String quantity;
    @JsonProperty
    private String branchAddress;
    @JsonProperty
    private String branchCity;
    @JsonProperty
    private String branchLocalGov;
    @JsonProperty
    private String branchState;
    @JsonProperty
    private String country;
    @JsonProperty
    private String date;
    @JsonProperty
    private String time;
    @JsonProperty
    private String status;
    @JsonProperty
    private String branchManager;
    @JsonProperty
    private Long telephone;
    @JsonProperty
    private Long price;
    @JsonProperty
    private Long netPrice;

    protected ProcurementRequest(){}
}
