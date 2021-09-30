package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import tasks.SeleccionarCaracteristica;
import userinterfaces.HomePage;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.rest.SerenityRest.then;

public class PruebaUI_Steps {

	@Managed(driver = "chrome")
	private WebDriver browser;
	private Actor actor = Actor.named("Cliente");
	private HomePage homePage = new HomePage();
	
	@Given("Estemos en la pagina de inicio de falabella")
	public void estemosEnLaPaginaDeInicioDeFalabella() {
	   actor.can(BrowseTheWeb.with(browser));
	   actor.wasAbleTo(Open.browserOn(homePage));
	}

	@When("Click el boton de categorias")
	public void clickElBotonDeCategorias(){
		SeleccionarCaracteristica clickCaracteristica = new SeleccionarCaracteristica();
	}

	@Then("Click en la categoria (.*)")
	public void clickEnLaCategoria(String cat) {
	   
	}
}
