package creational_patterns.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

import creational_patterns.prototype_pattern.games.ChessGame;
import creational_patterns.prototype_pattern.games.FishingGame;
import creational_patterns.prototype_pattern.games.Game;
import creational_patterns.prototype_pattern.games.WarGame;

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
