package com.clmdigitalsolutions.fitlearning.pom.pages;

import com.clmdigitalsolutions.fitlearning.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By inputUser = By.xpath("//input[contains(@placeholder,'Email')]");
    By inputPass = By.xpath("//input[@placeholder='Contraseña']");

    By submitButton = By.xpath("//button[@type='submit']");

    By loginText = By.xpath("//h4[text()='Accede al backoffice']");

    By checkLogin = By.xpath("//span[text()='Smartboard']");

    public void loginForm(String user, String pass) throws InterruptedException {
        Thread.sleep(3000);
        if(isDisplayed(loginText)){
            type(user,inputUser);
            type(pass,inputPass);
        }else {
            System.out.println("No estás en login");
        }
    }

    public void clickButtonLogin() throws InterruptedException {
        Thread.sleep(2000);
        click(submitButton);
        Thread.sleep(2000);
    }

    public Boolean checkLogin() throws InterruptedException{
        Thread.sleep(3000);
        return isDisplayed(checkLogin);
    }
}
