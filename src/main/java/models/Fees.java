package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Fees response POJO.
 * Note getters, setters, builder and constructors are implemented by Lombok.
 *
 */
@Data
public class Fees {

    @JsonProperty("Bundle")
    private double bundle;

    @JsonProperty("EndDate")
    private double endDate;

    @JsonProperty("Feature")
    private double feature;

    @JsonProperty("Gallery")
    private double gallery;

    @JsonProperty("Listing")
    private double listing;

    @JsonProperty("Reserve")
    private double reserve;

    @JsonProperty("Subtitle")
    private double subtitle;

    @JsonProperty("TenDays")
    private double tenDays;

    @JsonProperty("SecondCategory")
    private double secondCategory;

    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTiers> listingFeeTiers;
}
