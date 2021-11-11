package com.parametersTestscripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GithubParamPath_QueryTest {
	@Test
	public void githubParamPath_QueryTest() {
		given()
			.pathParam("username", "shanubangari")
			.queryParam("sort", "created")
		.when()
			.get("https://api.github.com/users/{username}/repos")
		.then()
			.log().all();
			
	}

}
