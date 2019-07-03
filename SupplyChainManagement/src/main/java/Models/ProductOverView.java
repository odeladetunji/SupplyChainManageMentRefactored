package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ProductOverView {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String productName;
    @JsonProperty
    private Long remainingQuantity;
    @JsonProperty
    private Long unitPrice;
    @JsonProperty
    private Long netPrice;
    @JsonProperty
    private Long netAsset;
    @JsonProperty
    private Long totalAssetValue;

    protected ProductOverView(){}
}
