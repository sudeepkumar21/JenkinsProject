package Nagarro.ApiTesting;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqPost {

	@Test
	public  void postRq() {
		// TODO Auto-generated method stub

		//step1-Defining a base URL
		RestAssured.baseURI = "https://reqres.in/";
		//Step2-Creating a REST request
		 RequestSpecification req = RestAssured.given();
		//step3-Defining Parameter
		 //Body
		 String data = "{\r\n"
                 + "    \"name\": \"morpheus\",\r\n"
                 + "    \"job\": \"leader\"\r\n"
                 + "}";
		
		//step4-Hitting the req with http method
		 //change method to post
		   Response res = req.header("Accept", "application/json")
                   .header("Content-Type", "application/json")
                   .body(data)
                   .when().post("api/users");
           
           res.prettyPeek();


	}
	@Test
	public  void putRq() {
		// TODO Auto-generated method stub

		//step1-Defining a base URL
		RestAssured.baseURI = "https://reqres.in/";
		//Step2-Creating a REST request
		 RequestSpecification req = RestAssured.given();
		//step3-Defining Parameter
		 //Body
		 String data = "{\r\n"
                 + "    \"name\": \"sudeep\",\r\n"
                 + "    \"job\": \"leader\"\r\n"
                 + "}";
		
		//step4-Hitting the req with http method
		 //change method to post
		   Response res = req.header("Accept", "application/json")
                   .header("Content-Type", "application/json")
                   .body(data)
                   .when().put("api/users/494");
           
           res.prettyPeek();


	}

}
