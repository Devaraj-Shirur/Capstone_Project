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
public class EducationPage {
	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Education']")
	private WebElement educationTabButton;
	
	@FindBy(id = "University")
	private WebElement universityDropDown;
	
	@FindBy(id = "Highest Education")
	private WebElement highestEducationDropDown;
	
	@FindBy(id = "Specialization")
	private WebElement specilizationDropdown;

	public WebElement getEducationTabButton() {
		return educationTabButton;
	}

	public WebElement getUniversityDropDown() {
		return universityDropDown;
	}

	public WebElement getHighestEducationDropDown() {
		return highestEducationDropDown;
	}

	public WebElement getSpecilizationDropdown() {
		return specilizationDropdown;
	}
	
	
}
