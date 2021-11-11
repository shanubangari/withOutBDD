package com.diffWaysToPostARequestTestscripts;

import org.testng.annotations.Test;

import com.ProjectUtils.PojoLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingPojoLibraryTest {
@Test
public void createProjectUsingPojoLibraryTest() {
	PojoLibrary pojo=new PojoLibrary("keerthi", "kkk", "created", 5);
	given()
		.contentType(ContentType.JSON)
		.body(pojo)
	.when()
		.post("http://localhost:8084")
	.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().log().all();
	
}
}
