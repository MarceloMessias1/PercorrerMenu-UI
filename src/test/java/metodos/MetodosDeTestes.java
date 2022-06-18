package metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;
import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class MetodosDeTestes extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void clicarPorTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//" + atributo + "[text()='" + texto + "']")).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validarPorTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoEsperado.contains(textoCapturado));

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + ", " + n2 + ")");

	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void aguardarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}
}
