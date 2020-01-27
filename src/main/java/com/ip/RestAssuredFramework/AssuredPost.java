package com.ip.RestAssuredFramework;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class AssuredPost {
	
	@Test
	public void post() {
		String url = "https://reqres.in/api/users";
		
		RequestSpecification req = given(); //req reference variable
		
		req.contentType(ContentType.JSON);
		
		JSONObject obj = new JSONObject();
		
		//set all datas
		obj.put("name","Arin");   //obj is the reference variable of jsonObject.
		obj.put("job", "Architect");
		obj.put("id",10);
		
		//will pass the datas
		String jsonObj = obj.toString();
		req.body(jsonObj);
	
		
        Response res = req.post(url); //hitting url......res is the reference variable of response class
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		
		System.out.println(statusCode);
		
		String jsonFormatData = res.asString();
		System.out.println("Json format data is:-------"+jsonFormatData);
		
		Headers header = res.getHeaders();
		System.out.println("Headers are:----"+header);
		
	}
}