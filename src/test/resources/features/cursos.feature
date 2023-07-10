@cursos
Feature: Flujo de Backoffice respecto a cursos
  Se crearan diferentes Scenarios sobre creacion, edicion, eliminacion, configuracion, etc. Del apartado de cursos y lo realcionado a ello

  @loginBackoffice
  Scenario Outline: Login del backoffice
    Given ingreso al login del backoffice <url>
    When ingreso las credenciales <user><pass>
    And presiono el boton Entrar

    Examples:
      | url                                       | user                             | pass       |
      | "https://beta.smartmobile.fit/backoffice" | "jdreau@clmdigitalsolutions.com" | "changeme" |


    @creacionCurso
    Scenario Outline: Creo un curso
      Given estoy en el home
      When ingreso a la pagina de Cursos
      And relleno los campos
