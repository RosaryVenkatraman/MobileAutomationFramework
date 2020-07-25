package com.impiger.freshbeniesmobile.pages;

import com.impiger.util.ElementActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends ElementActions {
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	MobileElement homepageheader;
	
	public String verifyHomePageHeader(){
		String text=new ElementActions().getAttribute(homepageheader, "text");
		return text;
	}

}
