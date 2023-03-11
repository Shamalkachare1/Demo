package com.qa.restAPI.test;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;



public class getCallBDD {
@Test
	
	public void getAPI()
	{
	given().
	when().
	get("http://ergast.com/api/f1/2021/circuits.json").
	then().
	assertThat().
	statusCode(0).and().
	body("MRData.CircuitTable.Circuits.circuitId",hasSize(21)).and().
	header("connection", equalTo("Keep-Alive"));
	
	
	}
	
	
	
}
