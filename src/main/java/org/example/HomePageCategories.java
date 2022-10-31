package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories {
         //imported inbuilt class through object
    protected static WebDriver driver;
        //main method
    public static void main(String[] args) {
        // set the driver property for Chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        //opens and mange and maximize the window
        driver.manage().window().maximize();
        // get the current URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of header menu by class name to go through the menu
        driver.findElement(By.className("header-menu")).click();
        //returns Text of the element of product1 of  by xpath
        String readText1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]")).getText();
        System.out.println("Category 1 " + readText1);
        //returns Text of the element of product2 of  by xpath
        String readText2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]")).getText();
        System.out.println("Category 2 " + readText2);
        //returns Text of the element of product3 of  by xpath
        String readText3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]")).getText();
        System.out.println("Category 3 " + readText3);
        //returns Text of the element of product4 of  by xpath
        String readText4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]")).getText();
        System.out.println("Category 4 " + readText4);
        //returns Text of the element of product5 of  by xpath
        String readText5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]")).getText();
        System.out.println("Category 5 " + readText5);
        //returns Text of the element of product6 of  by xpath
        String readText6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]")).getText();
        System.out.println("Category 6 " + readText6);
        //returns Text of the element of product7 of  by xpath
        String readText7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]")).getText();
        System.out.println("Category 7 " + readText7);
        //command to close the opened url web page
        driver.quit();

    }
}
