package sample;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterFormController implements Initializable {
	
	@FXML
	private VBox registerVBox;
	@FXML
	private TextField loginTextField;
	@FXML
	private PasswordField passwordPasswordField;
	@FXML
	private PasswordField confirmPasswordField;
	@FXML
	private TextField emailTextField;
	@FXML
	private Button registerButton;
	@FXML
	private Hyperlink loginHyperLink;
	@FXML
	private CheckBox acceptCheckBox;

	@FXML
	private TextField removeFocus;
	private LoginForm login = new LoginForm();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		disableRegisterButton();
		
	}
	
	public void disableRegisterButton() {

		registerButton.disableProperty().bind(
				Bindings.isEmpty(emailTextField.textProperty())
				.or(Bindings.isEmpty(passwordPasswordField.textProperty()))
				.or(Bindings.isEmpty(confirmPasswordField.textProperty()))
	
		/*registerButton.disableProperty().bind(
			Bindings.isEmpty(loginTextField.textProperty())
			.or(Bindings.isEmpty(passwordPasswordField.textProperty())
			.or(Bindings.isEmpty(confirmPasswordField.textProperty()))))*/
		);
	}
	public void register( ActionEvent event) {
		System.out.println("poczatek rejestracji");
	}
	
	public void goToLoginForm( ActionEvent event ) { 
		
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			login.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
