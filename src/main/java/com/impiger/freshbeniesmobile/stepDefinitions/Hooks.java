package com.impiger.freshbeniesmobile.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.impiger.util.DriverManager;
import com.impiger.util.ElementActions;
import com.impiger.util.VideoManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
    @Before
    public void initialize() throws Exception {
	
    	new ElementActions().launchApp();
        new VideoManager().startRecording();
    }

    @After
    public void quit(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
        	final byte[] screenshot = ((TakesScreenshot)new DriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }

        new VideoManager().stopRecording(scenario.getName());
        new ElementActions().closeApp();

    }

}
