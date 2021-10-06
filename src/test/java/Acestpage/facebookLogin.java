package Acestpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebookLogin extends Basetest {

@Test
public void test() throws InterruptedException {
	
	driver.get("https://fr-fr.facebook.com/");
	
	WebElement Ceration=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	Ceration.click();
	
	WebElement  prenom=driver.findElement(By.xpath("//input[@name='firstname']"));
	prenom.sendKeys("Rafaa");
	WebElement Nom=driver.findElement(By.xpath("//input[@name='lastname']"));
	Nom.sendKeys("baati");
	WebElement phone =driver.findElement(By.xpath("//input[@name='reg_email__']"));
	phone.sendKeys("58123305");
	WebElement mdp=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	mdp.sendKeys("Taraji1919");
	
	WebElement selectElement = driver.findElement(By.name("birthday_day"));
	Select selectObject = new Select(selectElement);
	selectObject.selectByVisibleText("26");
	
	WebElement selectElement1 = driver.findElement(By.name("birthday_month"));
	Select selectObject1 = new Select(selectElement1);
	selectObject1.selectByValue("2");
	
	WebElement selectElement2 = driver.findElement(By.name("birthday_year"));
	Select selectObject2 = new Select(selectElement2);
	selectObject2.selectByVisibleText("1994");
	
	Thread.sleep(5000);
	
	WebElement radio= driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//parent::*//input[@value='2']"));
	radio.click();
	
	WebElement btn =driver.findElement(By.xpath("//button[@name='websubmit']"));
	btn.click();
	
	
	Thread.sleep(20000);
 
	youtuberech you =new youtuberech();
	you .Test2();
	
	
	//JavascriptExecutor   Homme = (JavascriptExecutor)driver;
	//executor.executeScript("arguments[0].click();",radio);
	
	
	
}
}
