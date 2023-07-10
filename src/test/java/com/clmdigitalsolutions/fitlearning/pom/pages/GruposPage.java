package com.clmdigitalsolutions.fitlearning.pom.pages;

import com.clmdigitalsolutions.fitlearning.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GruposPage extends Base {
    public GruposPage(WebDriver driver) {
        super(driver);
    }

    By spanTitulo = By.xpath("//span[text()='Nuevo grupo']");
    By tituloInput = By.xpath("//input[contains(@placeholder,'Título')]");
    By nombrePubInput = By.xpath("//input[contains(@placeholder,'Nombre público')]");
    By fechaDesdeInput = By.xpath("/html/body/app-root/app-full-layout/app-modal/div[1]/div[2]/app-modal-new-group/form/div/div[3]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button");
    By fechaHastaInput = By.xpath("/html/body/app-root/app-full-layout/app-modal/div[1]/div[2]/app-modal-new-group/form/div/div[4]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button");
    By contGrupoInput = By.xpath("//mat-select[@aria-label='Selecciona el contenido del grupo']");
    By cursosGrupoSelect = By.xpath("//mat-select[@aria-label='Cursos del grupo ']");
    By cursosGrupoSearch = By.xpath("//input[contains(@aria-label,'dropdown search')]");
    By tipoDiv = By.xpath("//mat-select[@aria-label='Tipo de formación']");
    By switch1On = By.xpath("//*[@id='mat-slide-toggle-43-input']");
    By switch2On = By.xpath("//*[@id='mat-slide-toggle-44-input']");
    By buttonCrear = By.xpath("//*[@id='modalokbtn']");
    By checkCrear = By.xpath("//span[text()='Grupo creado correctamente']");

    public void formCreacionGrupo(String titulo, String nombrePublico, String fechaDesde, String fechaHasta, String contGrupo, String cursosGrupo, String tipo, String switch1, String switch2) throws InterruptedException {
        Thread.sleep(3000);
        By ContGrupoOption = By.xpath("//mat-option[@role='option']//child::span[text()='"+contGrupo+"']");
        By tipoOption = By.xpath("//span[text()='"+tipo+"']");
        By fechaDesdeOption = By.xpath("//div[text()='"+fechaDesde+"']");
        By fechaHastaOption = By.xpath("//div[text()='"+fechaHasta+"']");
        if (isDisplayed(spanTitulo)){
            Thread.sleep(1000);
            type(titulo,tituloInput);

            Thread.sleep(1000);
            type(nombrePublico, nombrePubInput);

            Thread.sleep(1000);
            click(fechaDesdeInput);
            click(fechaDesdeOption);

            Thread.sleep(1000);
            click(fechaHastaInput);
            click(fechaHastaOption);

            Thread.sleep(1000);
            click(contGrupoInput);
            click(ContGrupoOption);

//            Thread.sleep(1000);
//            click(cursosGrupoSelect);
//            type(cursosGrupo, cursosGrupoSearch);
//            enter(cursosGrupoSearch);

            Thread.sleep(1000);
            click(tipoDiv);
            click(tipoOption);

//            Thread.sleep(1000);
//            click(switch1On);
//            Thread.sleep(1000);
//            click(switch2On);

        }else {
            System.out.println("No se ha podido desplegar el formulario de Creacion de Grupo");
        }
    }

    public void pressButtonCrear() throws InterruptedException {
        Thread.sleep(3000);
        click(buttonCrear);
    }

    public Boolean validateCheckCrear() throws InterruptedException {
        Thread.sleep(2000);
        return isDisplayed(checkCrear);
    }
}
