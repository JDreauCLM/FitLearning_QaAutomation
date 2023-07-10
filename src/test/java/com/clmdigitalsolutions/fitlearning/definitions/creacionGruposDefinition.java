package com.clmdigitalsolutions.fitlearning.definitions;

import com.clmdigitalsolutions.fitlearning.myHooks.Hooks;
import com.clmdigitalsolutions.fitlearning.pom.pages.GruposPage;
import com.clmdigitalsolutions.fitlearning.pom.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class creacionGruposDefinition {
    WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);
    GruposPage gruposPage = new GruposPage(driver);

    @Given("estoy en el home")
    public void estoy_en_el_home() {
        assertTrue("No esta en el home", homePage.homeCheck());
    }
    @When("ingreso a la pagina de Grupos")
    public void ingreso_a_la_pagina_de_grupos() throws InterruptedException {
        homePage.clickButtonNuevoGrupo();
    }
    @And("relleno los campos {string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void relleno_los_campos(String titulo, String nombrePublico, String fechaDesde, String fechaHasta, String contGrupo, String cursosGrupo, String tipo, String switch1, String switch2) throws InterruptedException {
        gruposPage.formCreacionGrupo(titulo, nombrePublico, fechaDesde, fechaHasta, contGrupo, cursosGrupo, tipo, switch1, switch2);
    }
    @And("presiono crear")
    public void presiono_crear() throws InterruptedException {
        gruposPage.pressButtonCrear();
    }
    @Then("valido que se creo el grupo")
    public void valido_que_se_creo_el_grupo() throws InterruptedException {
        assertTrue("El grupo NO ha podido crearse CORRECTAMENTE",gruposPage.validateCheckCrear());
    }
}
