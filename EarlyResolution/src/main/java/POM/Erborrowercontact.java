package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Erborrowercontact {
	

	@FindBy(xpath=("//input[@id='mailAddressCorrect_true']"))private WebElement radio1;
	@FindBy(xpath=("//input[@id='emailAddressesCorrect_true']"))private WebElement radio2;
	@FindBy(xpath=("//input[@id='question__NEWBORRC_allowAutoDialer1']"))private WebElement radio3;
	@FindBy(xpath=("(//input[@type='radio'])[7]"))private WebElement phone;
	@FindBy(xpath=("//button[@id='er-button-2']"))private WebElement carry;
	
	
	
	public Erborrowercontact(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	public void clickonphone() 
	{
		phone.click();
	}

	public void clickonallradio() 
	{
		radio1.click();
		radio2.click();
		radio3.click();
		carry.click();
		
	}


}
