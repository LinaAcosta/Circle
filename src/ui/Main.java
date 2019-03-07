package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OneBallOnScreen.fxml"));
		Parent root = fxmlLoader.load();
		
		CircleController circleC = fxmlLoader.getController();
		circleC.setStage(stage);
		
		Scene scene = new Scene(root);
		stage.setTitle("Ball Bouncing");
		stage.setScene(scene);
		stage.show();
	}

}
