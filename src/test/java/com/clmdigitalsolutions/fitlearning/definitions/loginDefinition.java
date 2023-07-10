package com.clmdigitalsolutions.fitlearning.definitions;


import com.clmdigitalsolutions.fitlearning.myHooks.Hooks;
import com.clmdigitalsolutions.fitlearning.pom.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginDefinition {

    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    
    @Given("ingreso al login del backoffice {string}")
    public void ingreso_al_login_del_backoffice(String url) {
        loginPage.visit(url);
    }

    @When("ingreso las credenciales {string}{string}")
    public void ingreso_las_credenciales(String user, String pass) throws InterruptedException {
        loginPage.loginForm(user, pass);
    }

    @And("presiono el boton Entrar")
    public void presiono_el_boton_entrar() throws InterruptedException {
        loginPage.clickButtonLogin();
    }

    @Then("valido que estamos logueados")
    public void valido_que_estamos_logueados() throws InterruptedException {
        assert(loginPage.checkLogin());
    }
}
