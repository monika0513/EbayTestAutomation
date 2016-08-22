package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Excelutil;
import com.util.Locators;
import com.util.PageDriver;
import com.util.configuration;

public abstract class BaseTest {
	public PageDriver driver;
	public Excelutil excelutil;
	public static final configuration config;
	static{
		config = new configuration();
	}

  @BeforeSuite
public void beforeSuite(){
	this.driver= new PageDriver(config);
	Locators.readlocators();
	excelutil = new Excelutil();
	
}
  @AfterSuite
public void afterSuite(){
	driver.quit();
	
}

}
