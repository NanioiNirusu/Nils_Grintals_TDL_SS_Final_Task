package Pages;


import Pages.Objects.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Pages.Objects.Link;

    public class HomePage
    {
        public Button dialogBox = new Button("Dialog Box", "xpath=//*[@id='post-2715']/div[2]/div/div/div[2]/div[1]/ul/li[6]/a");

        public Button tabs = new Button("Tabs", "xpath=//a[@class='button tiny_button button_pale regular_text' and text()='Tabs']");

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
            return dialogBox.isButtonPresent();
        }
    }


