package bdd;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class oAuth {

    public static String main() {

        // TODO Remove the Client ID and Secret
        //String client_ID = "9260956ce78a4b4897380394c2277b00";
        //String client_Secret = "C1a0b7f1002C419Aa60af698884F8b27";
        String client_ID = "ab84e3dfead847d6bdba44b3ae39409f";
        String client_Secret = "d247963E2c5e4eEE916861a2f3Aadb18";
        String client_ID_SF = "6dd13be1ee6e422ba824dc64f64b042d";
        String client_Secret_SF = "46f43F0575BF4547B7834F05F436510b";

        String response = given().queryParams("client_id", client_ID)
                .queryParams("client_secret", client_Secret)
                .queryParams("grant_type", "client_credentials")
                .when()
                .post("https://oauth.nzpost.co.nz/as/token.oauth2").asString();

        JsonPath js = new JsonPath(response);
        String accessToken = js.getString("access_token");
        //System.out.println(accessToken);

        accessToken = "Bearer " + accessToken;

        return accessToken;
    }

}
