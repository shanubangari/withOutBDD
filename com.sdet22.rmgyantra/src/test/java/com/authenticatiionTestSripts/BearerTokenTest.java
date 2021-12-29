 package com.authenticatiionTestSripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	@Test
	public void barerTokenTest() {
		
		given()
		.auth().oauth2("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")
	.when()
		.get("https://api.github.com/user/repos")
	.then()
		.log().all();
	}

}
