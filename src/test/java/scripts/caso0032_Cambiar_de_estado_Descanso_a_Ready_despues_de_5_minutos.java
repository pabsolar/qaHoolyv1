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

public class caso0032_Cambiar_de_estado_Descanso_a_Ready_despues_de_5_minutos {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	variables variables;
	
	List<String> errores = new ArrayList<>();
	String Caso = "caso0032_Cambiar_de_estado_Descanso_a_Ready_despues_de_5_minutos";
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
			Thread.sleep(100);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 4)
	public void cambioEstado() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Menu de Estados del Ejecutivo");
			Thread.sleep(300);
			tools.screenshot("scripts", Caso , "Imagen del Llamador Activo");
			Thread.sleep(200);
			System.out.println("Se selecciona el estado Descanso");
			objCaller.btnDescanso.click();
			tools.screenshot("scripts", Caso , "Ejecutivo en estado Descanso");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 5)
	public void volverReady() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Volver a estado Ready");
			Thread.sleep(300000);
			System.out.println("Se cambia a estado Ready");
			objCaller.btnReady.click();
			tools.screenshot("scripts", Caso , "Estado Modificado");
			Thread.sleep(3000);
			
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
			System.out.println("Se ha conectado la llamada");
			Thread.sleep(1500);
			tools.screenshot("scripts", Caso , "Pantalla del Llamador con datos del cliente");
			System.out.println("Se ha dado un tiempo de 10 segundos para esta prueba, se finalizara la llamada transcurrido el tiempo mencionado");
			Thread.sleep(2500);
			tools.screenshot("scripts", Caso , "Pantalla de datos del cliente");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 7)
	public void finalizarLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			Thread.sleep(4000);
			System.out.println("Se finaliza la Llamada");
			Thread.sleep(1000);
			objCaller.btnFinalizarLlamada.click();
			tools.screenshot("scripts", Caso , "Se finaliza la llamada");
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se ha finalizado la llamada");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 8)
	public void seleccionDeEstadoCierre() {
		try {
			System.out.println("Se comienza a Cerrar el Lead");
			tools.screenshot("scripts", Caso , "Cerrando Lead");
			Thread.sleep(100);
			objCaller.selEstado.click();
			objCaller.selEstado.sendKeys(variables.estadoCierreCliente);
			Thread.sleep(200);
			objCaller.selEstado.sendKeys(Keys.TAB);
			tools.screenshot("scripts", Caso , "Motivo de Cierre, Contactado");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 9)
	public void agregarNota() {
		try {
			System.out.println("Agregar Nota al Cierre del Lead");
			tools.screenshot("scripts", Caso , "Agregando Nota");
			Thread.sleep(100);
			objCaller.textNota.click();
			objCaller.textNota.sendKeys(variables.notaCliente);
			tools.screenshot("scripts", Caso , "Se ha agreado nota al Cierre");
			Thread.sleep(500);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 10)
	public void guardarDatos() {
		try {
			System.out.println("Se cierra el lead");
			tools.screenshot("scripts", Caso , "Cerrando Lead");
			Thread.sleep(300);
			objCaller.btnGuardarDatos.click();
			tools.screenshot("scripts", Caso , "Lead Cerrado");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 11)
	public void cerrarSesion() {
		objDashboard = new pageDashboard(tools.getDriver());
		objCaller = new pageCaller(tools.getDriver());
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
	
	
	@Test (priority = 12)
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
