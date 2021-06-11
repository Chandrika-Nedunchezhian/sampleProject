package org.sample;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class First {
public static void main(String[] args) throws IOException, InterruptedException, AWTException   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-chandrika\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	int tsize = tRow.size();
	System.out.println(tsize);
}
}

