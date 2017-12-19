package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginFormController implements Initializable {
	
	@FXML
	private VBox loginVBox;
	@FXML
	private PasswordField passwordPasswordField;
	@FXML
	private Button loginButton;
	@FXML
	private Hyperlink createAccountHyperLink;
	@FXML
	private TextField removeFocus;
	private RegisterForm register = new RegisterForm();
	private MainForm main = new MainForm();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		disableLoginButton();
	}
	
	public void disableLoginButton() {
		
		loginButton.disableProperty().bind(
					Bindings.isEmpty(passwordPasswordField.textProperty())
		);
	}
	
	public void login( ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				main.start(new Stage());
			} catch(Exception e) {
				System.out.println("loadMainForm exception: " + e.getMessage());
			}
	}
	
	public void goToRegisterForm( ActionEvent event ) {
		
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			register.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
