package hack;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hack1{
	WebDriver driver;
	public String st1;
	public String st2;
	public String st3;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Desktop\\selenium\\chromedriver.exe");
		  driver=new ChromeDriver();	  
	}
	@Test
	public void openSite() throws Exception {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://emicalculator.net/");
		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Car Loan')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Car Loan')]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();

		st1=excel.getcellValue("sheet1", 1, 1);//15l
		st2=excel.getcellValue("sheet1", 1, 2);//9.5
		st3=excel.getcellValue("sheet1", 1, 3);//1yr
		
		Actions actions = new Actions(driver);
		driver.findElement(By.id("loanamount")).sendKeys(Keys.BACK_SPACE);
		WebElement elementLocator = driver.findElement(By.id("loanamount"));
		actions.doubleClick(elementLocator).perform();
		driver.findElement(By.id("loanamount")).sendKeys(st1);//15L
		driver.findElement(By.id("loanamount")).sendKeys(Keys.ENTER);
	
		WebElement elementLocator2=driver.findElement(By.id("loaninterest"));
		actions.doubleClick(elementLocator2).perform();
		driver.findElement(By.id("loaninterest")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("loaninterest")).sendKeys(st2);//9.5
		driver.findElement(By.id("loaninterest")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator3 = driver.findElement(By.id("loanterm"));
		actions.doubleClick(elementLocator3).perform();
		driver.findElement(By.id("loanterm")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("loanterm")).sendKeys(st3);//12 month
		driver.findElement(By.id("loanterm")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();
		String str1=driver.findElement(By.xpath("//h4[contains(text(),'Loan EMI')]")).getText();
		System.out.println(str1);
		String str2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/span[1]")).getText();
		System.out.println("INR "+str2);
		String str3=driver.findElement(By.xpath("//h4[contains(text(),'Total Interest Payable')]")).getText();
		System.out.println(str3);
		String str4=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/span[1]")).getText();
		System.out.println(str4);
		String str5=driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/h4[1]")).getText();
		System.out.println(str5);
		String str6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/p[1]/span[1]")).getText();
		System.out.println(str6);

		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		Thread.sleep(3000);
		Actions actions1 = new Actions(driver);
		WebElement elementLocator4 = driver.findElement(By.id("homeprice"));
		actions1.doubleClick(elementLocator4).perform();
		driver.findElement(By.id("homeprice")).sendKeys(Keys.BACK_SPACE);
		st1=excel.getcellValue("sheet1", 1, 1);//15l
		st2=excel.getcellValue("sheet1", 1, 2);//9.5
		st3=excel.getcellValue("sheet1", 1, 3);//1yr
		
		driver.findElement(By.id("homeprice")).sendKeys(st1);//15L
		driver.findElement(By.id("homeprice")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator5=driver.findElement(By.id("homeloaninterest"));
		actions1.doubleClick(elementLocator5).perform();
		driver.findElement(By.id("homeloaninterest")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("homeloaninterest")).sendKeys(st2);//9.5
		driver.findElement(By.id("homeloaninterest")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator6 = driver.findElement(By.id("homeloanterm"));
		actions1.doubleClick(elementLocator6).perform();
		driver.findElement(By.id("homeloanterm")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("homeloanterm")).sendKeys(st3);//1yr
		driver.findElement(By.id("homeloanterm")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator7 = driver.findElement(By.id("downpayment"));
		actions1.doubleClick(elementLocator7).perform();
		driver.findElement(By.id("downpayment")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("downpayment")).sendKeys("0");
		driver.findElement(By.id("downpayment")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator8 = driver.findElement(By.id("loanfees"));
		actions1.doubleClick(elementLocator8).perform();
		driver.findElement(By.id("loanfees")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("loanfees")).sendKeys("0");
		driver.findElement(By.id("loanfees")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator9 = driver.findElement(By.id("onetimeexpenses"));
		actions1.doubleClick(elementLocator9).perform();
		driver.findElement(By.id("onetimeexpenses")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("onetimeexpenses")).sendKeys("0");
		driver.findElement(By.id("onetimeexpenses")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator10 = driver.findElement(By.id("propertytaxes"));
		actions1.doubleClick(elementLocator10).perform();
		driver.findElement(By.id("propertytaxes")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("propertytaxes")).sendKeys("0");
		driver.findElement(By.id("propertytaxes")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator11 = driver.findElement(By.id("homeinsurance"));
		actions1.doubleClick(elementLocator11).perform();
		driver.findElement(By.id("homeinsurance")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("homeinsurance")).sendKeys("0");
		driver.findElement(By.id("homeinsurance")).sendKeys(Keys.ENTER);
		
		WebElement elementLocator12 = driver.findElement(By.id("maintenanceexpenses"));
		actions1.doubleClick(elementLocator12).perform();
		driver.findElement(By.id("maintenanceexpenses")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("maintenanceexpenses")).sendKeys("0");
		driver.findElement(By.id("maintenanceexpenses")).sendKeys(Keys.ENTER);
		

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	//Row 1
	String str7=driver.findElement(By.id("yearheader")).getText();
	String str8=driver.findElement(By.id("principalheader")).getText();
	String str9=driver.findElement(By.id("interestheader")).getText();
	String str10=driver.findElement(By.id("insuranceandtaxesheader")).getText();
	String str11=driver.findElement(By.id("totalheader")).getText();
	String str12=driver.findElement(By.id("balanceheader")).getText();
	String str13=driver.findElement(By.id("paidtodateheader")).getText();

	//Row 2
	String str14=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
	String str15=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
	String str16=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
	String str17=String.valueOf("0");
	//String str17=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[4]")).getText();
	String str18=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
	
	//String str19=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[6]")).getText();
	String str20=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[2]/td[7]")).getText();
	
	//Row 3
	
	String str21=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[1]")).getText();
	String str22=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
	String str23=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[3]")).getText();
	String str24=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[4]")).getText();
	String str25=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[5]")).getText();
	String str26=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[6]")).getText();
	String str27=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[8]/table[1]/tbody[1]/tr[4]/td[7]")).getText();
	write.writecellValue(0,str7,str8,str9,str10,str11,str12,str13,1,str14,str15,str16,str17,str18,str20,2,str21,str22,str23,str24,str25,str26,str27);
	////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println("**************************************************************************");
	System.out.println("After changing the  Loan Amount,Interest Rate and Loan Tenure ");
	driver.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/a[1]")).click();
	Actions actions11 = new Actions(driver);
	WebElement elementLocator13 = driver.findElement(By.id("loanamount"));
	actions11.doubleClick(elementLocator13).perform();
	WebElement elementLocator133 = driver.findElement(By.id("loanamount"));
	actions11.doubleClick(elementLocator133).perform();
	driver.findElement(By.id("loanamount")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("loanamount")).sendKeys("2000000");
	
	
	Actions actions12 = new Actions(driver);
	WebElement elementLocator14=driver.findElement(By.id("loaninterest"));
	actions12.doubleClick(elementLocator14).perform();
	actions12.doubleClick(elementLocator14).perform();
	driver.findElement(By.id("loaninterest")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("loaninterest")).sendKeys("11");
	driver.findElement(By.id("loaninterest")).sendKeys(Keys.ENTER);
	
	Actions actions13 = new Actions(driver);
	WebElement elementLocator15=driver.findElement(By.id("loanterm"));
	actions13.doubleClick(elementLocator15).perform();
	driver.findElement(By.id("loanterm")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("loanterm")).sendKeys("5");
	driver.findElement(By.id("loanterm")).sendKeys(Keys.ENTER);
	
	
	//////////////////////////////////////////////////////////////	
	String strr1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]")).getText();
	System.out.println(strr1);
	String strr2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/span[1]")).getText();
	System.out.println("INR "+strr2);
	String strr3=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h4[1]")).getText();
	System.out.println(strr3);
	String strr4=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/span[1]")).getText();
	System.out.println(strr4);
	String strr5=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/h4[1]")).getText();
	System.out.println(strr5);
	String strr6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/p[1]/span[1]")).getText();
	System.out.println(strr6);

	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}

}
