package Nagarro.ApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class goRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step1-Defining a base URL
				RestAssured.baseURI = "https://gorest.co.in/";
				
				//Step2-Creating a REST request
				 RequestSpecification req = RestAssured.given();
				 
				//step3-Defining Parameter
				 
				//step4-Hitting the req with http method
				 //  Response res = req.header("Accept", "application/json")
		           //        .header("Content-Type", "application/json")
		           //        .when().get("/public/v2/users");
		           
				   
				//   step4-Hitting the req with http method
				   Response res = req.header("Accept", "application/json")
		                   .header("Content-Type", "application/json")
		                   .when().delete("/public/v2/users/8");
		           res.prettyPeek();


	}

}
