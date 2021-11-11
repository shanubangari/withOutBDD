package com.chainingTestscripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ChainingTest {
	@Test
	public void chainingTest() {
		Response response=when()
				.get("http://localhost:8084/projects");
				String proId = response.jsonPath().get("[1].projectId");
		given()
			.pathParam("projectId", proId)
		.when()
			.delete("http://localhost:8084/projects/{projectId}")
		.then()
			.log().all();
		
	}

}
