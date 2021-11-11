package com.diffWaysToPostARequestTestscripts;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateAProjectUsingJSONFileTest {

	@Test
	public void create() {
		File file=new File("./src/test/resources/jsondata.json");
		given()
			.contentType(ContentType.JSON)
			.body(file)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201).log().all();
	}
}
