package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    private WebDriver driver;

    private By loginCus = By.xpath("//button[text()='Customer Login']");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginClick(){
    driver.findElement(loginCus).click();
}

}
