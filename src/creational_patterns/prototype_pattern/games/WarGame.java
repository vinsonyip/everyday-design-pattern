package creational_patterns.prototype_pattern.games;

public class WarGame extends Game {
	public WarGame() {
		setName("Wargame");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

}
