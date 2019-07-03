package Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductsIdentity {
    private Long id;
    @JsonProperty
    private String identity;
    private String name;
    private String quantity;
    private String unit_price;
    private String discount;
    private String product_location;
    private String product_type;
    private String minimum_order;
    private String minimum_discount_order;
    private String maximum_order;
    private String type;
    private String individual_weight;
    private String length;
    private String breath;
    private String height;
    private String volume;
    private String bulkweight;
    private String production_data;
    private String arrival_date;
    private String arrival_time;
    private String expiry_date;
    private String color;
    private String category;
    private String common_name;
    private String version;
    private String manufacturers_name;
    private String batch_number;
    private String iso_number;
    private String product_line;
    private String sku;
    private String production_time;
    private String production_number;
    private String firstpicture;
    private String secondpicture;
    private String thirdpicture;
    private String fouthpicture;
    private String fifthpicture;
    private String sixturepicture;
    private String seventhpicture;
    private String eigthpicture;
    private String ninthpicture;

    public ProductsIdentity(Long id, String identity, String name, String quantity, String unit_price,
                            String discount, String products_location, String product_type, String minimum_order,
                            String minimum_discount_order, String maximum_order, String type, String individual_weight,
                            String length, String breath, String height, String volume, String bulkweight, String production_data,
                            String arrival_date, String arrival_time, String expiry_date, String color, String category, String common_name,
                            String version, String manufacturers_name, String batch_number, String iso_number, String product_line,
                            String sku, String production_time, String production_number, String firstpicture,
                            String secondpicture, String thirdpicture, String fouthpicture, String fifthpicture,
                            String sixturepicture, String seventhpicture, String eigthpicture,
                            String ninthpicture){
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.quantity = quantity;
        this.unit_price = unit_price;
        this.discount = discount;
        this.product_location = products_location;
        this.product_type = product_type;
        this.minimum_order = minimum_order;
        this.minimum_order = minimum_discount_order;
        this.maximum_order = maximum_order;
        this.type = type;
        this.individual_weight = individual_weight;
        this.length = length;
        this.breath = breath;
        this.height = height;
        this.volume = volume;
        this.bulkweight = bulkweight;
        this.production_data = production_data;
        this.arrival_date = arrival_date;
        this.arrival_time = arrival_time;
        this.expiry_date = arrival_date;
        this.color = color;
        this.category = category;
        this.common_name = common_name;
        this.expiry_date = expiry_date;
        this.version = version;
        this.manufacturers_name = manufacturers_name;
        this.batch_number = batch_number;
        this.iso_number = iso_number;
        this.product_line = product_line;
        this.sku = sku;
        this.production_time = production_time;
        this.production_number = production_number;
        this.firstpicture = firstpicture;
        this.secondpicture = secondpicture;
        this.thirdpicture = thirdpicture;
        this.fouthpicture = fouthpicture;
        this.fifthpicture = fifthpicture;
        this.sixturepicture = sixturepicture;
        this.seventhpicture = seventhpicture;
        this.eigthpicture = eigthpicture;
        this.ninthpicture = ninthpicture;
    }
}
