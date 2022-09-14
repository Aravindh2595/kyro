package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample  {

	public static void main(String[] args)throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Green technology\\kyro\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://kyro.pages.dev/");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/div/div/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("aravindhforever05@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aravindhkyro@1995");
		driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/div/div/div/div/div[2]/ul/li[3]/div[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div/div[5]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\":rt:\"]")).sendKeys("Summary");
		 driver.findElement(By.xpath("//*[@id=\":ru:\"]")).sendKeys("Story");
		 driver.findElement(By.xpath("//*[@id=\":rv:\"]")).sendKeys("Software Testing");

		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\":r10:\"]")).click();
		 
		 Robot r = new Robot();
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		
		 
		 driver.findElement(By.xpath("//*[@id=\":r11:\"]")).sendKeys("Chennai");
		 
		 driver.findElement(By.xpath("//*[@id=\":r12:\"]")).sendKeys("09142022");
		 driver.findElement(By.xpath("//*[@id=\":r13:\"]")).sendKeys("10152022");
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/button")).click();
		

	}

}
