package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String firstname;
    @JsonProperty
    private String lastname;
    @JsonProperty
    private String email;
    @JsonProperty
    private String telephone;
    @JsonProperty
    private String city;
    @JsonProperty
    private String storeLocation;
    @JsonProperty
    private String storeName;

    protected Users(){}

}
