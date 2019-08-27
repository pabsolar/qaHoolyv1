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

public class caso0005_Iniciar_Sesion_con_un_RUT_Registrado_en_SalesForce_Hooly_Cognito_sin_permisos_para_realizar_una_llamada {

	tools tools;
	pageIndex objIndex;
	pageDashboard objDashboard;
	pageCaller objCaller;
	String Caso = "caso0005_Iniciar_Sesion_con_un_RUT_Registrado_en_SalesForce_Hooly_Cognito_sin_permisos_para_realizar_una_llamada";
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = Caso;
	String _method = "";
	
	
	
	boolean continuar = true;
	
	
	
}
