@grupos
Feature: Flujos de grupos en backoffice
  Se crean casos de prueba para validar los grupos en Backoffice


  Background: : Login del backoffice
    Given ingreso al login del backoffice "https://beta.smartmobile.fit/backoffice"
    When ingreso las credenciales "jdreau@clmdigitalsolutions.com""changeme"
    And presiono el boton Entrar


  @creacionGrupo
  Scenario Outline: Creo grupo
    Given estoy en el home
    When ingreso a la pagina de Grupos
    And relleno los campos <titulo><nombrePublico><fechaDesde><fechaHasta><contGrupo><cursosGrupo><tipo><switch1><switch2>
    And presiono crear
    Then valido que se creo el grupo

    Examples:
      | titulo       | nombrePublico | fechaDesde | fechaHasta | contGrupo | cursosGrupo | tipo             | switch1 | switch2 |
      | "clm_test01" | "clm_test01"  | "24"       | "25"       | "Cursos"  | "test"      | "Semipresencial" | "on"    | "on"    |
#      | "clm_test02" | "clm_test02"  | "24"       | "25"       | "Cursos"  | "test"      | "Semipresencial" | "on"    | "on"    |
#      | "clm_test03" | "clm_test03"  | "24"       | "25"       | "Cursos"  | "test"      | "Semipresencial" | "on"    | "on"    |


#  @eliminacionGrupo
#  Scenario: Elimino un grupo
#    Given