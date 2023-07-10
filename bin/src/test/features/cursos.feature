@cursos
Feature: Flujo de Backoffice respecto a cursos
  Se crearan diferentes Scenarios sobre creacion, edicion, eliminacion, configuracion, etc. Del apartado de cursos y lo realcionado a ello

  @login
  Scenario Outline: Creacion de curso
    Given ingreso al login del backoffice <url>
    When ingreso las credenciales <user><pass>
    And presiono el boton Entrar
    Then valido que estamos logueados

    Examples:
      | url                                       | user                             | pass    |
      | "https://beta.smartmobile.fit/backoffice" | "jdreau@clmdigitalsolutions.com" | "ddfae" |
