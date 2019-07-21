package pages;

import core.BasePage;

public class MenuPage extends BasePage {

	public void acessarViewIssues() {
		clicarLink("View Issues");

	}

	public void acessarIssueReport() {
		clicarLink("Report Issue");

	}

	public void acessarSummary() {
		clicarLink("Summary");

	}

	public void acessarLogout() {
		clicarLink("Logout");

	}
	
	

}
