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

public class caso0059_Actualizar_AFP_durante_llamada {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	variables variables;
	
	List<String> errores = new ArrayList<>();
	String Caso = "caso0059_Actualizar_AFP_durante_llamada";
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
			System.out.println("Se Ingresa RUT Registrado");
			Thread.sleep(300);
			objIndex.textRut.click();
			Thread.sleep(300);
			objIndex.textRut.sendKeys(variables.rutHoolyOk);
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
			objIndex.textPass.sendKeys(variables.passHoolyOk);
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
	public void actualizarAFP() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Datos del Cliente");
			tools.screenshot("scripts", Caso , "Llamada Activa");
			Thread.sleep(200);
			objCaller.selAFPActual.sendKeys(variables.afpActual);
			tools.screenshot("scripts", Caso , "AFP Modificada");
			Thread.sleep(100);
			objCaller.btnGuardarInfirmacionCliente.click();
			Thread.sleep(750);
			tools.screenshot("scripts", Caso , "Mensaje de Guardar Datos");
			Thread.sleep(300);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 5)
	public void cancelarLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se cancela la llamada");
			tools.screenshot("scripts", Caso , "Se cancela la llamada");
			Thread.sleep(200);
			objCaller.btnFinalizarLlamada.click();
			tools.screenshot("scripts", Caso , "Llamada Cancelada");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 5)
	public void cerrarLead() {
		try {
			System.out.println("Se inicia el cierre del Lead");
			Thread.sleep(300);
			objCaller.selEstado.sendKeys(variables.estadoCierreCliente);
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Se actualiza el estado de cierre");
			objCaller.textNota.sendKeys(variables.notaCliente);
			Thread.sleep(750);
			tools.screenshot("scripts", Caso , "Se ingresa una nota del lead");
			System.out.println("Se cierra el Lead");
			objCaller.btnGuardarDatos.click();
			tools.screenshot("scripts", Caso , "Se cierra el Lead");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 6)
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
	
	
	@Test (priority = 7)
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
