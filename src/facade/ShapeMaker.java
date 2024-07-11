package facade;

import facade.shapes.Circle;
import facade.shapes.Rectangle;

public class ShapeMaker {
	private Circle circle;
	private Rectangle rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
}
