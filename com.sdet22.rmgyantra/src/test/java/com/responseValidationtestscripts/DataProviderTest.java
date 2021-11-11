package com.responseValidationtestscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ProjectUtils.PojoLibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataProviderTest {
@Test(dataProvider = "multipleDataProvider")
public void dataProviderTest(String createdBy,String projectId,String status,int teamSize) {
	PojoLibrary pojo=new PojoLibrary(createdBy, projectId, status, teamSize);
	given()
		.contentType(ContentType.JSON)
		.body(pojo)
	.when()
		.post("http://localhost:8084/addProject")
	.then()
	.assertThat().log().all();
}

@DataProvider
public Object[][] multipleDataProvider() {
	Object[][] obj = new Object[2][4];
	obj[0][0]="Aa1c"; obj[0][0]="pro1c"; obj[0][0]="created"; obj[0][0]=2;
	obj[1][0]="bba1"; obj[1][0]="prob"; obj[1][0]="created"; obj[1][0]=2;
	return obj;
}
}
