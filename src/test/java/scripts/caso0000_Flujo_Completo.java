package scripts;

import Tools.tools;
import Tools.variables;
import pageFactory.pageIndex;
import pageFactory.pageDashboard;
import pageFactory.pageCaller;

import java.awt.RenderingHints.Key;
import java.io.IOException;
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


public class caso0000_Flujo_Completo {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	variables variables;
	
	List<String> errores = new ArrayList<>();
	String Caso = "caso0000_Flujo_Completo";
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
	public void ingresarRUT() throws IOException {
		objIndex = new pageIndex(tools.getDriver());
		variables = new variables();
		try {
			System.out.println("Se Ingresa un RUT valido");
			Thread.sleep(300);
			objIndex.textRut.click();
			Thread.sleep(1000);
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
			System.out.println("Se Ingresa una Contraseña valido");
			Thread.sleep(300);
			objIndex.textPass.click();
			Thread.sleep(300);
			objIndex.textPass.sendKeys(variables.passHoolyOk);
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
			Thread.sleep(800);
			objDashboard.btnIniciarLlamador.click();
			tools.screenshot("scripts", Caso , "Se ha iniciado el Llamador");
			Thread.sleep(1000);
			
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
			System.out.println("Se ha dado un tiempo de 20 segundos para esta prueba, se finalizara la llamada transcurrido el tiempo mencionado");
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
	
	
	@Test (priority = 5)
	public void enviarMensajeDuranteLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			System.out.println("Se inicia el envio de SMS");
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se inicia el proceso de Envio de SMS");
			System.out.println("Se presiona Enviar SMS");
			objCaller.bntEnviarLinkSMS.click();
			Thread.sleep(2500);
			tools.screenshot("scripts", Caso , "Se presiona el botón enviar Link por sms");
			System.out.println("Se presiona RE-Enviar SMS");
			objCaller.btnConfirmarEnvio_001.click();
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se presiona el botón re-enviar/confirmación Link por sms");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 6)
	public void finalizarLlamada() {
		objCaller = new pageCaller(tools.getDriver());
		try {
			Thread.sleep(4000);
			System.out.println("Se finaliza la Llamada");
			Thread.sleep(1000);
			tools.screenshot("scripts", Caso , "Se finaliza la llamada");
			System.out.println("Se presiona Enviar SMS");
			objCaller.btnFinalizarLlamada.click();
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
	
	@Test (priority = 7)
	public void modificarDatosClienteNombre() {
		try {
			System.out.println("Modificar Datos, Nombre");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Nombre Cliente");
			Thread.sleep(100);
			objCaller.textNombres.click();
			objCaller.textNombres.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.nombreCliente);
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
	
	@Test (priority = 8)
	public void modificarDatosClienteApeliido() {
		try {
			System.out.println("Modificar Datos, Apellido");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Apellido Cliente");
			Thread.sleep(100);
			objCaller.textApellidos.click();
			objCaller.textApellidos.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.apellidoCliente);
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
	
	@Test (priority = 9)
	public void modificarDatosClienteRUT() {
		try {
			System.out.println("Modificar Datos, RUT");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar RUT Cliente");
			Thread.sleep(100);
			objCaller.textRUT.click();
			objCaller.textRUT.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.rutCliente);
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
	
	@Test (priority = 10)
	public void modificarDatosClienteFDN() {
		try {
			System.out.println("Modificar Datos, Fecha de Nacimiento");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar FDN Cliente");
			Thread.sleep(300);
			objCaller.textFechaNacimiento.sendKeys(variables.fdnCliente);
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
	
	@Test (priority = 11)
	public void modificarDatosClienteAfpActual() {
		try {
			System.out.println("Modificar Datos, AFP Actual");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar AFP Actual Cliente");
			Thread.sleep(100);
			objCaller.selAFPActual.click();
			objCaller.selAFPActual.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.afpActual);
			tools.screenshot("scripts", Caso , "Se ha modificado la AFP del Cliente");
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
	
	@Test (priority = 12)
	public void modificarDatosClienteGenero() {
		try {
			System.out.println("Modificar Datos, Genero");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Genero Cliente");
			Thread.sleep(100);
			objCaller.selGenero.click();
			objCaller.selGenero.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.generoCliente);
			tools.screenshot("scripts", Caso , "Se ha modificado el Genero del Cliente");
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
	
	@Test (priority = 13)
	public void modificarDatosClienteTelefono() {
		try {
			System.out.println("Modificar Datos, Teléfono");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar teléfono Cliente");
			Thread.sleep(100);
			objCaller.textTelefono.click();
			objCaller.textTelefono.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.telefonoCliente);
			tools.screenshot("scripts", Caso , "Se ha modificado el teléfono del Cliente");
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
	
	@Test (priority = 14)
	public void modificarDatosClienteCorreo() {
		try {
			System.out.println("Modificar Datos, Correo");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Correo Cliente");
			Thread.sleep(100);
			//objCaller.textCorreo.click();
			objCaller.textCorreo.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.mailCliente);
			tools.screenshot("scripts", Caso , "Se ha modificado el correo del Cliente");
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

	@Test (priority = 15)
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

	@Test (priority = 16)
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
	
	@Test (priority = 17)
	public void modificarDatoClienteNombre() {
		try {
			System.out.println("Modificar Datos, Nombre");
			tools.screenshot("scripts", Caso , "Dashboard Hooly - Modificar Nombre Cliente");
			Thread.sleep(100);
			objCaller.textNombres.click();
			objCaller.textNombres.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.nombreClienteModificado);
			tools.screenshot("scripts", Caso , "Se ha modificado el Nombre del Cliente");
			Thread.sleep(500);
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}
	
	@Test (priority = 18)
	public void guardarDatos() {
		try {
			System.out.println("Se intentara cerrar el Lead sin guardar los datos del Cliente");
			tools.screenshot("scripts", Caso , "Datos pendientes por guardar");
			Thread.sleep(300);
			objCaller.btnGuardarDatos.click();
			tools.screenshot("scripts", Caso , "Hooly no permite cerrar el lead sin resguardar todos los datos");
			Thread.sleep(1000);
			
			System.out.println("Se cancela el mensaje para guardar los datos modificados del Cliente");
			objCaller.btnCancelarContinuarSinGuardar.click();
			tools.screenshot("scripts", Caso , "Se elimina el mensaje emergente");
			Thread.sleep(1000);
			
			System.out.println("Se guardan los datos pendientes del cliente");
			objCaller.btnGuardarInfirmacionCliente.click();
			tools.screenshot("scripts", Caso , "Se actualizan los datos del Cliente");
			Thread.sleep(1000);
			
			System.out.println("Se cierra el Lead");
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
	
	@Test (priority = 19)
	public void cerrarSesion() {
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
	
	@Test (priority = 20)
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
