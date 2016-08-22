package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hp;
	
	@BeforeClass
	public void beforeclass(){
		hp= new HomePage(driver);
		hp.open();
	}
	@Test
	public void Testsociallinks(){
		assertEquals(4,hp.getSocialLinks());
		
	}
	@Test
	public void loginlink(){
		assertEquals("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=",hp.ClickLogin());
		
	}
	@Test
	public void navbar1(){
		assertEquals(12,hp.navbar());			
				}
	@Test
	public void screenshot2(){
assertEquals("https://mbuy.ebay.com/xo?action=view&sessionid=493930394016&redirect=mobile",hp.windowHandleEx());
		
	}
	@Test
	public void Action1(){
		assertTrue(hp.actions1());

		
	}

}
