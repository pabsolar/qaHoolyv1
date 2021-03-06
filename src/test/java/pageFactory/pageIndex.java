package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageIndex {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public pageIndex(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/h3")
    public WebElement labelBienvenido;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div/div/div/input")
    public WebElement textRut;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    public WebElement btnSiguiente_001;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div/div/div/input")
    public WebElement textPass;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    public WebElement btnSiguiente_002;
    
    //Iniciar sesión por primera vez
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div/div/input")
    public WebElement textPassNueva;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div/div/input")
    public WebElement textReIngresarPassNueva;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    public WebElement btnSiguiente_003;
    
    //Salesforce
    @FindBy(name = "username")
    public WebElement textUsuarioSalesForce;
    
    @FindBy(name = "password")
    public WebElement textPassSalesForce;
    
    @FindBy(name = "token")
    public WebElement textTokenSalesForce;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    public WebElement btnSiguiente_004;
    
    //Iniciar por primera vez
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/button")
    public WebElement btnAcceder;
}
