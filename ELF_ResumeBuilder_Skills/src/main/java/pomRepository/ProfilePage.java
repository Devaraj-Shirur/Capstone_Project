package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Devaraj Shirur
 *
 */
public class ProfilePage {
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@value='LastName']")
	private WebElement lastName;
	
	@FindBy(id = "Technology")
	private WebElement technology;  //drop down is developed using select class

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTechnology() {
		return technology;
	}
	
	
	
	
	
	

}
