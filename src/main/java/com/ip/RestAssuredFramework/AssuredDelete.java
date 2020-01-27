package com.ip.RestAssuredFramework;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class AssuredDelete {
	
	@Test
	public void delete() {
		String url = "https://reqres.in/api/users/2";
		
		RequestSpecification req = given(); //req reference variable
		Response res = req.delete(url);
		
		
        
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode,204);
		
		System.out.println(statusCode);
		
		String jsonFormatData = res.asString();
		System.out.println("Json format data is:-------"+jsonFormatData);
		
		Headers header = res.getHeaders();
		System.out.println("Headers are:----"+header);
		
	}
}





