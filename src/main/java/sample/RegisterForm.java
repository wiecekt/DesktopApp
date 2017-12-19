package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegisterForm extends Application {
	
	private LoginForm login = new LoginForm();

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/RegisterFormView.fxml") );
			Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Register");
			primaryStage.setOnCloseRequest(we -> login.start(new Stage()));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void startRegisterForm() {
		launch();
	}
	
}