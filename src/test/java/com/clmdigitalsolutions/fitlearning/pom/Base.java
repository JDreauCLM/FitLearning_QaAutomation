package com.clmdigitalsolutions.fitlearning.pom;

import com.clmdigitalsolutions.fitlearning.myHooks.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Base {
    protected WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void TestText(String text){
        System.out.println("El texto es: "+text);
    }


    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return (List<WebElement>) driver.findElements(locator);
    }

    public String getText(WebElement element){
        return  element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator){
        try {
            return  driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void visit(String url){
        driver.get(url);
    }

    public void selectDate(String month, String day, String year) {

        By dateBirth = By.id("dateOfBirthInput");

        driver.findElement(dateBirth).click();

        WebElement yearInput = driver.findElement(By.xpath("//option[@value='"+year+"']"));
        yearInput.click();
        /*
         * Los meses van desde el 0 al 11, o sea, 0 corresponde a Enero y 11 Diciembre
         * */
        WebElement monthInput = driver.findElement(By.xpath("//option[@value='"+month+"']"));
        monthInput.click();
        WebElement dayDiv = driver.findElement(By.xpath("//div[text()='"+day+"']"));
        dayDiv.click();
    }

    public void enter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }
}
