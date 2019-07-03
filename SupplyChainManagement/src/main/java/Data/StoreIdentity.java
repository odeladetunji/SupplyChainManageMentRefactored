package Data;

public class StoreIdentity {

     Long id;
     String identity;
     String branchAddress;
     String branchCity;
     String branchName;
     String branchManager;
     Long telephone;
     String productName;
     String quantityRemaining;
     Long assetValue;
     String state;
     String localgovernment;
     String country;
     String email;

     public StoreIdentity(Long id, String identity, String branchAddress, String branchCity, String branchManager,
            Long telephone, String branchName, String productName, String  quantityRemaining,
            Long assetValue, String state, String localgovernment, String country,
            String email){

        this.id = id;
        this.identity = identity;
        this.branchAddress = branchAddress;
        this.branchCity = branchCity;
        this.branchManager = branchManager;
        this.branchName = branchName;
        this.telephone = telephone;
        this.productName = productName;
        this.quantityRemaining = quantityRemaining;
        this.assetValue = assetValue;
        this.state = state;
        this.localgovernment = localgovernment;
        this.country = country;
        this.email = email;
    }
}
