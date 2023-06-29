package tests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ale -Curso\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        navegador.get("https://juliodelima.com.br/taskit");

        navegador.findElement(By.linkText("Task it!")).click();
        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("coli");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("123456");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals("Hi, Alexandre", saudacao);

        navegador.quit();

    }

}
