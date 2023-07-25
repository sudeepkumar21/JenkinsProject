package Nagarro.ApiTesting;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqRes {
	@Test
	public void getRq() {
		
		//step1-Defining a base URL
		RestAssured.baseURI = "https://reqres.in/";
		//Step2-Creating a REST request
		 RequestSpecification req = RestAssured.given();
		 
		  HashMap<String, String> headers= new  HashMap<String, String>();
          headers.put("Accept", "application/json");
          headers.put("Content-Type", "application/json");
          
		//step3-Defining Parameter
		//step4-Hitting the req with http method
		  // Response res = req.header("Accept", "application/json")
               //    .header("Content-Type", "application/json")
                   
                   Response res=req.headers(headers)
                   .when().get("api/users");
           
           res.prettyPeek();


	}

}




