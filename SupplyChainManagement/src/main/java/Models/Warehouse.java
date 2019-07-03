package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String city;
    @JsonProperty
    private String localgovernment;
    @JsonProperty
    private String address;
    @JsonProperty
    private String wareHouseName;
    @JsonProperty
    private String item;
    @JsonProperty
    private String remainingQuantity;
    @JsonProperty
    private String assetValue;
    @JsonProperty
    private String totalAssetValue;
    @JsonProperty
    private String country;
    @JsonProperty
    private String state;
    @JsonProperty
    private Long telephone;
    @JsonProperty
    private String email;
    @JsonProperty
    private Long quantity_added;
    @JsonProperty
    private Long quantity_substracted;

    protected Warehouse(){}

    public Warehouse(Long id, String identity, String city, String localgovernment,
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
        this.quantity_substracted = quantity_subtracted;
    }
}
