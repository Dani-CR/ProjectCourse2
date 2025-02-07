import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2025-02-06T03:16:10.323+01:00[Europe/Rome]
 * <br>
*  The generated test suite contains 11 tests
 * <br>
*  Covered targets: 22
 * <br>
*  Used time: 0h 5m 0s
 * <br>
*  Needed budget for current results: 3%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test(timeout = 60000)
    public void test_0() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/costfuns/460/Wpj")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("10"));
    }
    
    
    @Test(timeout = 60000)
    public void test_1() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/dateparse/2PfQJPpzu8PZ/HFcdm0K5uyfQaL")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/ordered4/GY0bW03lwRN8bOZn/Z89pXEO8/Y/IQSwHUa6g_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("unordered"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/filesuffix/9AmWy_8GcY4soO/WiKf83CCszot1")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_4() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/text2txt/ghRRt6q9zWx1M6a/tCJelUGuUg9KZkX/VqiQUFoDz")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/notypevar/76/pdMQD_wCsmHT3e")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("3"));
    }
    
    
    @Test(timeout = 60000)
    public void test_6() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/cookie/jYNRNLtbiR/dQIVweyfA/NK4K2")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_7() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/pat/_qJvNaIeR/rwdRUeuyJ")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_8() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/pat/x8GBblLD2bez7x")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("none"));
    }
    
    
    @Test(timeout = 60000)
    public void test_9() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/title/pDhYnh_kS/WHsaPJu")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_10() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/calc/FwW/0.7171002555394363/0.2759999335932637")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.0"));
    }


}
