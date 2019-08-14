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

public class caso0000_Flujo_Completo {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "caso0000_Flujo_Completo";
	String _method = "";
	
	String Caso = "caso0000_Flujo_Completo";
	
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
			System.out.println("Se Ingresa un RUT no valido");
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
			System.out.println("Se Ingresa un Contraseña valido");
			Thread.sleep(300);
			objIndex.textPass.click();
			Thread.sleep(300);
			objIndex.textPass.sendKeys("David12345.");
			tools.screenshot("scripts", Caso , "Se ingresa Contraseña");
			objIndex.btnSiguiente_002.click();
			Thread.sleep(200);
			tools.screenshot("scripts", Caso , "Se inicia sesión");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 3)
	public void ingresoDashboard() {
		objDashboard = new pageDashboard(tools.getDriver());
		try {
			tools.screenshot("scripts", Caso , "Dashboard Hooly");
			System.out.println("Bienvenido a la plataforma Hooly");
			Thread.sleep(200);
			objDashboard.btnIniciarLlamador.click();
			tools.screenshot("scripts", Caso , "Se ha iniciado el Llamador");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 4)
	public void iniciandoLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se ha conectado la llamada");
			Thread.sleep(1500);
			tools.screenshot("scripts", Caso , "Pantalla del Llamador con datos del cliente");
			System.out.println("Se ha dado un tiempo de 20 segundos para esta prueba, se finalizara la llamada transcurrido el tiempo mensionado");
			Thread.sleep(6000);
			objCaller.btnFinalizarLlamada.click();
			Thread.sleep(1500);
			tools.screenshot("scripts", Caso , "Pantalla de datos del cliente");
			Thread.sleep(1500);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 5)
	public void ModificarDatosClienteNombre() {
		try {
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Cliente");
			System.out.println("Modificar Datos, Nombre");
			Thread.sleep(100);
			objCaller.textNombres.click();
			objCaller.textNombres.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Chernobyl");
			tools.screenshot("scripts", Caso , "Se ha modificado el Nombre del Cliente");
			Thread.sleep(200);
			objCaller.btnGuardarInfirmacionCliente.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Mensaje de Guardar Datos");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 6)
	public void ModificarDatosClienteApellido() {
		try {
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Cliente");
			System.out.println("Modificar Datos, Nombre");
			Thread.sleep(200);
			objCaller.textApellidos.click();
			objCaller.textApellidos.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Testing");
			tools.screenshot("scripts", Caso , "Se ha modificado el Apellido del Cliente");
			Thread.sleep(200);
			objCaller.btnGuardarInfirmacionCliente.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Mensaje de Guardar Datos");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 7)
	public void ModificarDatosClienteRUT() {
		try {
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Cliente");
			System.out.println("Modificar Datos, Nombre");
			Thread.sleep(200);
			objCaller.textRUT.click();
			objCaller.textRUT.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "167675689");
			tools.screenshot("scripts", Caso , "Se ha modificado el RUT del Cliente");
			Thread.sleep(200);
			objCaller.btnGuardarInfirmacionCliente.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Mensaje de Guardar Datos");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 8)
	public void ModificarDatosClienteFDN() {
		try {
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Cliente");
			System.out.println("Modificar Datos, Nombre");
			Thread.sleep(200);
			objCaller.textFechaNacimiento.click();
			objCaller.textFechaNacimiento.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "13011988");
			tools.screenshot("scripts", Caso , "Se ha modificado la FDN del Cliente");
			Thread.sleep(200);
			objCaller.btnGuardarInfirmacionCliente.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Mensaje de Guardar Datos");
			Thread.sleep(1000);
			
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
