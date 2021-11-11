package com.crudoperationwithBDDFeatureTestcripts;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutUpdateProjectTest {
	@Test
public void putUpdateProjectTest() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "JSJ1");
	
	given()
		.contentType(ContentType.JSON)
		.body(jobj)
	.when()
		.put("http://localhost:8084/projects/TY_PROJ_1403")
	.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	
}
}
