package com.crudoperationwithoutBddTestscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
@Test
public void getAllProjects() {
	Response resp = RestAssured.get("http://localhost:8084/projects");
	ValidatableResponse vldResp = resp.then();
	vldResp.assertThat().statusCode(200);
	vldResp.log().all();
}
}
