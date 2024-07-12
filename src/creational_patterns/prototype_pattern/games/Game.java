package creational_patterns.prototype_pattern.games;

public abstract class Game implements Cloneable{
	private int id;
	private String name;
	public abstract void start();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object cloneObject() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(Exception err) {
			err.printStackTrace();
		}
		return clone;
	}
}
