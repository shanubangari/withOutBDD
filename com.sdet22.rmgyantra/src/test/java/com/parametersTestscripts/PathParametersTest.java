package com.parametersTestscripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParametersTest {
	@Test
	public void pathParametersTest() {
		
		String proId="TY_PROJ_001";
		given()
			.pathParam("projectId", proId)
		.when()
			.get("http://localhost:8084/projects/{projectId}")
		.then().statusCode(200).log().all();
	}

}
