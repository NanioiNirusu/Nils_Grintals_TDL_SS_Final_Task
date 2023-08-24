package Pages;

import Pages.Objects.Button;

public class ProgressBarPage {

    public Button chooseRPB = new Button("Random Progress Bar", "xpath=//li[@id='Random Progress Bar']");

    public Button randomColour = new Button("Random Colour", "css=button#colorButton");

    public Button randomDeterminate = new Button("Random Colour", "css=button#numButton");

    public boolean isInitialized1()
    {
        return chooseRPB.isButtonPresent();
    }

    public boolean isInitialized2()
    {
        return randomColour.isButtonPresent();
    }
}
