package com.crudoperationwithBDDFeatureTestcripts;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {
	@Test
	public void createProjectTest() {
		Random ran=new Random();
		int ranNum = ran.nextInt(5000);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "JYOTI S J");
		jobj.put("projectName", "JIWAKU"+ranNum);
		
		jobj.put("teamSize", 10);
		
	given()
		.contentType(ContentType.JSON)
		.body(jobj)
	.when()
		.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201)
	.assertThat().contentType(ContentType.JSON)
	.assertThat().log().all();
		
	}

}
