package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement userNameTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement add_Emp;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_List;
	
	public void setUserName(String un) {
		userNameTxtBox.sendKeys(un);
	}
	public void setPwd(String pwd) {
		pwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void clickPim() {
		pim_Menu.click();
	}
	public void clickAddEmp() {
		add_Emp.click();
	}
	public void setFirstName(String fn) {
		fName.sendKeys(fn);
	}
	public void setLastName(String ln) {
		lName.sendKeys(ln);
	}
	public void clickSaveBtn() {
		saveBtn.click();
	}
	public void clickEmpList() {
		emp_List.click();
		
	}
	
	
	

}
