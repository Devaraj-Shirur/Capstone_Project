package skills;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.EducationPage;
import pomRepository.ProfilePage;
import pomRepository.SkillsPage;
/***
 * 
 * @author Devaraj Shirur
 *
 */
public class RB_SKILLS_TC120 extends Base_Class{
	@Test
	public void mernResumeBuild() {
		ProfilePage profilePage = new ProfilePage(driver);
		ExcelUtil excel = new ExcelUtil();
		profilePage.getFirstName().clear();
		String firstname = excel.readStringDataFromExcel("Sheet1", 0, 0);
		profilePage.getFirstName().sendKeys(firstname);
		profilePage.getLastName().clear();
		String lastName = excel.readStringDataFromExcel("Sheet1", 1, 0);
		profilePage.getLastName().sendKeys(lastName);
		
		WebElement technology = profilePage.getTechnology();		
		Select select = new Select(technology);
		select.selectByIndex(2);
		
		SkillsPage skillPage = new SkillsPage(driver);
		homePage.getSkillsModuleLink().click();
		
		skillPage.getFrontendTechnologies().click();
		skillPage.getBooStrap().click();
		String expectedFrontendTech = skillPage.getBooStrap().getText();
		String actualFrontendTech = skillPage.getFrontendSelectedOptions().getText();
		Assert.assertEquals(actualFrontendTech, expectedFrontendTech, "Frontend Technologies Selection is Unsuccessfully");
		Reporter.log("Frontend Technologies Selected Successfully", true);
		
		skillPage.getMiddlewareTechnologies().click();
		skillPage.getSoapServices().click();
		String expectedMiddlewareTech = skillPage.getSoapServices().getText();
		String actualMiddlewareTech = skillPage.getMiddlewareSelectedOptions().getText();
		Assert.assertEquals(actualMiddlewareTech, expectedMiddlewareTech, "Middleware Technologies Selection is Unsuccessfully");
		Reporter.log("Middleware Technologies Selected Successfully", true);
		
		skillPage.getBackendTechnologies().click();
		skillPage.getSpring().click();
		String expectedBackendTech = skillPage.getSpring().getText();
		String actualBackendTech = skillPage.getBackendSelectedOptions().getText();
		Assert.assertEquals(actualBackendTech, expectedBackendTech, "Backend Technologies Selection is unsuccessfully");
		Reporter.log("Backend Technologies Selected Successfully", true);
		
		skillPage.getDesignePatterns().click();
		skillPage.getDataAccessObject().click();
		String expectedDesignePattern = skillPage.getDataAccessObject().getText();
		String actualDesignePattern = skillPage.getDesignePatternSeletedOptions().getText();
		Assert.assertEquals(actualDesignePattern, expectedDesignePattern, "Designe Pattern Selection is Unsuccessfully");
		Reporter.log("Designe Patterns Selected Successfully", true);
		
		skillPage.getDataBaseUsed().click();
		skillPage.getDb2().click();
		String expectedDataBaseUsed = skillPage.getDb2().getText();
		String actualDataBaseUsed = skillPage.getDatabaseSelectedOptions().getText();
		Assert.assertEquals(actualDataBaseUsed, expectedDataBaseUsed, "Database Used selection Unsuccessfully");
		Reporter.log("ata Base Used Selected Successfully", true);
	
		skillPage.getVersionControlSystem().click();
		skillPage.getGitHub().click();
		String expectedVersionControlSystem = skillPage.getGitHub().getText();
		String actualVersionControlSystem = skillPage.getVersionSelectedOptions().getText();
		Assert.assertEquals(actualVersionControlSystem, expectedVersionControlSystem, "Version Control System Selection is Unsuccessfully");
		Reporter.log("Version Control System Selected Successfully", true);
		
		skillPage.getAws().click();
		skillPage.getEc2().click();
		String expectAws = skillPage.getEc2().getText();
		String actualAws = skillPage.getAwsSelectedOptions().getText();
		Assert.assertEquals(actualAws, expectAws, "AWS Selection is Unsuccessfull");
		Reporter.log("AWS Selected Successfully", true);
		
		skillPage.getSdlc().click();
		skillPage.getWaterfallModelAndAgileGit().click();
		String expectedSdlc = skillPage.getWaterfallModelAndAgileGit().getText();
		String actualSdlc = skillPage.getSdlcSelectedOptions().getText();
		Assert.assertEquals(actualSdlc, expectedSdlc, "SDLC Selection is Unuccessfully");
		Reporter.log("SDLC Selected Successfully", true);
		
		skillPage.getDevelopmentTool().click();
		skillPage.getMaven().click();
		String actualDevelopmentTool = skillPage.getMaven().getText();
		String expectedDevelopmentTool = skillPage.getDevelopmentToolSelectedOptions().getText();
		Assert.assertEquals(actualDevelopmentTool, expectedDevelopmentTool, "Development Tool Selection is Unsuccessfully");
		Reporter.log("Development Tool Selected Successfully", true);
		
		EducationPage ep = new EducationPage(driver);
		ep.getEducationTabButton().click();
		WebElement education = ep.getHighestEducationDropDown();
		Select select1 =new Select(education);
		select1.selectByIndex(3);
		
		WebElement specilization = ep.getSpecilizationDropdown();
		Select select2 = new Select(specilization);
		select2.selectByIndex(3);
		
		WebElement university = ep.getUniversityDropDown();
		Select select3 = new Select(university);
		select3.selectByIndex(3);
		
		Actions action = new Actions(driver);
		WebElement downloadAs = skillPage.getDownloadAsButton();
		WebElement wordDownload = skillPage.getDownloadAsWordButton();
		action.moveToElement(downloadAs).perform();
		action.moveToElement(wordDownload).click().build().perform();
		Reporter.log("DOWNLOADED SUCCESSFULLY", true); 
		
	}
}
