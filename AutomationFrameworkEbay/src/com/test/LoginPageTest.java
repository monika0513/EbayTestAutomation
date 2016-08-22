package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import com.base.BaseTest;
import com.page.LoginPage;
import com.util.Excelutil;
 
public class LoginPageTest  extends BaseTest{
LoginPage lp;
	
	@BeforeClass
	public void beforeClass(){
		lp= new LoginPage(driver);
		}
	@DataProvider(name="user-data")
		public Object[][]getUsers(){
		Object[][]data=Excelutil.getData();
		return data;
		}
	@Test(dataProvider= "user-data")
		public void testLogin(String email,String passwd){
			assertTrue(lp.performsignin(email, passwd));
		}
}
