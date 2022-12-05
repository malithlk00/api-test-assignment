package step_definitions;

import constants.EndpointsPaths;
import core.RestService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Category;
import models.Promotion;
import org.testng.Assert;

import java.text.MessageFormat;

public class CategoryDetailsStep {

    static Response response;
    RestService restService = new RestService();

    Category category;

    @When("I get the category details of {string}")
    public void i_get_the_category_details_of(String categoryID) {

        if(categoryID == null || categoryID.isEmpty() || categoryID.trim().isEmpty()) {
            throw new IllegalArgumentException("Category ID cannot be empty or null !!");
        }

        String pathURL = MessageFormat.format(EndpointsPaths.GET_CATEGORY,categoryID);
        String URL =System.getProperty("baseURL")+ pathURL;

        response = restService.performGETRequest(ContentType.JSON, URL);

    }
    @Then("status code is {int}")
    public void status_code_is(Integer statusCode) {

        Assert.assertNotNull(statusCode, "status code cannot be null");
        Assert.assertEquals(response.getStatusCode(), statusCode,"the status code of response should be "+statusCode);

    }
    @Then("category name is {string}")
    public void category_name_is(String categoryName) {

        category = response.getBody().as(Category.class);
        Assert.assertNotNull(category, "category details can not be null");
        Assert.assertEquals(category.getName(), categoryName, "value of category name parameter should be "+categoryName);

    }
    @Then("canrelist is set to {string}")
    public void canrelist_is_set_to(String canrelist) {

        if (!"true".equalsIgnoreCase(canrelist) && !"false".equalsIgnoreCase(canrelist)) {
            throw new IllegalArgumentException("canRelist should be either true or false.");
        }
        Assert.assertEquals(category.getCanRelist().toString(), canrelist, "value of canrelist parameter in response should be "+canrelist);


    }
    @Then("promotion name {string} contains text {string}")
    public void promotion_name_contains_text(String promoName, String promoDescription) {

        if(promoName == null || promoName.isEmpty() || promoName.trim().isEmpty()) {
            throw new IllegalArgumentException("Promotion Name cannot be empty or null !!");
        }

        if(promoDescription == null || promoDescription.isEmpty() || promoDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Promotion Description cannot be empty or null !!");
        }
        for (Promotion promotion : category.getPromotions()) {
            if (promoName.equals(promotion.getName())) {
                Assert.assertTrue(promotion.getDescription().contains(promoDescription), "Promotion Name "+promoName+" should contain description "+promoDescription);
            }
        }

    }
}
