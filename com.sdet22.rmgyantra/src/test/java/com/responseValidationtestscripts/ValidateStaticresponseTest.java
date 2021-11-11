package com.responseValidationtestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ValidateStaticresponseTest {
	@Test
	public void validateStaticresponseTest() {
		String expectedValue = "JIWAKU";
		Response response=when()
				.get("http://localhost:8084/projects");
		String actualValue = response.jsonPath().get("[0].projectName");
		response.then()
				.assertThat().statusCode(200)
				.assertThat() .contentType(ContentType.JSON)
				.assertThat().log().all();
		Assert.assertEquals(expectedValue, actualValue);
	}

}
