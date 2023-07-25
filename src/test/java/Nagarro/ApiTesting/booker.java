package Nagarro.ApiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class booker {
	@Test
	public void token() {
		// TODO Auto-generated method stub
		//step1-Defining a base URL
		//step1-Defining a base URL
				RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
				//Step2-Creating a REST request
				 RequestSpecification request= RestAssured.given();
				
				//Step2-Creating a REST request
		        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
				
		        
		        //
		        String data="{\r\n"
		                + "    \"username\" : \"admin\",\r\n"
		                + "    \"password\" : \"password123\"\r\n"
		                + "}";
		        //
		        Response response = request.header("Content-Type","application/json")
		                .body(data)
		                .when().post("auth");
		        
		        response.prettyPeek();
		             
		         }
			
				  
				 


	}


