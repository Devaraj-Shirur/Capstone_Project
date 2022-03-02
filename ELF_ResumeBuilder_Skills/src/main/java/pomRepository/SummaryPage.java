package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Summary']")
	private WebElement summaryTabButton;
	
	@FindBy(xpath = "//div[@class='underLine']")
	private WebElement summaryTextField;

	public WebElement getSummaryTabButton() {
		return summaryTabButton;
	}

	public WebElement getSummaryTextField() {
		return summaryTextField;
	}
	
}
