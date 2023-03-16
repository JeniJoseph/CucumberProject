package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPojo extends BaseClass{
	
	
	public FaceBookPojo() {
		PageFactory.initElements(driver, this );
	}
  @FindBy(id="email")
  private WebElement userTxt;
  
  @FindBy(id="pass")
  private WebElement passTxt;
  
  @FindBy(name="login")
  private WebElement log;

public WebElement getLog() {
	return log;
}

public WebElement getUserTxt() {
	return userTxt;
}

public WebElement getPassTxt() {
	return passTxt;
}	


}
