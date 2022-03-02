package skills;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.Base_Class;
import pomRepository.SkillsPage;
/***
 * 
 * @author Devaraj Shirur
 *
 */
public class RB_SKILLS_TC119Test extends Base_Class{
	SkillsPage skillPage;
	
	@Test
	public void fullStackDevelpomentEngineerSkills(){
		skillPage = new SkillsPage(driver);
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
		
		Actions action = new Actions(driver);
		WebElement downloadAs = skillPage.getDownloadAsButton();
		WebElement pdfDownload = skillPage.getDownloadAsPdfButton();
		action.moveToElement(downloadAs).perform();
		action.moveToElement(pdfDownload).click().build().perform();
		Reporter.log("DOWNLOADED SUCCESSFULLY", true); 
		
	}

}
