package tests;


import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.LoginPage;
import pages.MenuPage;
import pages.ReportIssuePage;

public class ReportIssueTest extends BaseTest {

	private ReportIssuePage reportPage = new ReportIssuePage();
	private BaseTest baseTest = new BaseTest();
	private LoginPage loginPage = new LoginPage();
	private MenuPage menuPage = new MenuPage();
	
	
	@Test
	public void realizarReport() {


		baseTest.acessarSite();
		loginPage.logarSite("larissa.cardoso", "123456");
		menuPage.acessarIssueReport();
		reportPage.selecionarProjeto("94");
		reportPage.reportIssue("64", "10", "20", "20", "aaaa", "sasas");
		Assert.assertTrue(reportPage.verificaReport().contains("Operation successful."));

	}
	

}
