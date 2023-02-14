package resources;

import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestDataBuild extends Utils {
    Map<String, String> queryParams;

    //Populate the Query Parameters with the input from the Feature Test via the Step Definition - for SBR Size (envelope size)
    public RequestSpecification envelopeSizeRequest(String envelopeSize, String pickupSuburb, String pickupPostcode, String deliverySuburb, String deliveryPostcode,
                                                    String weight) throws IOException {

        queryParams = new HashMap<String, String>();
        queryParams.put("request_source", "retail");
        queryParams.put("delivery_country", "NZ");
        queryParams.put("envelope_size", envelopeSize);
        queryParams.put("pickup_suburb", pickupSuburb);
        queryParams.put("pickup_postcode", pickupPostcode);
        queryParams.put("delivery_suburb", deliverySuburb);
        queryParams.put("delivery_postcode", deliveryPostcode);
        queryParams.put("weight", weight);

        return requestSpecification().queryParams(queryParams);
    }

    //Populate the Query Parameters with the input from the Feature Test via the Step Definition - for Cuboid Dimensions (L, H & W)
    public RequestSpecification cuboidDimRequest(String height, String length, String width, String pickupSuburb, String pickupPostcode, String deliverySuburb,
                                                 String deliveryPostcode, String weight) throws IOException {
        queryParams = new HashMap<String, String>();
        queryParams.put("request_source", "retail");
        queryParams.put("delivery_country", "NZ");
        queryParams.put("height", height);
        queryParams.put("length", length);
        queryParams.put("width", width);
        queryParams.put("pickup_suburb", pickupSuburb);
        queryParams.put("pickup_postcode", pickupPostcode);
        queryParams.put("delivery_suburb", deliverySuburb);
        queryParams.put("delivery_postcode", deliveryPostcode);
        queryParams.put("weight", weight);

        return requestSpecification().queryParams(queryParams);
    }

    //Populate the Query Parameters with the input from the Feature Test via the Step Definition - for Tube Dimensions (D & H)
    public RequestSpecification tubeDimRequest(String diameter, String length, String pickupSuburb, String pickupPostcode, String deliverySuburb,
                                               String deliveryPostcode, String weight) throws IOException {
        queryParams = new HashMap<String, String>();
        queryParams.put("request_source", "retail");
        queryParams.put("delivery_country", "NZ");
        queryParams.put("diameter", diameter);
        queryParams.put("length", length);
        queryParams.put("pickup_suburb", pickupSuburb);
        queryParams.put("pickup_postcode", pickupPostcode);
        queryParams.put("delivery_suburb", deliverySuburb);
        queryParams.put("delivery_postcode", deliveryPostcode);
        queryParams.put("weight", weight);

        return requestSpecification().queryParams(queryParams);
    }
}
