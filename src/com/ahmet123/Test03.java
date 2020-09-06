package com.ahmet123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1-Test03 isimli bir class olusturun
        //2- https://www.walmart.com/ adresine gidin
        driver.get("https://www.walmart.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-”Nutella” icin arama yapiniz
        //once search box i locate edelim
        //<input type="text" class="h_a a8_b header-GlobalSearch-input mweb-Typeahead-input h_b" aria-autocomplete="both"
        // aria-label="Search Walmart.com" aria-controls="global-search-dropdown"
        // autocapitalize="off" autocomplete="off" autocorrect="off" id="global-search-input" name="query" placeholder="Search Walmart.com">

        //WebElement searchBox= driver.findElement(By.id("global-search-input"));

        //WebElement searchBox = driver.findElement(By.name("query"));
        //WebElement searchBox=driver.findElement(By.className("h_a a8_b header-GlobalSearch-input mweb-Typeahead-input h_b"));
        WebElement searchBox=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        String arananKelime="Nutella";
         searchBox.sendKeys(arananKelime, Keys.ENTER);
        //5- Kac sonuc bulundugunu yaziniz
        //<div class="result-summary-container" role="status"><span aria-hidden="true">1 - 40</span><span
        // class="visuallyhidden">1 to 40</span> of 56 results</div>
        WebElement sonuc=driver.findElement(By.className("result-summary-container"));
        //System.out.println(sonuc.getText());
        System.out.println(arananKelime + " aramasina "+ sonuc.getText().substring(sonuc.getText().indexOf("of")+3)+" bulundu");

        //6-Wallmart ana sayfaya geri donun
        driver.navigate().back();
        //7-Sayfayi kapatin
        driver.close();

    }
}
