package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\Chromedriver.exe");//тут путь до сачанного драйвера
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");



        //System.out.println( "Hello World!" );
    }
}
