package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscarMedico {
	
	//Atributos
	String url; //Endere�o do site 
	WebDriver driver; // Objeto do selenium	
		
	@Before //Antes do teste
	public void iniciar() {
		url = "https://www.unimed.coop.br"; //Endere�o do site
		System.setProperty("webdriver.chrome.driver","C:\\Noesis\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximinizar a janela do navegador
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS); //Esperar implicita de 30s
	}
	

		
	@Dado("preciso entrar no site da Unimede")
	public void preciso_entrar_no_site_da_unimede() {
	   driver.get(url);
	}

	@Quando("clico no botao consulta agora")
	public void clico_no_bot_o_consulta_agora() {
		driver.findElement(By.id("fragment-oimm-link")).click();
	}

	@Quando("clico em busca detalhada")
	public void clico_em_busca_detalhada() {
	   driver.findElement(By.id("react-tabs-2")).click();
	}

	@Quando("escrevo a especialidade cardiologia")
	public void escrevo_a_especialidade_cardiologia() {
		driver.findElement(By.id("react-select-3-input")).sendKeys("cardiologia" + Keys.ENTER);

	}

	@Quando("escrevo o estado Rio de Janeiro")
	public void escrevo_o_estado_rio_de_janeiro() {		
		driver.findElement(By.id("react-select-4-input")).sendKeys("rio de janeiro" + Keys.ENTER );
	    
	}

	@Quando("escrevo a ciade Rio de Janeiro")
	public void escrevo_a_ciade_rio_de_janeiro() {
		driver.findElement(By.id("react-select-5-input")).sendKeys("rio de janeiro" + Keys.ENTER );   
	  
	}

	@Quando("clico em Pesquisar")
	public void clico_em_pesquisar() {
		driver.findElement(By.cssSelector("button.Button")).click();
	    
	}

	@Entao("eu tenho todos os medicos da especialidade cardiologia do Rio de Janeiro")
	public void eu_tenho_todos_os_medicos_da_especialidade_cardiologia_do_rio_de_janeiro() {		
		System.out.println("Informa todos os médicos Cardiologista no Rio de Janeiro");
	    
	}

	@Dado("que estou no site da Unimed e consulte o Guia Medico")
	public void que_estou_no_site_da_unimed_e_consulte_o_guia_m_dico() {
		driver.get(url);
		driver.findElement(By.id("fragment-oimm-link")).click();
		driver.findElement(By.id("react-tabs-2")).click();
	}

	@Quando("eu escrevo a cidade Rio de Janeiro")
	public void eu_escrevo_a_cidade_rio_de_janeiro() {
		driver.findElement(By.id("react-select-4-input")).sendKeys("rio de janeiro" + Keys.ENTER );		
	}

	@Entao("nao terei resultados dos medicos que contenha a cidade Sao Paulo")
	public void n_o_terei_resultados_dos_m_dicos_que_contenha_a_cidade_s_o_paulo() {
		System.out.println("Resultado da pesquisa não contem a cidade de São Paulo");
	}

}
