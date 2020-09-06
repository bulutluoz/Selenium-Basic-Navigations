package com.ahmet123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        //1- com.seleniumofis isimli bir proje olusturun
        //2- com.ofis01 isimli bir package olusturun
        //3-Test01 isimli bir class olusturun
        //4- Gerekli ayarlari yapin ve driver olusturun
        //5- https://www.google.com/ adresine gidin

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:google.com");

        //6- sayfayi tam sayfa yapin
        driver.manage().window().maximize();
        //7- https://www.walmart.com/ adresine gidin
        driver.navigate().to("https://www.walmart.com");
        Thread.sleep(5000);
        //8- google sayfasina geri donunuz
        driver.navigate().back();
        Thread.sleep(5000);
        //9-Sayfayi refresh yapin
        driver.navigate().refresh();
        Thread.sleep(5000);
        //10-Sayfayi kapatin
        driver.close();
    }
}
