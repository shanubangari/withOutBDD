package com.crudoperationwithBDDFeatureTestcripts;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {
	@Test 
	public void getAllProjectsTest() {
		when()
			.get("http://localhost:8084/projects")
		.then()
			.assertThat().statusCode(200)
			.assertThat().contentType(ContentType.JSON)
			.assertThat().log().all();
	}

}
