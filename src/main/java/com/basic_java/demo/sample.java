package com.basic_java.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub           
//		
//	}
	
//	@Test
//	public void test()
//	{
//		System.out.println("adad");
//	}
	@Test
    public void testShadowDomElement() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
       
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));

      
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
        WebElement shadowInput = shadowRoot.findElement(By.cssSelector("input[type='text']"));
        shadowInput.sendKeys("automation testing");
	}


}