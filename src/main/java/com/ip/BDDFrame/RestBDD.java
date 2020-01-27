package com.ip.BDDFrame;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

  
   public class RestBDD {
	   
	//@Test
	public void test() {
		given().
		when().
		get("https://jsonplaceholder.typicode.com/posts").
		then()
		.assertThat()
		//.statusCode(200);
		.log().all();	   //if we need all data part.
	}
	
	@Test
	public void testEqualToFunction() {
		
		given().
		when().
		  get("https://jsonplaceholder.typicode.com/posts/5").
		  then()
		  .body("id",equalTo(5));
		  //.assertThat()
		  //.log().all();
	}
	
}
