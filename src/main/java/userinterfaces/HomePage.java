package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class HomePage extends PageObject {

	public static Target BUTTON_CARACTERISTICAS
    = Target.the("'Hacer clik en boton categorias").located(By.id("\"testId-HamburgerBtn-toggle\""));
}
