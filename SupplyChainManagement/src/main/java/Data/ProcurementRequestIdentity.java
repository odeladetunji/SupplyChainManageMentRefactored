package Data;


import Models.OutletLogs;
import lombok.Data;

@Data
public class ProcurementRequestIdentity extends OutletLogs {

    private Long Id;
    private String identity;
    private String product;
    private String quantity;
    private String branchAddress;
    private String branchCity;
    private String branchLocalGov;
    private String branchState;
    private String country;
    private String date;
    private String time;
    private String status;
    private String branchManager;
    private Long telephone;
    private Long price;
    private Long netPrice;

    public ProcurementRequestIdentity(Long id, String Identity, String product, String quantity,
                                      String branchAddress, String branchCity, String branchLocalGov,
                                      String branchState, String country, String date, String time,
                                      String status, String branchManager, Long telephone, Long price,
                                      Long netPrice){
        this.Id = id;
        this.identity = Identity;
        this.product = product;
        this.quantity = quantity;
        this.branchAddress = branchAddress;
        this.branchCity = branchCity;
        this.branchLocalGov = branchLocalGov;
        this.branchState = branchState;
        this.country = country;
        this.date = date;
        this.time = time;
        this.status = status;
        this.branchManager = branchManager;
        this.telephone = telephone;
        this.price = price;
        this.netPrice = netPrice;
    }
}
