package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import core.BaseTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import pages.LoginPage;


@RunWith(Parameterized.class)
public class LoginTest extends BaseTest {

	private LoginPage loginPage = new LoginPage();
	private BaseTest baseTest = new BaseTest();
	
	
	@Parameter
	public String nome;
	@Parameter(value=1)
	public String senha;

	

	@Before
	public void acessarSite() {
		baseTest.acessarSite();
	}
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		return Arrays.asList(new Object[][] {
			{" ", "" },
			{"Larissa", ""},
			{"Larissa", "1234"},
			{"larissa.cardoso", "123456"},

		});
	}

	@Test
	public void t01_Login() {
		
	loginPage.logarSite(nome, senha);
	System.out.println();
	Assert.assertEquals("Logged in as: larissa.cardoso (Larissa Cardoso - developer)",loginPage.verificarUsLogado());
	}

}
