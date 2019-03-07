package model;

public class Ball {
	public final static int INCREMENT = 10;
	public enum Direction{RIGHT, LEFT};
	private Direction state;
	private double x;
	private double y;
	private double radio;

	public Ball(Direction state, double x, double y, double radio) {
		this.state = state;
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double radio() {
		return radio;
	}
	public Direction getState() {
		return state;
	}
	public void move(double width) {
		switch(state) {
		case RIGHT:
			x = x + INCREMENT;
			if(x >= width) {
				state = Direction.LEFT;
			}
				
			break;
		case LEFT:
			x = x - INCREMENT;
			if(x <= 0) {
				state = Direction.RIGHT;
			}
			break;
		}
	}

}
