package com.diffWaysToPostARequestTestscripts;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectHashMapTest {
@Test
	public void create1() {
		
		Random ran=new Random();
		int raNum = ran.nextInt();
		
		HashMap map=new HashMap();
		map.put("createdBy", "bhagya");
		map.put("projectName", "ganesh"+raNum);
		map.put("status", "completed");
		map.put("teamSize", 200);
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201)
			.assertThat().contentType(ContentType.JSON)
			.assertThat().log().all();
	}
}
