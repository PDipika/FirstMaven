package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Products {
    //imported inbuilt class through object
    protected static WebDriver driver;
        //main method
    public static void main(String[] args) {
        // set the system property for Chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        //opens and mange and maximize the window
        driver.manage().window().maximize();
        // get the current URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of computers by xpath to click and go in to computers sub menu
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a")).click();
        //finding a location of desktop by xpath to clicks on desktop
        driver.findElement(By.xpath("//ul[@class=\"sublist\"]/li[1]/a")).click();
        //finding a location of 1st product string(given name of the product) value to returns Text of the element for Product 1
        String readText1 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2//a[@ href=\"/build-your-own-computer\"]")).getText();
        System.out.println("Product 1 " + readText1);
        // finding a location of 2nd product string (given name of the product) value to returns Text of the element for Product 2
        String readText2 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2//a[@ href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        System.out.println("Product 2 " + readText2);
        //finding a location of 3rd product string(given name of the product) value to returns Text of the element for Product 3
        String readText3 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2//a[@ href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        System.out.println("Product 3 " + readText3);
        //closing the opened url window
        driver.quit();
    }

}
