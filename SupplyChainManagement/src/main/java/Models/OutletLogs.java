package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class OutletLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String branchAddress;
    @JsonProperty
    private String branchCity;
    @JsonProperty
    private String branchName;
    @JsonProperty
    private String branchManager;
    @JsonProperty
    private Long telephone;
    @JsonProperty
    private String productName;
    @JsonProperty
    private String quantityRemaining;
    @JsonProperty
    private Long assetValue;
    @JsonProperty
    private String state;
    @JsonProperty
    private String status;
    @JsonProperty
    private String localgovernment;
    @JsonProperty
    private String country;
    @JsonProperty
    private String email;

    protected OutletLogs(){}
}
