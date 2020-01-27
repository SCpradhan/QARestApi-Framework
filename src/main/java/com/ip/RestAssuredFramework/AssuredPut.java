package com.ip.RestAssuredFramework;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class AssuredPut {
	
	@Test
	public void put() {
		String url = "https://reqres.in/api/users/2";
		
		RequestSpecification req = given(); //req reference variable
		
		req.contentType(ContentType.JSON);
		
		JSONObject obj = new JSONObject();
		
		//set all datas
		obj.put("name","Arya");   //obj is the reference variable of jsonObject.
		obj.put("job", "Engineer");
		obj.put("id",10);
		
		//will pass the datas
		String jsonObj = obj.toString();
		req.body(jsonObj);
	
		
        Response res = req.put(url); //hitting url......res is the reference variable of response class
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode,200);
		
		System.out.println(statusCode);
		
		String jsonFormatData = res.asString();
		System.out.println("Json format data is:-------"+jsonFormatData);
		
		Headers header = res.getHeaders();
		System.out.println("Headers are:----"+header);
		
	}
}


