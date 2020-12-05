package com.deckofcardsapi.integration;



import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected RequestSpecification httpRequest;
	public static final String NEW_DECK_RESOURCE = "/deck/new/";
	
	@BeforeTest
	public void setup() {
		RestAssured.baseURI = "https://deckofcardsapi.com/api";
		httpRequest = RestAssured.given();
	}

}
