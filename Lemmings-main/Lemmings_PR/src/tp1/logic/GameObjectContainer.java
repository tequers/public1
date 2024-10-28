package tp1.logic;

import tp1.logic.gameobjects.ExitDoor;
import tp1.logic.gameobjects.Lemming;
import tp1.logic.gameobjects.Wall;
import tp1.view.Messages;

public class GameObjectContainer {
	//TODO fill your code
	private Lemming listLemmings[];
	private int contLemmings;
	private Wall listWalls[];
	private int contWalls;
	private final int max_list = 50;
	private ExitDoor exitDoor;
	
	public GameObjectContainer() {
		listLemmings = new Lemming[max_list];
		contLemmings = 0;
		listWalls = new Wall[max_list];
		contWalls = 0;
		
	}
	
	public void add(Lemming lemming) {
		//Position pos = new Position(3,4);
		//lemming = new Lemming(pos);
		listLemmings[contLemmings] = lemming;
		contLemmings++;
	}
	
	public void add(Wall wall) {
		listWalls[contWalls] = wall;
		contWalls++;
	}
	
	public void add(ExitDoor exitDoor) {
		this.exitDoor = exitDoor;
	}
	
	public int getNumLemmings() {
		return this.contLemmings;
	}
	
	public String positionToString(int col, int row) {
		String str = "";
		Position p = new Position(col,row);
		for(int i = 0; i < contLemmings; i++) {
			if(listLemmings[i].isInPosition(p)) {
				str += listLemmings[i].toString(p);
			}
		}
		
		for(int i = 0; i < contWalls; i++) {
			if(p.equals(listWalls[i].getPos())) {
				str = listWalls[i].toString(p);
			}
		}
		
		if (this.exitDoor.isInPosition(new Position(col, row))) {
			str += Messages.EXIT_DOOR;
		}
		
		return str;
	}
	
	private void deleteLemming(int i) {
		listLemmings[i] = null;
		for (int index = i; i < contLemmings; i++) {
            listLemmings[i] = listLemmings[i + 1];
        }
		contLemmings--;
//		if(listLemmings[i].sigueVivo()) {
//			listLemmings[i] = null;
//			for (int index = i; i < contLemmings - 1; i++) {
//	            listLemmings[i] = listLemmings[i + 1];
//	        }
//		}
		
	}

	public void update() {
		int i = 0;
		while(i < contLemmings) {
			if(!listLemmings[i].sigueVivo()) {
				deleteLemming(i);
			}
			else if(listLemmings[i] != null) {
				listLemmings[i].update();
				++i;
			}
		}
		
//		for(int i = 0; i < contLemmings; i++) {
////			listLemmings[i].update();
////			if(!listLemmings[i].sigueVivo()) {
////				deleteLemming(i);
////				listLemmings[i].update();
////			}
//			if(!listLemmings[i].sigueVivo()) {
//				deleteLemming(i);
//				listLemmings[i-1].update();
//			}
//			else {
//				listLemmings[i].update();
//			}
			
//			if(!listLemmings[i].sigueVivo()) {
//				listLemmings[i] = null;
//			}
		}
	
	
	public boolean hayWall(Position pos) {
		boolean hayWall = false;
		int i=0;
		while (!hayWall && i < this.contWalls){
			if (this.listWalls[i].isInPosition(pos)) {
				hayWall = true;	
			}
			++i;
		}
		return hayWall;
	}
	
	public boolean lemmingInExitDoor(Lemming lemming) {
		return lemming.isInPosition(this.exitDoor.getPos());
	}
	
}
