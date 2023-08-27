package Pages;

import Pages.Objects.Button;
import Pages.Objects.TextField;

public class DialogBoxesPage2 {
    public TextField username = new TextField("Username", "css=fieldset input[name='name']", "James Bond");
    public TextField email = new TextField("Email", "css=fieldset input[name='email']", "nils@gmail.com");

    public TextField password = new TextField("Password", "css=fieldset input[name='password']", "Nani111");
    public Button loginButton = new Button("Login","css=div.ui-dialog-buttonset button:first-child");



    public void dialogBoxesPage2()
    {
        this.username.clearField();
        this.username.setValue();
        this.email.clearField();
        this.email.setValue();
        this.password.clearField();
        this.password.setValue();
        this.loginButton.click();
    }
}
