package prototype;

import prototype.games.Game;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var gameCache = new GameAppCache();
		gameCache.loadCache();
		Game game = gameCache.getGame(1);
		game.start();
	}

}
