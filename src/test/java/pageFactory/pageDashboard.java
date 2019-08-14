package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageDashboard {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public pageDashboard(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/h3")
    public WebElement labelBienvenido;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div/div[1]/span")
    public WebElement btnSesion;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div/div[2]/li")
    public WebElement btnCerrarSesion;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/button")
    public WebElement btnIniciarLlamador;
    

}
