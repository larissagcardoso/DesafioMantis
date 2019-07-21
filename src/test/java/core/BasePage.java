package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static core.DriverFactory.getDriver;

public class BasePage {

	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}	

	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void selecionarCombo(By by , String valor) {
		WebElement element = getDriver().findElement(by);
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}
	
	public void selecionarCombo2(String id, String valor) {
		WebElement element = getDriver().findElement(By.name(id));
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}
	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}
	

}
