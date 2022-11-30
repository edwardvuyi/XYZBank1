package pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class accountPage {

    private WebDriver driver;

    private By deposit = By.xpath("/html/body/div[3]/div/div[2]/div/div[3]/button[2]");

    private By amount = By.xpath("//input[@type='number']");

    private By submit = By.xpath("//button[@type='submit']");

    private By successful = By.xpath("/html/body/div[3]/div/div[2]/div/div[4]/div/span");

    public accountPage(WebDriver driver) {
        this.driver = driver;
    }
    public void depositButton1(){
        driver.findElement(deposit).click();

    }
public void amount(){
    driver.findElement(amount).click();
    driver.findElement(amount).sendKeys("333");
    driver.findElement(submit).click();
}
public void success() {
}
//Assertions.assertEquals(successful.isDisplayed(), true);
}


