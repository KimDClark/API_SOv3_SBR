package MuleSoft;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class oAuth {

    public static String main() {
        String response = given().queryParams("client_id", getGlobalValue("client_id"))
                .queryParams("client_secret", getGlobalValue("client_secret"))
                .queryParams("grant_type", "client_credentials")
                .when()
                .post("https://oauth.nzpost.co.nz/as/token.oauth2").asString();

        JsonPath js = new JsonPath(response);
        String accessToken = js.getString("access_token");
        System.out.println(accessToken);

        accessToken = "Bearer " + accessToken;

        return accessToken;
    }

}
