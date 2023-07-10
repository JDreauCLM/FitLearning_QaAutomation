package com.clmdigitalsolutions.fitlearning.pom.pages;

import com.clmdigitalsolutions.fitlearning.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By logoHome = By.xpath("//div[@class='light-logo']");
    By spanGrupos = By.xpath("//span[text()='Grupos']");
    By textGrupos = By.xpath("//h2[contains(text(),'Grupos')]");
    By buttonNuevoGrupo = By.xpath("//button[@class='m-l-15 mat-raised-button mat-button-base mat-primary']");
    public Boolean homeCheck(){
        return isDisplayed(logoHome);
    }

    public void clickButtonNuevoGrupo() throws InterruptedException {
        Thread.sleep(3000);
        click(spanGrupos);
        if (isDisplayed(textGrupos)){
            click(buttonNuevoGrupo);
        }else {
            System.out.println("No se ha desplegado el formularios de creacion de Grupos");
        }
    }
}
