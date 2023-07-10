package com.clmdigitalsolutions.fitlearning.pom.testCases;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = false, glue = {"com/clmdigitalsolutions/fitlearning"},
        features = "src/test/resources/features/grupos.feature",
        tags = "@creacionGrupo"
)
public class GrupoTest {
}
