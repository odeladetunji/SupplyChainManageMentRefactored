package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @JsonProperty
    private String branchName;
    @JsonProperty
    private String branchIdentity;
    @JsonProperty
    private String branchEmail;
    @JsonProperty
    private String branchManager;
    @JsonProperty
    private String branchAddress;
    @JsonProperty
    private String branchCity;
    @JsonProperty
    private String branchLocalGovernment;
    @JsonProperty
    private String branchState;
    @JsonProperty
    private String productName;
    @JsonProperty
    private String quantitySold;
    @JsonProperty
    private String quantityRemaining;
    @JsonProperty
    private String unitPrice;
    @JsonProperty
    private String totalSales;
    @JsonProperty
    private String status;
    @JsonProperty
    private String discountedUnit;
    @JsonProperty
    private String discountedSales;
    @JsonProperty
    private String currentAsset;
    @JsonProperty
    private String date;
    @JsonProperty
    private String time;
    @JsonProperty
    private String country;

    protected Reports(){}

    public Reports(Long id, String branchName, String branchIdentity, String branchEmail,
                   String branchManager, String branchAddress, String branchCity, String branchLocalGovernment,
                   String branchState, String productName, String quantitySold, String quantityRemaining,
                   String unitPrice, String totalSales, String discountedUnit, String discountedSales,
                   String currentAsset, String date, String time, String country){

        this.Id = id;
        this.branchName = branchName;
        this.branchIdentity = branchIdentity;
        this.branchEmail = branchEmail;
        this.branchManager = branchManager;
        this.branchAddress = branchAddress;
        this.branchCity = branchCity;
        this.branchLocalGovernment = branchLocalGovernment;
        this.branchState = branchState;
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.quantityRemaining = quantityRemaining;
        this.unitPrice = unitPrice;
        this.totalSales = totalSales;
        this.discountedUnit = discountedUnit;
        this.discountedSales = discountedSales;
        this.currentAsset = currentAsset;
        this.date = date;
        this.time = time;
        this.country = country;
    }
}
