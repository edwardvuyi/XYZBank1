package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class homePage {

    private WebDriver driver;

    private By dropDown = By.xpath("//select[@id='userSelect']");

    private By loginButton =By.xpath("//button[text()='Login']");

    public homePage(WebDriver driver) {
        this.driver = driver;

}

public void dropDownSelect() {

    driver.findElement(dropDown).click();

    Select dropDownElement = new Select(driver.findElement(dropDown));

    dropDownElement.selectByVisibleText("Harry Potter");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
public void harryLogin(){

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(loginButton).click();


}
}