package creational_patterns.prototype_pattern;

import creational_patterns.prototype_pattern.games.Game;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var gameCache = new GameAppCache();
		gameCache.loadCache();
		Game game = gameCache.getGame(1);
		game.start();
	}

}
