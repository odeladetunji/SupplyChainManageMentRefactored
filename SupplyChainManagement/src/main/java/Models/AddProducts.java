package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class AddProducts {

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
     private String net_price;
     @JsonProperty
     private String discount;
     @JsonProperty
     private String type;
     @JsonProperty
     private String individual_weight;
     @JsonProperty
     private String production_date;
     @JsonProperty
     private String arrival_date;
     @JsonProperty
     private String expiry_date;
     @JsonProperty
     private String color;
     @JsonProperty
     private String category;
     @JsonProperty
     private String common_name;
     @JsonProperty
     private String version;
     @JsonProperty
     private String manufactures_name;
     @JsonProperty
     private String batch_number;
     @JsonProperty
     private String iso_number;
     @JsonProperty
     private String product_line;

     protected AddProducts(){}
}
