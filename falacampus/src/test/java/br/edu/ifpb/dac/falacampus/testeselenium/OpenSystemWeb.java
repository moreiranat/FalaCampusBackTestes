package br.edu.ifpb.dac.falacampus.testeselenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class OpenSystemWeb {
	

	private static WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	
	@AfterAll
	static void tearDown() {
		//driver.close();
		driver.quit();
	}

	@Test
	@DisplayName("Open screen Home")
	void home() throws InterruptedException {
		driver.get("http://localhost:3000");
		Thread.sleep(2000);
	}
	
//	@Test
//	@DisplayName("verify title of tab")
//	void title() {
//		assertTrue(driver.getTitle().contentEquals("falacampus"));
//	}


}
