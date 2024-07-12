package structural_patterns.flyweight_pattern.flyweight_factories;

import java.util.HashMap;
import java.util.Map;

import structural_patterns.flyweight_pattern.shapes.Circle;
import structural_patterns.flyweight_pattern.shapes.Shape;

public class CircleFactory {
	private Map<String, Shape> circleMap;
	public CircleFactory() {
		circleMap = new HashMap<String, Shape>();
	}
	public Shape getShape(String color) {
		color = color.toLowerCase();
		Circle circle = (Circle)circleMap.getOrDefault(color, null);
		if(circle == null) {
			System.out.println("Create "+ color + " circle ...");
			circle = new Circle(color);
			circleMap.putIfAbsent(circle.getColor(), new Circle(color));
		}
		return circle;
	}
}
