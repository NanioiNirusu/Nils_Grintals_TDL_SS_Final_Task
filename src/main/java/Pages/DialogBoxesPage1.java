package Pages;


import Pages.Objects.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Pages.Objects.Link;

public class DialogBoxesPage1
{
    public Button createAnAccount = new Button("New user in list", "id=create-user");
    public Link newUser = new Link("Create an account", "xpath=//td[contains(text(), 'James Bond')]");




    public boolean isInitialized()
    {
        return createAnAccount.isButtonPresent();
    }
    public boolean isInitialized2()
    {
        return newUser.isLinkPresent();
    }

}


