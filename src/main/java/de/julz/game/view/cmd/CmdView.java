package de.julz.game.view.cmd;

import de.julz.game.model.Board;
import de.julz.game.view.View;
import de.julz.game.view.ui.ArrayKeyAdapter;

public class CmdView implements View {


	public CmdView(Board board) {
		new ArrayKeyAdapter();

	}


	public void update(Board board) {
		System.out.println(board);
	}
	

}