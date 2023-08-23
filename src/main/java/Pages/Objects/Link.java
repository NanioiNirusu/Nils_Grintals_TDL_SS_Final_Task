package Pages.Objects;

import Pages.Objects.BasePageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Link extends BasePageObject
{
    public Link(String name, String locator)
    {
        super(name, locator);
    }

    public void click()
    {
        WebElement link = getWebElement(getLocator());
        link.sendKeys(Keys.DOWN);
        System.out.println(link);

        link.click();
        System.out.println("Link " + getName() + " was clicked");
    }
    public boolean isLinkPresent()
    {
        WebElement link = getWebElement(getLocator());
        return link.isDisplayed();
    }
}
