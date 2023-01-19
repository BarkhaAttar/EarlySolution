package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erapplication;
import POM.Erborrowercontact;
import POM.Erborrowerinterview;
import POM.Ercontactscreen;
import POM.Erimageupload;
import POM.Erlogin;

public class TestAllScenario {
WebDriver driver;
	
	
	@BeforeMethod
	public void browseon() {
		driver=Browser.openBrowser();
	}
	
	
	@Test
	public void clickonapplication() throws InterruptedException, AWTException{
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);
		 Erlogin erlogin=new Erlogin(driver);
		 erlogin.EnteruserID("cscbarkha",driver);
		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 
		 Erapplication erapplication=new Erapplication(driver);
		 erapplication.clickonapplication();
		 erapplication.clickoncollection(driver);
		 erapplication.enteraccountnumber();
		 erapplication.clickonradio();
		 erapplication.selectphonetype(driver);
		 erapplication.clickoncontinue();
		 
		 Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		 ercontactscreen.clickoncomments(driver);
		 Thread.sleep(1000);
		 ercontactscreen.clickonclose(driver);
		 ercontactscreen.transferwindow(driver);
		 ercontactscreen.clickonnext1();	
		 
		 Erborrowercontact erborrowercontact=new Erborrowercontact(driver);
		 erborrowercontact.clickonallradio();
		 
		 Erborrowerinterview erborrowerinterview=new Erborrowerinterview(driver);
		 erborrowerinterview.clickoncall(driver);
		 erborrowerinterview.clickonresponce(driver);
		 erborrowerinterview.clickonreason(driver);
		 erborrowerinterview.clickonduration(driver);
		 erborrowerinterview.clickonstatus();
		 erborrowerinterview.clickonrequestletter(driver);
		 erborrowerinterview.clickondeliverypreferance(driver);
		 erborrowerinterview.clickoninterrupt(driver);
		 erborrowerinterview.clickonunwilling();
		 erborrowerinterview.entercomment();
		 
		 Erimageupload erimageupload=new Erimageupload(driver);
		 erimageupload.clickonapplicationre(driver);
		 erimageupload.enteraccount();
		 erimageupload.clickradio1();
		 erimageupload.selectphone1(driver);
		 erimageupload.clickonselect();
	     erimageupload.clickonadd(driver);
	     erimageupload.clickonstart(driver);
	     erimageupload.clickonlogout();

		
	}

}
