package com.responseValidationtestscripts;

import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ValidateDynamicResponseTest {
	@Test
	public void validateDynamicResponseTest() {
		String expectedValue = "JIWAKU";
		String actualValue=null;
		
		Response response=when()
				.get("http://localhost:8084/projects");
		List<String> listData = response.jsonPath().get("projectName");
		for(String list:listData) {
			if(expectedValue.equals(list)) {
				actualValue=list;
			}
		}
		Assert.assertEquals(expectedValue, actualValue);
		
	}

}
