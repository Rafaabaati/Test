package Acestpage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginmailTest extends Basetest {
	@Test
	public void test() throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?hl=fr&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
		login.sendKeys("mohamedrafaa.baati@neolians.com");
		WebElement btn1 = driver.findElement(By.xpath(
				"//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']"));
		btn1.click();

		Thread.sleep(5000);
		
		WebElement motdepass = driver.findElement(By.xpath("//div[@class='Xb9hP']/parent::*//input[@name='password']"));
		motdepass.sendKeys("Taraji1919");

		Thread.sleep(5000);

		// System.out.println(value2);

		WebElement btn2 = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']"));
		btn2.click();

		// WebElement
		// accede=driver.findElement(By.xpath("/html/body/header/div[1]/div[5]/ul/li[2]/a"));
		// accede.click();

		// WebElement
		 //apropos=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/c-wiz/c-wiz/div/div[1]/div[3]/c-wiz/nav/ul/li[8]/a/div[1]"));
		 //apropos.click();

		WebElement accueil=driver.findElement(By.xpath("//div[@class='GiKO7c']"));
		 accueil.click();

	}
}
