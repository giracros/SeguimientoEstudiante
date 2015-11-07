package com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TCInsertarEstudiante {

	private WebDriver driver;
	private String baseUrl;
	

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testIngresarEstudiante() throws Exception {
		driver.get(baseUrl + "/SeguimientoEstudiante/IngresoEstudiante.jsp");
		driver.findElement(By.id("carnet")).clear();
		driver.findElement(By.id("carnet")).sendKeys("1018436098");
		driver.findElement(By.id("nombre")).clear();
		driver.findElement(By.id("nombre")).sendKeys("Cesar Jaramillo");
		driver.findElement(By.id("facultad")).clear();
		driver.findElement(By.id("facultad")).sendKeys("CienciasBasicas");
		driver.findElement(By.id("semestre")).clear();
		driver.findElement(By.id("semestre")).sendKeys("6");
		driver.findElement(By.id("materia")).clear();
		driver.findElement(By.id("materia")).sendKeys("Java III");
		driver.findElement(By.id("pacialI")).clear();
		driver.findElement(By.id("pacialI")).sendKeys("5");
		driver.findElement(By.id("parcialII")).clear();
		driver.findElement(By.id("parcialII")).sendKeys("5");
		driver.findElement(By.id("notaI")).clear();
		driver.findElement(By.id("notaI")).sendKeys("5");
		driver.findElement(By.id("notaII")).clear();
		driver.findElement(By.id("notaII")).sendKeys("4");
		driver.findElement(By.id("notaIII")).clear();
		driver.findElement(By.id("notaIII")).sendKeys("3");
		driver.findElement(By.id("coevaluacion")).clear();
		driver.findElement(By.id("coevaluacion")).sendKeys("3");
		driver.findElement(By.id("final")).clear();
		driver.findElement(By.id("final")).sendKeys("3");
		driver.findElement(By.id("observacion")).clear();
		driver.findElement(By.id("observacion")).sendKeys("Raspando");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
