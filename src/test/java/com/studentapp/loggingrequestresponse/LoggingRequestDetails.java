package com.studentapp.loggingrequestresponse;

import com.studentapp.testbase.TestBase;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class LoggingRequestDetails extends TestBase {
    /**
     * This test will print out all the request headers
     */
    @Test
    public void test001() {
        System.out.println("---------------Printing Request Headers------------------");
        given().log().headers()
                .when()
                .get("/list")
                .then()
                .statusCode(200);
    }
    /**
     * This test will print out all the request Parameters
     */
    @Test
    public void test002() {
        System.out.println("---------------Printing Request Parameters------------------");
        HashMap<String, Object> qParams = new HashMap<>();
        qParams.put("programme", "Computer Science");
        qParams.put("limit", 2);
        given().log().parameters()
                /*.queryParam("programme", "Computer Science")
                .queryParam("limit", 2) */
                .queryParams(qParams)
                .when()
                .get("/list")
                .then().statusCode(200);
    }

    /**
     * This test will print out the Request body
     */
    @Test
    public void test003() {
        System.out.println("---------------Printing Request Body------------------");


    }

    /**
     * This test will print out All the details
     */
    @Test
    public void test004() {
        System.out.println("---------------Printing All the Request Details------------------");
    }


    /**
     * This test will print Request details if validation fails
     */
    @Test
    public void test005() {
        System.out.println("---------------Printing All the Request Details if validation fails------------------");
    }
}
