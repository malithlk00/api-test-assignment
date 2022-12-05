package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Promotions response POJO.
 * Note getters, setters, builder and constructors are implemented by Lombok.
 *
 */
@Data
public class Promotion {
    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Price")
    private double price;

    @JsonProperty("MinimumPhotoCount")
    private int minimumPhotoCount;

    @JsonProperty("OriginalPrice")
    private double originalPrice;

    @JsonProperty("Recommended")
    private boolean recommended;
}
