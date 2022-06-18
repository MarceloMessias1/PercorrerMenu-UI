package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import conexoes.DriversFactory;
import metodos.MetodosDeTestes;

public class ElementsPages extends DriversFactory {

	MetodosDeTestes metodos = new MetodosDeTestes();

	public void acessarMenu(String menu) {
		metodos.scroll(0, 250);
		metodos.clicarPorTexto("h5", menu);

	}

	public void validarLinks(int size) {

		for (int i = 0; i < size; i++) {
			WebElement menu = driver
					.findElement(By.xpath("//div[@class='element-list collapse show']//ul//li[@id='item-" +i+ "']"));
			if (menu.isDisplayed()) {
				menu.click();
				metodos.scroll(0, 150);

			}
		}
	}
}
