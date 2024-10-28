package tp1.logic.gameobjects;

import tp1.logic.Position;

public class ExitDoor {
	Position pos;
	
	public ExitDoor(Position pos) {
		this.pos = pos;
	}

	public Position getPos () {
		return this.pos;
	}
	
	public boolean isInPosition(Position p) {
		return this.pos.equals(p);
	
	}
}
