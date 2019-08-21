package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageCaller {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public pageCaller(WebDriver driver){
        this.driver = driver;	
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
    public void click(WebElement webElement){
    	wait.until(ExpectedConditions.visibilityOf(webElement));
    	webElement.click();
    }
    
    //Menu para Pausas
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/ul/li[1]")
    public WebElement btnReady;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/ul/li[2]")
    public WebElement btnAlmuerzo;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/ul/li[3]")
    public WebElement btnDescanso;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/ul/li[4]")
    public WebElement btnCapacitacionReunion;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/ul/li[5]")
    public WebElement btnGestionAdministrativa;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/button")
    public WebElement btnSalir;
    
    //Menu Llamador
    //Durante la llamada
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[1]/div[2]/button/i")
    public WebElement btnFinalizarLlamada;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[1]/div[1]/button/i")
    public WebElement btnSilenciarMicrofono;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[2]/button")
    public WebElement bntEnviarLinkSMS;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[1]")
    public WebElement btnConfirmarEnvio_001;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[2]")
    public WebElement btnCancelarEnvioSMS_001;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[2]/button")
    public WebElement btnReEnviarLinkSMS;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[1]")
    public WebElement btnConfirmarLinkSMS_002;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[2]")
    public WebElement btnCancelarEnvioSMS_002;
    
    
    //Información de Cierre
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/form/div/div[1]/div/div/div/div/select")
    public WebElement selEstado;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/form/div/div[2]/div/div/div/div/select")
    public WebElement selMotivoCierre;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/form/div/div[2]/div/div/div/div/select")
    public WebElement selOportunindad;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/form/div/div[2]/div/div/div/div/div/input")
    public WebElement textNota;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div/form/div/button")
    public WebElement btnGuardarDatos;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[1]")
    public WebElement btnContinuarSinGuardar;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/section[2]/div/button[2]")
    public WebElement btnCancelarContinuarSinGuardar;
    
    
    //Información del Cliente
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/h5[2]")
    public WebElement labelInformacionCliente;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[2]/div[1]/div/div/div/div/input")
    public WebElement textNombres;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[2]/div[2]/div/div/div/input")
    public WebElement textApellidos;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[3]/div[1]/div/div/div/div/input")
    public WebElement textRUT;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[3]/div[2]/div/div/div/div/input")
    public WebElement textFechaNacimiento;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[4]/div[1]/div/div/div/select")
    public WebElement selAFPActual;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[4]/div[2]/div/div/div/select")
    public WebElement selGenero;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[5]/div[1]/div/div/div/div/input")
    public WebElement textTelefono;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/div[5]/div[2]/div/div/div/div/input")
    public WebElement textCorreo;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div/button")
    public WebElement btnGuardarInfirmacionCliente;

}
