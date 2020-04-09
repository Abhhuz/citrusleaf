package com.laalela_api.api_tests;

import java.net.http.HttpRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

import com.laalela_api.utility.Log;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Xample {

	public static void main(String args[]) {
			Response response =
				      RestAssured.given()
				      	//.param("name","test Users")
				      	.param("mobile","+16574457338")
				      	//.param("email","thga@fb.com")
				      	.when()
				        .post("http://159.65.149.30/laalela/api/v1/users/login/phone")
				        .then()
				        .contentType(ContentType.JSON)
				        .extract()
				        .response();
			
			System.out.println(response.getStatusCode());
			System.out.println(response.getContentType());
			System.out.println(response.asString());
	}
}


