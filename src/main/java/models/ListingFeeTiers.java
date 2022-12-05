package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * ListingFeeTiers response POJO.
 * Note getters, setters, builder and constructors are implemented by Lombok.
 *
 */
@Data
public class ListingFeeTiers {

    @JsonProperty("MinimumTierPrice")
    private double minimumTierPrice;

    @JsonProperty("FixedFee")
    private double fixedFee;
}