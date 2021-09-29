package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.then;

public class PruebaWS_Steps {

	@Given("^El empleado existe$")
	public void ElEmpleadoExiste() throws Throwable {
		given().contentType("aplication/json");
	}
	
	@When("Consumir WS (.*)")
	public void CosumirWS(int Id) {
		System.out.println(when().get( "http://dummy.restapiexample.com/api/v1/employee/"+Id).andReturn().getBody().asString());
		
	}
	
	@Then("Obtener Infomacion")
	public void GetInformationTest() {
		then().statusCode(200);
	
	}
	
}
