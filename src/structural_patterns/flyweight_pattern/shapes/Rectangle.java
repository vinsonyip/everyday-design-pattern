package structural_patterns.flyweight_pattern.shapes;

public class Rectangle implements Shape {
	private String color;
	public Rectangle(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	
	@Override
	public void draw(int coord_x, int coord_y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle at "+coord_x + "," + coord_y +" with color: " + color);
	}

}
