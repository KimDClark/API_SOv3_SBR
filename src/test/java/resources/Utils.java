package resources;

import bdd.oAuth;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Utils {

    RequestSpecification reqSpec;

    //Get the Global Variable from the Global Properties File
    public static String getGlobalValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\IntelliJ_Workspace\\API_SOv3_SBR\\src\\test\\java\\resources\\global.properties");
        prop.load(fis);
        return prop.getProperty(key);
    }

    //Build the API Request URL that can be used by ALL Feature Files - created once only
    public RequestSpecification requestSpecification() throws IOException {

        if (reqSpec == null) {
            PrintStream log = new PrintStream(Files.newOutputStream(Paths.get("logging.txt")));
            String accessToken = oAuth.main();
            reqSpec = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURI"))
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .addHeader("client_id", getGlobalValue("client_id"))
                    .addHeader("Authorization", accessToken)
                    .addHeader("Cache-Control", "no-cache")
                    .build();
        }
        return reqSpec;
    }
}
