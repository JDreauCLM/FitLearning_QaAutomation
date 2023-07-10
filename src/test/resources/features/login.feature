@login
Feature: Flujos de Login en Backoffice
  Se crean diferentes casos de prueba para la validacion del Login en Backoffice

  @loginHP
  Scenario Outline: Validacion Login backoffice
    Given ingreso al login del backoffice <url>
    When ingreso las credenciales <user><pass>
    And presiono el boton Entrar
    Then valido que estamos logueados

    Examples:
      | url                                       | user                             | pass       |
      | "https://beta.smartmobile.fit/backoffice" | "jdreau@clmdigitalsolutions.com" | "changeme" |

