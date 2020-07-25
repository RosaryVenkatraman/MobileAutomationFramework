package com.impiger.util;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    LoggerUtil utils = new LoggerUtil();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new Properties();
        
        try {
    		FileInputStream IO = new FileInputStream(
    				//System.getProperty("user.dir")+"\\src\\main\\java\\com\\impiger\\freshbeniesmobile\\config\\config.properties");
    				System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main"
                            + File.separator + "java" + File.separator + "com" + File.separator + "impiger"+ File.separator +"freshbeniesmobile" + File.separator +"config"+ File.separator +"config.properties");
    		try {
    			props.load(IO);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	} catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
        
        	

        try{
            utils.log().info("getting capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
            

            switch(params.getPlatformName()){
                case "Android":	
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                    caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                    caps.setCapability("appActivity", props.getProperty("androidAppActivity"));             
                    caps.setCapability("systemPort", params.getSystemPort());
                    caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
                    String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                            + File.separator + "java" + File.separator + "com" + File.separator + "impiger"+ File.separator +"freshbeniesmobile" + File.separator + "appfiles" 
                    		+ File.separator + "freshbenies-1.0.apk";
                      utils.log().info("appUrl is" + androidAppUrl);
                    //caps.setCapability("app", androidAppUrl);
                    break;
                case "iOS":
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
                    //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                    String iOSAppUrl= System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                    + File.separator + "java" + File.separator + "com" + File.separator + "impiger"+ File.separator +"freshbeniesmobile" + File.separator + "appfiles"
                    		+ File.separator + "freshbenies.app";
                    
                    utils.log().info("appUrl is" + iOSAppUrl);
                    caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
                    caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
                    caps.setCapability("app", iOSAppUrl);
                    caps.setCapability("waitForQuiescence", false);
                    //caps.setCapability("useNewWDA",true);
                    //caps.setCapability("autoAcceptAlerts", true);
                    break;
            }
            return caps;
        } catch(Exception e){
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }
}
