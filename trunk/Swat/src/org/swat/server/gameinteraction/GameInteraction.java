package org.swat.server.gameinteraction;

import java.util.List;
import org.swat.server.game.Game;
import org.swat.server.game.GameState;
import org.swat.server.game.GameMove;


public interface GameInteraction {
	
	/*
	 * Provides a list of Game objects, whose 
	 * getName() provides the string name of that
	 * game, and getID() provides the UI for that
	 * game type
	 */
	public List<Game> getDeployedGames();
	
	/*
	 * Use ID obtained from getDeployedGames()
	 */
	public GameState createGame(int gameID);
	
	public List<GameState> getGamesThatNeedPlayers();
	
	
	public GameState makeMove(GameMove move);
	
	public GameState getGameState(int gameInstanceID);
	
	public GameState joinGame(int gameID, String playerUID);
	
	/*
	 * Retrieves the list of games for which the player
	 * is the owner
	 */
	public List<GameState> getPlayersGames(String playerUID);
	
	/*
	 * For persistence
	 */
	public List<GameState> getAllActiveGames();

}