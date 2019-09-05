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

public class caso0012_Iniciar_Sesion_por_primera_vez_a_Hooly_con_credenciales_correctas_con_un_usuario_distinto_de_salesforce {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	variables variables;
	
	String Caso = "caso0012_Iniciar_Sesion_por_primera_vez_a_Hooly_con_credenciales_correctas_con_un_usuario_distinto_de_salesforce";
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
			Thread.sleep(300);
			objIndex.textTokenSalesForce.sendKeys(variables.tokenSalesforce);
			tools.screenshot("scripts", Caso , "Token Salesforce");
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
	public void accederHooly() {
		objDashboard = new pageDashboard(tools.getDriver());
		try {
			System.out.println("Acceder a Hooly por primera vez");
			Thread.sleep(300);
			objIndex.btnAcceder.click();
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Primera imagen del Llamador");
			Thread.sleep(1500);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 6)
	public void iniciandoLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se iniciara el llamador");
			objDashboard.btnIniciarLlamador.click();
			tools.screenshot("scripts", Caso , "Se ha iniciado el llamador por primera vez");
			Thread.sleep(10000);
			objCaller.btnFinalizarLlamada.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 7)
	public void guardarDatos() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se cierra el Lead");
			tools.screenshot("scripts", Caso , "Cerrando Lead");
			System.out.println("Se asigna el motivo, Abierto");
			objCaller.selEstado.click();
			objCaller.selEstado.sendKeys(variables.selMotivoAbierto);
			tools.screenshot("scripts", Caso , "Motivo Almacenado");
			Thread.sleep(300);
			
			System.out.println("Se ingresa una nota");
			objCaller.textNota.sendKeys(variables.nota);
			Thread.sleep(200);
			objCaller.textNota.sendKeys(Keys.TAB);
			tools.screenshot("scripts", Caso , "Se ingresa una nota");
			Thread.sleep(300);
			
			System.out.println("Se cierra el Lead");
			System.out.println("Se presiona Guardar Datos");
			objCaller.btnGuardarDatos.click();
			tools.screenshot("scripts", Caso , "Se cierra el Lead");
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 8)
	public void cerrarSesion() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se inicia el cierre de sesión");
			Thread.sleep(300);
			objCaller.btnSalir.click();
			tools.screenshot("scripts", Caso , "Salir Llamador");
			
			System.out.println("Se presiona le menu del perfil ejecutivo");
			Thread.sleep(200);
			objDashboard.btnSesion.click();
			tools.screenshot("scripts", Caso , "Menu Perfil");
			Thread.sleep(300);
			
			System.out.println("Se cierra Sesión");
			objDashboard.btnCerrarSesion.click();
			tools.screenshot("scripts", Caso , "Cerrando Sesión");
			Thread.sleep(2000);
			tools.screenshot("scripts", Caso , "Pantalla de Inicio de Hooly");
			Thread.sleep(200);
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	
	@Test (priority = 9)
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
