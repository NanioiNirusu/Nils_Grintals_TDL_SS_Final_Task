package Pages;

import Pages.Objects.Button;

public class AccordionAndTabsPage {

    public Button choose2Section = new Button("Create an account", "xpath=//h3[@class='ui-accordion-header ui-corner-top ui-accordion-header-collapsed ui-corner-all ui-state-default ui-accordion-icons' and text()='Section 2']");

    public boolean isInitialized()
    {
        return choose2Section.isButtonPresent();
    }
}
