package flyweight.shapes;

public class Circle implements Shape {
	private String color;
	public Circle (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public void draw(int coord_x, int coord_y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle at "+coord_x + "," + coord_y +" with color: " + color);
	}

}
