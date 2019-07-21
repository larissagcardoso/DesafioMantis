package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() {
		getDriver().get("https://mantis-prova.base2.com.br/login_page.php\"");
	}

	public void setUserName(String nome) {
		escrever(By.name("username"),(nome));
	}
	
	public void setSenha(String senha) {
		escrever(By.name("password"),(senha));
	}
	
	public void clicarEntrar() {
		clicarBotao(By.className("button"));
	}
	
	
	public String verificarUsLogado () {
		return obterTexto(By.className("login-info-left"));
	}
	
	public void logarSite (String nome,String senha) {
		setUserName(nome);
		setSenha(senha);
		clicarEntrar();
		
	}
}
