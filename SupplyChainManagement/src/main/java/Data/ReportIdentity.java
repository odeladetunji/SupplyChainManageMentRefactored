package Data;

import lombok.Data;

@Data
public class ReportIdentity {

    private Long Id;
    private String branchName;
    private String branchIdentity;
    private String branchEmail;
    private String branchManager;
    private String branchAddress;
    private String branchCity;
    private String branchLocalGovernment;
    private String branchState;
    private String productName;
    private String quantitySold;
    private String quantityRemaining;
    private String unitPrice;
    private String tatalSales;
    private String discountedUnit;
    private String discountedSales;
    private String currentAsset;
    private String date;
    private String dateChecker;
    private String time;
    private String country;

    ReportIdentity(){

    }
}
