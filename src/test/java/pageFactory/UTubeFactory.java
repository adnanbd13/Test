package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UTubeFactory {
WebDriver driver ;
public UTubeFactory (WebDriver driver){
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}
@FindBy (how = How.XPATH, using =".//*[@id='search']") WebElement search;
public WebElement SearchBox (){
	return search;
}
}
