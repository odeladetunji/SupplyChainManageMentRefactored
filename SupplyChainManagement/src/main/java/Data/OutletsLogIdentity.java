package Data;

import Models.OutletLogs;
import lombok.Data;

@Data
public class OutletsLogIdentity extends OutletLogs {
    private Long id;
    private String identity;
    private String branchAddress;
    private String branchCity;
    private String branchName;
    private String branchManager;
    private Long telephone;
    private String productName;
    private String quantityRemaining;
    private Long assetValue;
    private String state;
    private String status;
    private String localgovernment;
    private String country;
    private String email;

    // Constructor
    public OutletsLogIdentity(Long Id, String identity, String branchAddress, String branchCity,
                       String branchName, String branchManager, Long telephone,
                       String productName, String quantityRemaining, Long assetValue,
                       String state, String status, String localgovernment, String country,
                       String email){
          this.id = Id;
          this.identity = identity;
          this.branchAddress = branchAddress;
          this.branchCity = branchCity;
          this.branchName = branchName;
          this.branchManager = branchManager;
          this.telephone = telephone;
          this.productName = productName;
          this.quantityRemaining = quantityRemaining;
          this.assetValue = assetValue;
          this.state = state;
          this.status = status;
          this.localgovernment = localgovernment;
          this.country = country;
    }
}
