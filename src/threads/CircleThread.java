package threads;
import model.Ball;
import ui.CircleController;

public class CircleThread extends Thread{
	private CircleController circleController;
	private Ball ball;
	
	public CircleThread(CircleController circleC, Ball ball) {
		circleController = circleC;
		this.ball = ball;
	}
	
	public void run() {
		while(true) {
			ball.move(circleController.getWidth());
			circleController.updateCircle();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
