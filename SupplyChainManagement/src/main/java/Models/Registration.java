package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Registration {
    protected Registration(){}
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String password;
    @JsonProperty
    private String username;
    @JsonProperty
    private String companyname;
    @JsonProperty
    private String country;
    @JsonProperty
    private String city;
    @JsonProperty
    private String address;
    @JsonProperty
    private Long telephone1;
    @JsonProperty
    private Long telephone2;
    @JsonProperty
    private Long telephone3;
    @JsonProperty
    private String adminEmail;

}
