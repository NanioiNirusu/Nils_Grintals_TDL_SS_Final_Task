package Pages;

import Pages.Objects.Button;

public class GoogleVignette {
    public Button clickClose = new Button("Create an account", "div.ns-3vjzg-e-20 > span.ns-3vjzg-e-21");

    public boolean isInitialized()
    {
        return clickClose.isButtonPresent();
    }

}
