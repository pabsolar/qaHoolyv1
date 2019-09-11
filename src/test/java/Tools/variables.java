package Tools;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class variables {

	public String rutHoolyOk = "167675689";
	public String rutHoolyNoValido = "1k2k3k45k";
	public String rutNoHooly = "58701483";
	public String rutNoCognito = "58701483";
	public String rutNoSalesFroce = "58701483"; 
	public String rutSinPermiso = "13812407K";
	
//---------------------------------------------------------------------------------	
	public String rutModificable = "174329702"; //--- Eliminar en Cognito para ejecutar
//---------------------------------------------------------------------------------
	
	public String passHoolyOk = "Pablo12345.";
	public String passHoolyNo = "Test001.";
	public String passSinPermiso = "Hooly2019.";
	public String passModificable = "Hooly2019.";
	
	public String usuarioSalesforce = "pablo.solar@afpcapital.cl.celulasura";
	public String passSalesforce = "pabSolar88x!";
	public String tokenSalesforce = "5pMhJHyXsirKP8aT04W3WuMMB";
	
	public String usuarioSalesfroceAlternativo = "pablo.solar@afpcapital.cl.celulasur";
	public String passSalesforceAlternativo = "123123123";
	public String tokenSalesforceAlternativo = "123123123";
	
//---------------------------------------------------------------------------------	
	
	public String selMotivoAbierto = "Abierto";
	public String nota = "nota test qa 2019";
	public String Sprint = "Sprint 12 - ";
	
//---------------------------------------------------------------------------------		

	public String nombreCliente = "Chernobyl";
	public String apellidoCliente = "Cuacito";
	public String rutCliente = "167675689";
	public String fdnCliente = "13011988";
	public String afpActual = "Capital";
	public String generoCliente = "Masculino";
	public String telefonoCliente = "934067377";
	public String mailCliente = "test@test.cl";
	public String estadoCierreCliente = "Abierto";
	public String notaCliente = "Nota Test QA 2019";
	public String nombreClienteModificado = "Chernobyl QA";

//---------------------------------------------------------------------------------		

	public String nombreClienteFormatoDistinto = "123123123";
	public String apellidoClienteFormatoDistinto = "Cuacito";
	public String rutClienteFormatoDistinto = "167675689";
	public String fdnClienteFormatoDistinto = "13011988";
	public String afpActualFormatoDistinto = "Capital";
	public String generoClienteFormatoDistinto = "Masculino";
	public String telefonoClienteFormatoDistinto = "934067377";
	public String mailClienteFormatoDistinto = "test@test.cl";
	public String estadoCierreClienteFormatoDistinto = "Abierto";
	public String notaClienteFormatoDistinto = "Nota Test QA 2019";
	public String nombreClienteModificadoFormatoDistinto = "Chernobyl QA";
	
//---------------------------------------------------------------------------------		

		public String nombreClienteCampoVacio = "";
		public String apellidoClienteCampoVacio = "";
		public String rutClienteCampoVacio = "";
		public String fdnClienteCampoVacio = "";
		public String afpActualCampoVacio = "Selecciona";
		public String generoClienteCampoVacio = "Selecciona";
		public String telefonoClienteCampoVacio = "";
		public String mailClienteCampoVacio = "";
		public String estadoCierreClienteCampoVacio = "";
		public String notaClienteCampoVacio = "";
		public String nombreClienteModificadoCampoVacio = "";
}
