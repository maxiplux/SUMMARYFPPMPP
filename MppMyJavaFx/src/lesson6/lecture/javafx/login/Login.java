package lesson6.lecture.javafx.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Harlow Solid Italic", FontWeight.NORMAL, 20)); // Tahoma
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();

		grid.add(userTextField, 1, 1);

		Label lblPassword = new Label("Password:");

		Label lblUserId = new Label("User Id:");

		TextField txtUserId = new TextField();

		grid.add(lblUserId, 0, 3);
		grid.add(txtUserId, 1, 3);

		grid.add(lblPassword, 0, 4);
		grid.setGridLinesVisible(false);

		PasswordField passwordBox = new PasswordField();

		Button btnDoLogin = new Button("Sign in");
		HBox boxToDoLogin = new HBox(10);
		boxToDoLogin.setAlignment(Pos.BOTTOM_RIGHT);
		boxToDoLogin.getChildren().add(btnDoLogin);

		Button btnDoSingUp = new Button("Sign up");
		HBox boxToDoSingUp = new HBox(10);
		boxToDoSingUp.setAlignment(Pos.BOTTOM_RIGHT);
		boxToDoSingUp.getChildren().add(btnDoSingUp);

		grid.add(passwordBox, 1, 4);
		
		grid.add(boxToDoSingUp, 0, 5);
		grid.add(boxToDoLogin, 1, 5);

		Label lblMessageAction = new Label("");
		lblMessageAction.setVisible(false);
		grid.add(lblMessageAction, 1, 6);

		btnDoSingUp.setOnAction((event) -> {
			lblMessageAction.setVisible(true);
			System.out.println("aaaaaaaaaaaaaaaaaaaaa");
			lblMessageAction.setText("Sing up Button");
		});

		// "final" prevents modification by the handler
		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 7);
		btnDoLogin.setOnAction((event) -> {
			actiontarget.setFill(Color.FIREBRICK);
		 
			actiontarget.setText("Sign in button pressed");
		});

		// Scene scene = new Scene(grid, 500, 200);
		Scene scene = new Scene(grid);
		//scene.getStylesheets().add("login.css");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}