package com.responseValidationtestscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ProjectUtils.PojoLibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SamePostRequestMultipleDataProviderTest {
@Test(dataProvider = "dataProvider")
public void samePostRequestMultipleDataProviderTest(String createdBy,String projectName,String status,int teamSize) {
	
	PojoLibrary pojo=new PojoLibrary(createdBy, projectName, status, teamSize);
	given()
		.contentType(ContentType.JSON)
		.body(pojo)
	.when()
		.post("http://localhost:8084/addProject")
	.then().log().all();
}
@DataProvider
public Object[][] dataProvider() {
	Object[][] obj = new Object[2][4];
	obj[0][0]="xa";
	obj[0][1]="xab@";
	obj[0][2]="created";
	obj[0][3]=8;
	
	obj[1][0]="yabc";
	obj[1][1]="yad@2";
	obj[1][2]="created";
	obj[1][3]=8;
	return obj;
	
}
	
}
