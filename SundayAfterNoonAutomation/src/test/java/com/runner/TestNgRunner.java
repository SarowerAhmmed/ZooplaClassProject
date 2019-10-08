package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
	@CucumberOptions(
			plugin= {"pretty","html:target/cucumber-reports", "json:target/cucumber.json"},

			snippets=SnippetType.CAMELCASE,
			
	       features = "src/main/resources/GCRLoginOutLine.feature",
	        glue={"com.stepdef"},// stepdef code location package name
	        	//tags= {"@Regression"},
					monochrome=true
				,strict=true
					,dryRun=false
					)

	 
	public class TestNgRunner  extends AbstractTestNGCucumberTests { 
		
		
		
	}


