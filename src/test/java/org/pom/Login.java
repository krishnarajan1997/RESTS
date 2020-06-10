package org.pom;

import org.helperclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
public Login() {
	PageFactory.initElements(driver,this);
}
@FindBy(id="username")
private WebElement user;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLog() {
	return log;
}
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement log;
}
