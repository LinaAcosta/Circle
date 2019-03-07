package ui;
import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import threads.CircleThread;

public class CircleController {

    @FXML
    private Circle blueCircle;
    @FXML
    private Pane pane;
    private Ball smallBall;
    private Stage stage;
    
    public void initialize() {
    	smallBall = new Ball(Ball.Direction.LEFT, blueCircle.getLayoutX(), blueCircle.getLayoutY(), blueCircle.getRadius());
    }
    

    @FXML
    public void moveCircle(ActionEvent event) {
    	CircleThread ct = new CircleThread(this, smallBall);
    	ct.start();
    }
    
    public void updateCircle() {
    	blueCircle.setLayoutX(smallBall.getX());
    	
    }

	public double getWidth() {
		return stage.getWidth();
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

}
