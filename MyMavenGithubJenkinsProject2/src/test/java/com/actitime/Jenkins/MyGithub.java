package com.actitime.Jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.Maven.MyMaven;

public class MyGithub extends MyMaven{
		@Test
			public void createActi()
			{
				Reporter.log("Create Acti",true);
			}
	
			@Test
				public void mopdifyActi()
				{
					Reporter.log("Modify Acti",true);
				}
}
