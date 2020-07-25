package com.impiger.freshbeniesmobile.runner;

import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty"
        , "html:target/MotoG5Plus/cucumber"
        , "summary"
        , "de.monochromata.cucumber.report.PrettyReports:target/MotoG5Plus/cucumber-html-reports"}
        ,features = {"src/main/java/com/impiger/freshbeniesmobile/features"}
        ,glue = {"com.impiger.freshbeniesmobile.stepDefinitions"}
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = {"@Sanity"}
        )
public class MotoG5PlusTestNGRunnerTest extends RunnerBase {

}