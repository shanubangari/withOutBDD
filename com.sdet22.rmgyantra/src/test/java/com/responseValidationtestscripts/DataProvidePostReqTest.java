package com.responseValidationtestscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ProjectUtils.PojoLibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataProvidePostReqTest {
	@Test
	public void dataProvidePostReqTest(String createdBy, String projectName, String status, int teamSize) {
		PojoLibrary pojo=new PojoLibrary(createdBy, projectName, status, teamSize);
		given()
			.contentType(ContentType.JSON)
			.body(pojo)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
		
	}	
	}

	
