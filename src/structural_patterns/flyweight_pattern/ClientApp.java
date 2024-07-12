package structural_patterns.flyweight_pattern;

import structural_patterns.flyweight_pattern.flyweight_factories.CircleFactory;
import structural_patterns.flyweight_pattern.flyweight_factories.RectangleFactory;
import structural_patterns.flyweight_pattern.shapes.Shape;

/**
 * The flyweight pattern classify the object into 2 types
 * 	1. Intrinsic (Immutable)
 * 	2. Extrinsic (Mutable)
 * 
 * We put those intrinsic objects to be managed by flyweight factory
 * Because the intrinsic objects will not change their state,
 * so it is not necessary to create them each time,
 * we only use the singleton object of that intrinsic object globally
 * 
 * Why use it?
 * 	It reduce the RAM usage (not need to manage a lot of duplicated intrinsic objects)
 * 
 * In this case:
 * 	Each circle with a specific color should be an intrinsic object.
 *  Where to draw the circle is extrinsic.
 */
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFactory circleFactory = new CircleFactory();
		RectangleFactory rectangleFactory = new RectangleFactory();
		
		Shape redCircle = circleFactory.getShape("red");
		redCircle.draw(10, 20);
		redCircle.draw(40, 20);
		
		Shape blueCircle = circleFactory.getShape("blue");
		blueCircle.draw(10, 20);
		blueCircle.draw(50, 50);
		
		Shape redRectangle = rectangleFactory.getShape("red");
		redRectangle.draw(24, 51);
		redRectangle.draw(31, 82);
		
		Shape blueRectangle = rectangleFactory.getShape("blue");
		blueRectangle.draw(60, 50);
		blueRectangle.draw(12, 50);
		
		Shape blueCircle2 = circleFactory.getShape("blue");
		blueCircle2.draw(16, 260);
		blueCircle2.draw(20, 50);
		
	}

}
