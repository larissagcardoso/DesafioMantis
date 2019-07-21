package pages;

import org.openqa.selenium.By;

import core.BasePage;



public class ReportIssuePage extends BasePage {

	public void selecionarProjeto(String projeto) {

		selecionarCombo(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select"), projeto);
		clicarBotao(By.cssSelector("[value='Select Project']"));
	}
	
	public void selecionarCategoria(String categoria) {
		selecionarCombo(By.name("category_id"), categoria);
	}

	public void selecionarReprodutibilidade(String reprodutibilidade) {
		selecionarCombo(By.name("reproducibility"), reprodutibilidade);
	}

	public void selecionarSeveridade(String severidade) {
		selecionarCombo(By.name("severity"), severidade);
	}

	public void selecionarPrioridade(String prioridade) {
		selecionarCombo(By.name("priority"), prioridade);
	}

	public void escreverSumario(String sumario) {
		escrever(By.name("summary"), sumario);
	}

	public void escreverDescricao(String descricao) {
		escrever(By.name("description"), descricao);
	}

	public void evivarReport() {
		clicarBotao(By.cssSelector("[value = 'Submit Report']"));

	}

	public String verificaReport() {
		return obterTexto(By.xpath("/html/body/div[2]"));

	}

	public void reportIssue(String categoria, String reprodutibilidade, String severidade, String prioridade,
			String sumario, String descricao) {

		selecionarCategoria(categoria);
		selecionarReprodutibilidade(reprodutibilidade);
		selecionarSeveridade(severidade);
		selecionarPrioridade(prioridade);
		escreverSumario(sumario);
		escreverDescricao(descricao);
		evivarReport();
	}

}
