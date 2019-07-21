package tests;

import org.junit.Test;


import core.BaseTest;
import pages.LoginPage;
import pages.MenuPage;

public class ViewIssuesTest extends BaseTest {

	private BaseTest baseTest = new BaseTest();
	private LoginPage loginPage = new LoginPage();
	private MenuPage menuPage = new MenuPage();

	@Test
	public void visualizarIssues() {
		baseTest.acessarSite();
		loginPage.logarSite("larissa.cardoso", "123456");
		menuPage.acessarViewIssues();
		

	}


}
