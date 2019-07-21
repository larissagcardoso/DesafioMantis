package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


import support.Generator;


public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();


	@Before
	public void acessarSite() {
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");		
		getDriver().get("https://mantis-prova.base2.com.br/login_page.php");

	}


	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator
				+ testName.getMethodName() + Generator.dataHoraParaArquivo() + ".jpg"));

	if (Propriedades.FECHAR_BROWSER) {
			killDriver();
	}
	}

}
