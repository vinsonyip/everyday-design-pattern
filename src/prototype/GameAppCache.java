package prototype;

import java.util.HashMap;
import java.util.Map;

import prototype.games.ChessGame;
import prototype.games.FishingGame;
import prototype.games.Game;
import prototype.games.WarGame;

/**
 * 1: Fishing game
 * 2: War game
 * 3: Chess game
 */
public class GameAppCache {
	Map<Integer, Game> gameCache = new HashMap<Integer, Game>();
	
	
	public Game getGame(int gameCode) {
		return (Game)gameCache.getOrDefault(gameCode, null).cloneObject();
	}
	
	
	public void loadCache() {
		Game fishingGame = new FishingGame();
		fishingGame.setId(1);
		Game warGame = new WarGame();
		warGame.setId(2);
		Game chessGame = new ChessGame();
		chessGame.setId(3);
		gameCache.putIfAbsent(fishingGame.getId(), fishingGame);
		gameCache.putIfAbsent(warGame.getId(), warGame);
		gameCache.putIfAbsent(chessGame.getId(), chessGame);
	}
}
