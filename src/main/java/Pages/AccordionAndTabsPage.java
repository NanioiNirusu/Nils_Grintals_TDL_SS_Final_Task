package Pages;

import Pages.Objects.Button;

public class AccordionAndTabsPage {

    public Button choose2Section = new Button("Choose the second section", "id='ui-id-3'");

    public boolean isInitialized()
    {
        return choose2Section.isButtonPresent();
    }
}
