package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class QuickStarts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private String identity;
    @JsonProperty
    private String visitors;
    @JsonProperty
    private String totalSalesYesterday;
    @JsonProperty
    private String dailyEarnings;

    protected QuickStarts(){}
}
