package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	
	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//text[.='RESUME BUILDER']")
	private WebElement ResumeBuilderName;

	@FindBy(xpath = "//input[@placeholder='Frontend Technologies']")
	private WebElement frontendTechnologies;
	
	@FindBy(xpath = "//input[@placeholder='Backend Technologies']")
	private WebElement backendTechnologies;
	
	@FindBy(xpath = "//input[@placeholder='Middleware Technologies']")
	private WebElement middlewareTechnologies;
	
	@FindBy(xpath = "//input[@placeholder='Design Patterns']")
	private WebElement designePatterns;
	
	@FindBy(xpath = "//input[@placeholder='DataBase used']")
	private WebElement dataBaseUsed;
	
	@FindBy(xpath = "//input[@placeholder='Version Control System']")
	private WebElement VersionControlSystem;
	
	@FindBy(xpath = "//input[@placeholder='AWS']")
	private WebElement aws;
	
	@FindBy(xpath = "//input[@placeholder='SDLC']")
	private WebElement sdlc;
	
	@FindBy(xpath = "//input[@placeholder='Development Tools']")
	private WebElement developmentTool;
	
	@FindBy(xpath = "//li[.='HTML']")
	private WebElement html;
	
	@FindBy(xpath = "//li[.='JavaScript']")
	private WebElement javaScript;
	
	@FindBy(xpath = "//li[.='CSS']")
	private WebElement css;
	
	@FindBy(xpath = "//li[.='React js']")
	private WebElement reactJs;
	
	@FindBy(xpath = "//li[.='TypeScript']")
	private WebElement typeScript;
	
	@FindBy(xpath = "//li[.='AngularJS']")
	private WebElement angularJS;
	
	@FindBy(xpath = "//li[.='Bootstrap']")
	private WebElement booStrap;
	
	@FindBy(xpath = "//li[.='Java 1.8']")
	private WebElement java8;
	
	@FindBy(xpath = "//li[.='Sql']")
	private WebElement sql;
	
	@FindBy(xpath = "//li[.='Xml']")
	private WebElement xml;
	
	@FindBy(xpath = "//li[.='Hibernate with Jpa']")
	private WebElement hibernateWithJpa;
	
	@FindBy(xpath = "//li[.='spring']")
	private WebElement spring;
	
	@FindBy(xpath = "//li[.='Jdbc']")
	private WebElement jdbc;
	
	@FindBy(xpath = "//li[.='NodeJS']")
	private WebElement nodeJS;
	
	@FindBy(xpath = "//li[.='RestFull Services']")
	private WebElement restFullServices;
	
	@FindBy(xpath = "//li[.='Soap Services']")
	private WebElement soapServices;
	
	@FindBy(xpath = "//li[.='JMS']")
	private WebElement jms;
	
	@FindBy(xpath = "//li[.='Apache']")
	private WebElement apache;
	
	@FindBy(xpath = "//li[.='Singleton']")
	private WebElement singleton;
	
	@FindBy(xpath = "//li[.='Model view control']")
	private WebElement modelViewControl;
	
	@FindBy(xpath = "//li[.='Data transfer object']")
	private WebElement dataTransferObject;
	
	@FindBy(xpath = "//li[.='Data access object']")
	private WebElement dataAccessObject;
	
	@FindBy(xpath = "//li[.='Oracle 10g']")
	private WebElement oracle10g;
	
	@FindBy(xpath = "//li[.='MongoDB']")
	private WebElement mongoDb;
	
	@FindBy(xpath = "//li[.='SqlLite']")
	private WebElement sqlLite;
	
	@FindBy(xpath = "//li[.='DB2']")
	private WebElement db2;
	
	@FindBy(xpath = "//li[.='Github']")
	private WebElement gitHub;
	
	@FindBy(xpath = "//li[.='EC2']")
	private WebElement ec2;
	
	@FindBy(xpath = "//li[.='Waterfall model and agile Git']")
	private WebElement waterfallModelAndAgileGit;
	
	@FindBy(xpath = "//li[.='Maven']")
	private WebElement maven;

	@FindBy(xpath = "(//text[text()='Frontend Technologies']/../../../..//text)[2]")
	private WebElement frontendSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='Backend Technologies']/../../../..//text)[2]")
	private WebElement backendSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='Middleware Technologies']/../../../..//text)[2]")
	private WebElement middlewareSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='Design Patterns']/../../../..//text)[2]")
	private WebElement designePatternSeletedOptions;
	
	@FindBy(xpath = "(//text[text()='Databases']/../../../..//text)[2]")
	private WebElement databaseSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='Version Control System']/../../../..//text)[2]")
	private WebElement versionSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='AWS']/../../../..//text)[2]")
	private WebElement awsSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='SDLC']/../../../..//text)[2]")
	private WebElement sdlcSelectedOptions;
	
	@FindBy(xpath = "(//text[text()='Development Tools']/../../../..//text)[2]")
	private WebElement developmentToolSelectedOptions;
	
	@FindBy(xpath = "//button[text()='Download as']")
	private WebElement downloadAsButton;
	
	@FindBy(xpath = "//button[text()='PDF']")
	private WebElement downloadAsPdfButton;
	
	@FindBy(xpath = "//button[text()='WORD']")
	private WebElement downloadAsWordButton;
	
	public WebElement getDownloadAsButton() {
		return downloadAsButton;
	}

	public WebElement getDownloadAsPdfButton() {
		return downloadAsPdfButton;
	}

	public WebElement getDownloadAsWordButton() {
		return downloadAsWordButton;
	}

	public WebElement getBackendSelectedOptions() {
		return backendSelectedOptions;
	}

	public WebElement getMiddlewareSelectedOptions() {
		return middlewareSelectedOptions;
	}

	public WebElement getDesignePatternSeletedOptions() {
		return designePatternSeletedOptions;
	}

	public WebElement getDatabaseSelectedOptions() {
		return databaseSelectedOptions;
	}

	public WebElement getVersionSelectedOptions() {
		return versionSelectedOptions;
	}

	public WebElement getAwsSelectedOptions() {
		return awsSelectedOptions;
	}

	public WebElement getSdlcSelectedOptions() {
		return sdlcSelectedOptions;
	}

	public WebElement getDevelopmentToolSelectedOptions() {
		return developmentToolSelectedOptions;
	}

	public WebElement getFrontendSelectedOptions() {
		return frontendSelectedOptions;
	}

	public WebElement getJava8() {
		return java8;
	}

	public WebElement getCss() {
		return css;
	}

	public WebElement getSql() {
		return sql;
	}

	public WebElement getXml() {
		return xml;
	}

	public WebElement getHibernateWithJpa() {
		return hibernateWithJpa;
	}

	public WebElement getSpring() {
		return spring;
	}

	public WebElement getJdbc() {
		return jdbc;
	}

	public WebElement getNodeJS() {
		return nodeJS;
	}

	public WebElement getRestFullServices() {
		return restFullServices;
	}

	public WebElement getSoapServices() {
		return soapServices;
	}

	public WebElement getJms() {
		return jms;
	}

	public WebElement getApache() {
		return apache;
	}

	public WebElement getSingleton() {
		return singleton;
	}

	public WebElement getModelViewControl() {
		return modelViewControl;
	}

	public WebElement getDataTransferObject() {
		return dataTransferObject;
	}

	public WebElement getDataAccessObject() {
		return dataAccessObject;
	}

	public WebElement getOracle10g() {
		return oracle10g;
	}

	public WebElement getMongoDb() {
		return mongoDb;
	}

	public WebElement getSqlLite() {
		return sqlLite;
	}

	public WebElement getDb2() {
		return db2;
	}

	public WebElement getGitHub() {
		return gitHub;
	}

	public WebElement getEc2() {
		return ec2;
	}
	
	public WebElement getResumeBuilderName() {
		return ResumeBuilderName;
	}

	public WebElement getWaterfallModelAndAgileGit() {
		return waterfallModelAndAgileGit;
	}

	public WebElement getMaven() {
		return maven;
	}

	public WebElement getHtml() {
		return html;
	}

	public WebElement getJavaScript() {
		return javaScript;
	}

	public WebElement getReactJs() {
		return reactJs;
	}

	public WebElement getTypeScript() {
		return typeScript;
	}

	public WebElement getAngularJS() {
		return angularJS;
	}

	public WebElement getBooStrap() {
		return booStrap;
	}

	public WebElement getFrontendTechnologies() {
		return frontendTechnologies;
	}

	public WebElement getBackendTechnologies() {
		return backendTechnologies;
	}

	public WebElement getMiddlewareTechnologies() {
		return middlewareTechnologies;
	}

	public WebElement getDesignePatterns() {
		return designePatterns;
	}

	public WebElement getDataBaseUsed() {
		return dataBaseUsed;
	}

	public WebElement getVersionControlSystem() {
		return VersionControlSystem;
	}

	public WebElement getAws() {
		return aws;
	}

	public WebElement getSdlc() {
		return sdlc;
	}

	public WebElement getDevelopmentTool() {
		return developmentTool;
	} 
	
	
	
	
	

}
