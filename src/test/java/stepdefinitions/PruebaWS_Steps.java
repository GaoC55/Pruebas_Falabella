package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	@Given("Obtener datos empleado (.*)")
	public void obtenerDatosEmpleado(String datos) {
		String[] listdatos = datos.split(",");
		given().contentType("aplication/json")
		.contentType("application/json")
        .header("Content-Type", "application/json")
        //.body("{\"name\":\"German\",\"salary\":\"1234\",\"age\":\"37\"}");
        .body("{\"name\":\"" + listdatos[0] + "\",\"salary\":\"" + listdatos[1] + "\",\"age\":\"" + listdatos[2] + "\"}");
	}

	@When("Consumir Creacion WS")
	public void consumirCreacionWSGerman() {
		when().post("http://dummy.restapiexample.com/api/v1/create");
	}

	@Then("Confirmar Creacion")
	public void confirmarCreacion() {
		then().statusCode(200);
	}
	
}
