package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static resources.APIResources.GetShippingOptions;

public class StepDefinitions {
    ResponseSpecification respSpec;
    RequestSpecification reqSpec;
    Response resp;
    TestDataBuild data = new TestDataBuild();

    @Given("The excel file name and location is given as")
    public void the_excel_file_name_and_location_is_given_as(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(dataTable);
    }















    //Shipping Options for SBR Size (Envelope Size)
    //Envelope Sizes:  DLE; C4; C5; FS; LF; PPDLE; PPC4; PPC5; PPFS; PPLF; Zonal
    //Across Town
    @Given("User has selected an {string} as the envelope Size with {string} {string} {string} {string} {string}")
    public void userHasSelectedAnAsTheEnvelopeSizeWith(String envelopeSize, String pickupSuburb, String pickupPostcode, String deliverySuburb,
                                                       String deliveryPostcode, String weight) throws IOException {
        respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        reqSpec = given().spec(data.envelopeSizeRequest(envelopeSize, pickupSuburb, pickupPostcode, deliverySuburb, deliveryPostcode, weight));
    }

    // Shipping options for Cuboid Inout (W, L & H)
    // Enter Dimensions:  height, length and width
    // Across Town
    @Given("User has selected Cuboid dimensions of {string}, {string} and {string} with {string} {string} {string} {string} {string}")
    public void userHasSelectedCuboidDimensionsOfAndWith(String height, String length, String width, String pickupSuburb, String pickupPostcode,
                                                         String deliverySuburb, String deliveryPostcode, String weight) throws IOException {
        respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        reqSpec = given().spec(data.cuboidDimRequest(height, length, width, pickupSuburb, pickupPostcode, deliverySuburb, deliveryPostcode, weight));
    }

    // Shipping options for Tube Input (D & L)
    // Enter Dimensions: diameter & length
    // Across Town

    @Given("User has selected Tube dimensions of {string} and {string} with {string} {string} {string} {string} {string}")
    public void userHasSelectedTubeDimensionsOfAndWith(String diameter, String length, String pickupSuburb, String pickupPostcode,
                                                       String deliverySuburb, String deliveryPostcode, String weight) throws IOException {
        respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        reqSpec = given().spec(data.tubeDimRequest(diameter, length, pickupSuburb, pickupPostcode, deliverySuburb, deliveryPostcode, weight));
    }

    //Calls the API using the URL created in Utils and TestDataBuild
    @When("user calls SOv3 API")
    public void user_calls_s_ov3_api() {

        APIResources resourceAPI = APIResources.valueOf(String.valueOf(GetShippingOptions));
        resp = reqSpec.when()
                .get(resourceAPI.getResource())
                .then()
                .spec(respSpec)
                .extract().response();
    }

    //Verification on the API Response - Expected Status Code of 200
    @Then("the API returns Shipping Options")
    public void the_api_returns_shipping_options() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(resp.getStatusCode(), 200);
    }

    //Verification on the API Response - The Success value is True
    @And("{string} in response body is {string}")
    public void inResponseBodyIs(String arg0, String arg1) {
        String response = resp.asString();
        JsonPath js = new JsonPath(response);
        assertEquals(js.get(arg0).toString(), arg1.toString());

    }


}
