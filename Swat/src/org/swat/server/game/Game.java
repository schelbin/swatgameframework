package org.swat.server.game;

import java.util.HashMap;

import org.swat.data.GAME_TYPE;
import org.swat.data.GameMove;
import org.swat.data.GameState;
import org.swat.server.game.exceptions.IllegalGameStateException;
import org.swat.server.game.exceptions.IllegalMoveException;

public interface Game {

	public abstract int getID();

	public String getName();

	public GAME_TYPE getGameType();

	public int getNumberOfPlayersNeeded();

	public int getBoardLength();

	public int getBoardWidth();

	public HashMap<Integer, String> getPieces();

	public GameState getInitialState();

	public GameState makeMove(GameState state, GameMove move)
			throws IllegalGameStateException, IllegalMoveException;

}
