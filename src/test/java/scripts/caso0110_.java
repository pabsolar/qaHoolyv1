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
import pageFactory.pageIndex;
import pageFactory.pageDashboard;
import pageFactory.pageCaller;

public class caso0110_ {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "caso0075_Reenvio_sms_durante_llamada";
	String _method = "";
	
	String Caso = "caso0075_Reenvio_sms_durante_llamada";
	
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
			System.out.println("Se Ingresa RUT Registrado");
			Thread.sleep(300);
			objIndex.textRut.click();
			Thread.sleep(300);
			objIndex.textRut.sendKeys("187884845");
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
			System.out.println("Se Ingresa Contraseña");
			Thread.sleep(300);
			objIndex.textPass.click();
			Thread.sleep(300);
			objIndex.textPass.sendKeys("David12345.");
			tools.screenshot("scripts", Caso , "Se ha ingresado una contraseña");
			objIndex.btnSiguiente_002.click();
			Thread.sleep(200);
			tools.screenshot("scripts", Caso , "Se ha iniciado Sesión en Hooly");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 3)
	public void validarPagBienvenidos() {
		objDashboard = new pageDashboard(tools.getDriver());
		try {
			System.out.println("Bienvenidos a Hooly");
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Plataforma de Bienvenidos a Hooly");
			Thread.sleep(2000);
			System.out.println("Se inicia llamador");
			objDashboard.btnIniciarLlamador.click();
			tools.screenshot("scripts", Caso , "Se ha iniciado llamada mediante Hooly");
			Thread.sleep(7000);
			tools.screenshot("scripts", Caso , "Llamada Activa");
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 4)
	public void enviarSMS() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se envia SMS");
			Thread.sleep(200);
			objCaller.bntEnviarLinkSMS.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Enviar Link por SMS");
			Thread.sleep(200);
			objCaller.btnConfirmarEnvio_001.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se confirma y envia el SMS");
			Thread.sleep(3000);
			System.out.println("Se cancela la llamada");
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Pantalla despues del envio de SMS");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 5)
	public void reenviarSMS() {
		try {
			System.out.println("Se reenvia SMS");
			Thread.sleep(200);
			objCaller.btnReEnviarLinkSMS.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Reenviar Link por SMS");
			Thread.sleep(200);
			objCaller.btnConfirmarLinkSMS_002.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se confirma y se reenvia el SMS");
			Thread.sleep(3000);
			System.out.println("Se cancela la llamada");
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Pantalla despues del reenvio de SMS");
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	
	@Test (priority = 6)
	public void cancelarLlamada() {
		try {
			tools.screenshot("scripts", Caso , "Llamada Activa");
			Thread.sleep(200);
			System.out.println("Se cancela la llamada");
			objCaller.btnFinalizarLlamada.click();
			tools.screenshot("scripts", Caso , "Se cancela la llamada");
			System.out.println("Se selecciona la opción Abierto");
			objCaller.selEstado.sendKeys("Abierto");
			tools.screenshot("scripts", Caso , "Se selecciona la opción Abierto, no se ingresan notas");
			Thread.sleep(300);
			System.out.println("Se cierra el Lead");
			objCaller.btnGuardarDatos.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	
	@Test (priority = 7)
	public void cerrarSesion() {
		try {
			System.out.println("Se inicia el cierre de sesión");
			Thread.sleep(300);
			objCaller.btnSalir.click();
			tools.screenshot("scripts", Caso , "Salir Llamador");
			Thread.sleep(200);
			objDashboard.btnSesion.click();
			tools.screenshot("scripts", Caso , "Menu Perfil");
			Thread.sleep(300);
			objDashboard.btnCerrarSesion.click();
			tools.screenshot("scripts", Caso , "Cerrando Sesión");
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Pantalla de Inicio de Hooly");
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	
	@Test (priority = 8)
	public void cargarEvidencias() {
		try {
			
			System.out.println("Cargando datos a GIT");
			Thread.sleep(1000);
			
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
