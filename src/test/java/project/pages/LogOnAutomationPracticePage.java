package project.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LogOnAutomationPracticePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(@class, 'login')]")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[contains(@id,'SubmitLogin')")
    private WebElement submitButton;


    public LogOnAutomationPracticePage(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }


    //LOGIN INTO ACCOUNT PAGE

// sign in button //a[contains(@class, 'login')]

// email input //input[@id='email']

//password input //input[@id='passwd']

//sign in button  //button[contains(@id,'SubmitLogin')]
//My account page


}
