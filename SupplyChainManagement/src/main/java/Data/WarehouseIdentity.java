package Data;


public class WarehouseIdentity {
    private Long Id;
    private String identity;
    private String city;
    private String localgovernment;
    private String address;
    private String wareHouseName;
    private String item;
    private String remainingQuantity;
    private String assetValue;
    private String totalAssetValue;
    private String country;
    private String state;
    private Long telephone;
    private String email;
    private Long quantity_added;
    private Long quantity_subtracted;


    public WarehouseIdentity(Long id, String identity, String city, String localgovernment,
                             String address, String wareHouseName, String item,
                             String remainingQuantity, String assetValue, String totalAssetValue,
                             String country, String state, Long telephone, String email,
                             Long quantity_added, Long quantity_subtracted){
        this.Id = id;
        this.identity = identity;
        this.city = city;
        this.localgovernment = localgovernment;
        this.address = address;
        this.wareHouseName = wareHouseName;
        this.item = item;
        this.remainingQuantity = remainingQuantity;
        this.assetValue = assetValue;
        this.totalAssetValue = totalAssetValue;
        this.country = country;
        this.state = state;
        this.telephone = telephone;
        this.email = email;
        this.quantity_added = quantity_added;
        this.quantity_subtracted = quantity_subtracted;

    }
}
