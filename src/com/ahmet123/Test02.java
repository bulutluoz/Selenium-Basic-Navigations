package com.ahmet123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        //1-Test02 isimli bir class olusturun
        //2- https://www.walmart.com/ adresine gidin

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.walmart.com");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Wallmart” ifadesi icerdigini control edin
        String currentTitle=driver.getTitle();
        String expectedString="Save";
        if (currentTitle.contains(expectedString)){
            System.out.println("Title Contains test : PASS");
        }else {
            System.out.println("FAILED");
            System.out.println("Sayfa basligi : '" + currentTitle +"' beklenen '" + expectedString + "' kelimesini icermiyor");
        }
        //6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz
        String expectedTitle ="Walmart.com | Save Money.Live Better";
            if (currentTitle.equals(expectedTitle)){
                System.out.println("Title kontrol testi PASS");
            }else {
                System.out.println("Title kontrol testi FAILED");
                System.out.println("Current Titele : "+ currentTitle);
                System.out.println("Beklenen Title : " + expectedTitle);
            }

        //7- URL in walmart.com icerdigini control edin

        String gecerliURL=driver.getCurrentUrl();
        String arananURLKelime= "walmart.com";
        if (gecerliURL.contains(arananURLKelime)){
            System.out.println("URL aranan kelime testi PASS");
        }else{
            System.out.println("Gecerli URL : '"+ gecerliURL + "' beklenen '"+arananURLKelime+"' icermiyor");
        }
        Thread.sleep(5000);


        //8-Sayfayi kapatin
        driver.close();
    }

}
