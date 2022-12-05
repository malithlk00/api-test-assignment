package core;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestService {

    Response response;

    /**
     * common wrapper method for all the rest assured GET calls with
     * Content Type, Endpoint URL
     *
     *@param contentType       Content type for the request
     *@param strURL               End point of the request
     */
    public Response performGETRequest(ContentType contentType, String strURL) {

        response = RestAssured.given().relaxedHTTPSValidation().contentType(contentType).when().get(strURL);
        return response;
    }


    /**
     * common wrapper method for all the rest assured POST calls with
     * Content Type, Endpoint URL and Request body as String
     *
     *@param contentType       Content type for the request
     *@param strURL               End point of the request
     *@param strJsonBody       Request body for the request
     */
    public Response performPOSTRequest(ContentType contentType, String strURL, String strJsonBody) {

        response = RestAssured.given().relaxedHTTPSValidation().contentType(contentType).body(strJsonBody).when().post(strURL);
        return response;
    }
}
