package scripts;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import Tools.tools;
import Tools.variables;
import pageFactory.pageIndex;
import pageFactory.pageDashboard;
import pageFactory.pageCaller;

public class caso0013_Iniciar_Sesion_por_primera_vez_a_Hooly_con_credenciales_correctas_con_un_token_distinto_de_salesforce {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	variables variables;
	
	String Caso = "caso0013_Iniciar_Sesion_por_primera_vez_a_Hooly_con_credenciales_correctas_con_un_token_distinto_de_salesforce";
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = Caso;
	String _method = "";
	
	
	boolean continuar = true;
	
	@BeforeTest
	public void ejecutarBrowser() {
		tools = new tools();
		try {
			System.out.println("Se ejecuta chromedriver");
			Thread.sleep(100);
			tools.setUrl("https://qa.hooly.app/login/");
			tools.init();
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Cargar URL");
			System.out.println("Se inicia el paso 1");
			Thread.sleep(100);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			tools.stop();
		}
		
	}
	
	@Test (priority = 1)
	public void ingresarRUT() {
		objIndex = new pageIndex(tools.getDriver());
		variables = new variables();
		try {
			tools.screenshot("scripts", Caso , "Hooly Cargado");
			System.out.println("Se Ingresa un RUT Registrado");
			Thread.sleep(300);
			objIndex.textRut.click();
			Thread.sleep(300);
			objIndex.textRut.sendKeys(variables.rutModificable);
			tools.screenshot("scripts", Caso , "Ingreso de RUT Válido");
			objIndex.btnSiguiente_001.click();
			tools.screenshot("scripts", Caso , "Hooly solicita contraseña");
			Thread.sleep(300);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 2)
	public void ingresarPASS() {
		try {
			System.out.println("Se Ingresa una Contraseña");
			Thread.sleep(300);
			objIndex.textPass.click();
			Thread.sleep(300);
			objIndex.textPass.sendKeys(variables.passModificable);
			tools.screenshot("scripts", Caso , "Contraseña Ingresada");
			objIndex.btnSiguiente_002.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 3)
	public void modificarPassPrimeraVez() {
		try {
			System.out.println("Se solicita actualizar la contraseña por primera vez");
			tools.screenshot("scripts", Caso , "Modificar contraseña");
			Thread.sleep(300);
			objIndex.textPassNueva.sendKeys(variables.passModificable);
			tools.screenshot("scripts", Caso , "Ingresar contraseña nueva");
			Thread.sleep(300);
			objIndex.textReIngresarPassNueva.sendKeys(variables.passModificable);
			tools.screenshot("scripts", Caso , "Ingresar contrasña nueva nuevamente");
			
			System.out.println("Se guardaran los cambios, presionando Guardar Contraseña");
			objIndex.btnSiguiente_003.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 4)
	public void actualizarDatosConSalesForce() {
		try {
			System.out.println("Se solicita actualizar los datos de Salesforce - Usuario");
			tools.screenshot("scripts", Caso , "Actualizar datos Salesforce - Usuario");
			Thread.sleep(300);
			objIndex.textUsuarioSalesForce.sendKeys(variables.usuarioSalesforce);
			tools.screenshot("scripts", Caso , "Usuario SalesForce");
			Thread.sleep(300);
			
			System.out.println("Se solicita actualizar los datos de Salesforce - Contraseña");
			Thread.sleep(300);
			objIndex.textPassSalesForce.sendKeys(variables.passSalesforce);
			tools.screenshot("scripts", Caso , "Contraseña SalesForce");
			Thread.sleep(300);
			
			System.out.println("Se solicita actualizar los datos de Salesforce - Token");
			Thread.sleep(200);
			System.out.println("Se ingresa un token distinto");
			Thread.sleep(300);
			objIndex.textTokenSalesForce.sendKeys(variables.tokenSalesforceAlternativo);
			tools.screenshot("scripts", Caso , "Token Salesforce incorrecto");
			Thread.sleep(300);
			
			System.out.println("Se guardaran los cambios, presionando Botón Guardar Datos");
			objIndex.btnSiguiente_004.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	
	@Test (priority = 5)
	public void cerrarCaso() {
		objDashboard = new pageDashboard(tools.getDriver());
		try {
			System.out.println("Hooly nos envia un error controlado");
			Thread.sleep(300);
			System.out.println("Al validar que no actualiza la cuenta por error en credenciales, se cierra el caso satisfactoriamente");
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Error controlado al ingresar un token distinto");
			Thread.sleep(1500);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 6)
	public void cargarEvidencias() {
		try {
			
			System.out.println("Cargando datos a GIT");
			
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("bash", "-c", "cd " + System.getProperty("user.dir")+"/evidencia/" + 
					" ; git init ; " +
					" git add . ; " +
					" git commit -m \"all\" ;" +
					" git fetch ; " +
					" git pull --rebase origin master ; " +
					" git commit -m \"AutoTest\" ; " +
					" git remote add origin https://github.com/AFP-Capital/hooly-evidencia.git ; " +
					" git push  ; " +
					" git push origin master ; " +
					" git push -u origin master");
			Process p = processBuilder.start();
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@AfterTest
	public void cerrarBrowser() {
		try {
			
			System.out.println("Cerrando Caso");
			tools.screenshot("scripts", Caso , "Prueba Finalizada");
			Thread.sleep(3000);
			
			tools.stop();
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
}

