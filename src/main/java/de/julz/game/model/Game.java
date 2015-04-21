package de.julz.game.model;


public class Game {

	// the current board
	private GameState currentState;
	

	public Game() {
		reset();
	}
	
	public Game(Board board) {
		currentState = new GameState(board);
	}
	
	public void reset() {
		currentState = new GameState(new Board());
		currentState.getBoard().setRandomPositionNonEmpty();
		currentState.getBoard().setRandomPositionNonEmpty();
	}

	public Board getBoard() {
		return currentState.getBoard();
	}
	
	public GameState getCurrentState() {
		return currentState;
	}
	
	public int getScore() {
		return currentState.getScore();
	}
	
	public boolean isFinished() {
		return currentState.getPossibleMoves().isEmpty();
	}

	public GameState next(Action action) {
		currentState = currentState.next(action);
		return currentState;
	}



}
