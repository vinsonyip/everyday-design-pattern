package structural_patterns.flyweight_pattern;

import structural_patterns.facade_pattern.shapes.Circle;
import structural_patterns.facade_pattern.shapes.Rectangle;

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
