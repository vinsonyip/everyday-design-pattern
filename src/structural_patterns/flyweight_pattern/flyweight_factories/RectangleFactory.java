package structural_patterns.flyweight_pattern.flyweight_factories;

import java.util.HashMap;
import java.util.Map;

import structural_patterns.flyweight_pattern.shapes.Rectangle;
import structural_patterns.flyweight_pattern.shapes.Shape;

public class RectangleFactory {
	Map<String, Shape> rectangleMap;
	public RectangleFactory() {
		rectangleMap = new HashMap<String, Shape>();
	}
	
	public Shape getShape(String color) {
		color = color.toLowerCase();
		Rectangle rectangle = (Rectangle)rectangleMap.getOrDefault(color, null);
		if(rectangle == null) {
			System.out.println("Create "+ color + " rectangle ...");
			rectangle = new Rectangle(color);
			rectangleMap.putIfAbsent(color, rectangle);
		}
		
		return rectangle;
	}
}
