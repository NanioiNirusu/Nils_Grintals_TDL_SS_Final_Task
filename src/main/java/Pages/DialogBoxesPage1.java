package Pages;


import Pages.Objects.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Pages.Objects.Link;

public class DialogBoxesPage1
{
    public Button createAnAccount = new Button("Create an account", "css=body #create-user");


    @FindBy(xpath ="//table[@id='users']//td[contains(text(),'Nils Grintals']")
    public WebElement newUser;
    /*public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "keyword")
    private WebElement searchField;

    @FindBy(name = "searchProducts")
    private WebElement searchButton;

    @FindBy(css = "#SidebarContent a:first-child")
    private WebElement fishButton;

    public void search(String searchKeyword)
    {
        this.searchField.sendKeys(searchKeyword);
        this.searchButton.click();
    }
    public void clickOnFishButton()
    {
        this.fishButton.click();
    }*/
    public boolean isInitialized()
    {
        return createAnAccount.isButtonPresent();
    }
}


