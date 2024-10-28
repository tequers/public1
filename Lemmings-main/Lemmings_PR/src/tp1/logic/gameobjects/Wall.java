package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Position;
import tp1.view.Messages;

public class Wall {
	
	private Position pos;
	private Game game;
	
	public Wall(Position pos) {
		this.pos = pos;
	}
	
	public Position getPos() {
		return this.pos;
	}
	
	public String getSymbol() {
		return Messages.WALL;
	}
	
	public String toString(Position position) {
		if(this.pos.equals(position)) {
			return getSymbol();
		}
		else {
			return " ";
		}
	}

	public boolean isInPosition(Position p) {
		boolean ok = false;
		if(pos.equals(p)) {
			ok = true;
		}
		return ok;
	}
}
