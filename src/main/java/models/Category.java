package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Category response POJO.
 * Note getters, setters, builder and constructors are implemented by Lombok.
 *
 */

@Data
public class Category {

    @JsonProperty("CategoryId")
    private String categoryId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;

    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;

    @JsonProperty("CanRelist")
    private Boolean canRelist;

    @JsonProperty("LegalNotice")
    private String legalNotice;

    @JsonProperty("DefaultDuration")
    private int defaultDuration;

    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations;

    @JsonProperty("Fees")
    private Fees fees;

    @JsonProperty("FreePhotoCount")
    private int freePhotoCount;

    @JsonProperty("MaximumPhotoCount")
    private int maximumPhotoCount;

    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;

    @JsonProperty("Promotions")
    private List<Promotion> promotions;

    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions;

    @JsonProperty("MaximumTitleLength")
    private int maximumTitleLength;

    @JsonProperty("AreaOfBusiness")
    private int areaOfBusiness;

    @JsonProperty("DefaultRelistDuration")
    private int defaultRelistDuration;

    @JsonProperty("CanUseCounterOffers")
    private Boolean canUseCounterOffers;

}
