package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String name;
    @JsonProperty
    private String quantity;
    @JsonProperty
    private String unit_price;
    @JsonProperty
    private String discount;
    @JsonProperty
    private String product_location;
    @JsonProperty
    private String product_type;
    @JsonProperty
    private String minimum_order;
    @JsonProperty
    private String minimum_discount_order;
    @JsonProperty
    private String maximum_order;
    @JsonProperty
    private String type;
    @JsonProperty
    private String individual_weight;
    @JsonProperty
    private String length;
    @JsonProperty
    private String breath;
    @JsonProperty
    private String height;
    @JsonProperty
    private String volume;
    @JsonProperty
    private String bulkweight;
    @JsonProperty
    private String production_date;
    @JsonProperty
    private String arrival_date;
    @JsonProperty
    private String arrival_time;
    @JsonProperty
    private String expiry_data;
    @JsonProperty
    private String color;
    @JsonProperty
    private String category;
    @JsonProperty
    private String common_name;
    @JsonProperty
    private String version;
    @JsonProperty
    private String manufacturers_name;
    @JsonProperty
    private String batch_number;
    @JsonProperty
    private String iso_number;
    @JsonProperty
    private String product_line;
    @JsonProperty
    private String sku;
    @JsonProperty
    private String production_time;
    @JsonProperty
    private String production_number;
    @JsonProperty
    private String firstpicture;
    @JsonProperty
    private String secondpicture;
    @JsonProperty
    private String thirdpicture;
    @JsonProperty
    private String fouthpicture;
    @JsonProperty
    private String fifthpicture;
    @JsonProperty
    private String sixturepicture;
    @JsonProperty
    private String seventhpicture;
    @JsonProperty
    private String eigthpicture;
    @JsonProperty
    private String ninthpicture;

    protected Products(){}  // for JPA
}
