package structural_patterns.facade_pattern;

import structural_patterns.flyweight_pattern.ShapeMaker;

/**
 * What is Facade?
 * 1. Facade pattern uses to hide the implementation details and complexity of object instantiation
 * 2. Facade pattern provide method to use the object behind the scene easier
 * 
 * In this case, the ShapeMaker is the facade
 * User use the ShapeMaker to access the Shape system and use the function without knowing the details
 */
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
	}

}
