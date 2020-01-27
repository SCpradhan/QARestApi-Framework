package com.ip.RestAssuredFramework;

import org.testng.Assert;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;
import io.restassured.specification.RequestSpecification;



public class AssuredGet {



/*//Rest assured contains http client internally....we can see that in maven dependencies.
*/
	@Test
	public void get() {
		String url = "https://reqres.in/api/users?page=2";
		//string url = "https://jsonplaceholder.typicode.com/posts";
		
		RequestSpecification req = given();
		
		Response res = req.get(url); //res is the reference variable of response class
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		System.out.println(statusCode);
		
		String jsonFormatData = res.asString();
		System.out.println("Json format data is:-------"+jsonFormatData);
		
		Headers header = res.getHeaders();
		
		System.out.println("Headers are:----"+header);
		
	}

	
	}


