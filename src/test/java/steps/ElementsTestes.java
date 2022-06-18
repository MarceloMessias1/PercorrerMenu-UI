package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElementsPages;

public class ElementsTestes {

	ElementsPages page = new ElementsPages();

	@Given("quq esteja em elements")
	public void quqEstejaEmElements() {
	page.acessarMenu("Elements");
	
	}

	@When("acessar todos os linksI")
	public void acessarTodosOsLinksI() {
		page.validarLinks(5);

	}

	@Then("validamos os links")
	public void validamosOsLinks() {

	}

}
