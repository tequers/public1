package tp1.logic;

import tp1.logic.gameobjects.ExitDoor;
import tp1.logic.gameobjects.Lemming;
import tp1.logic.gameobjects.Wall;
import tp1.view.Messages;

public class Game {

	public static final int DIM_X = 10;
	public static final int DIM_Y = 10;
	private int Cycle;
	private int Lemmings;
	private GameObjectContainer container;
	private Lemming lemming;
	private int deadLemmings;
	private int lemmingsInBoard;
	private int lemmingsExit;
	private int lemmingsToWin;
	//
	private int nLevel;
	public Game(int nLevel) {
		// TODO Auto-generated constructor stub
		this.nLevel = nLevel;
		if (nLevel == 1) init1();
		else init0();
	
	}
	
	public void init0() {
		this.Cycle = 0;
		
		//INICIALIZACIÓN VARIABLES 
		this.deadLemmings = 0;
		this.lemmingsExit = 0;
		this.lemmingsToWin = 2;
		
		//AÑADIR CONTAINER
		container = new GameObjectContainer();
		//AÑADIR EXIT DOOR	
		ExitDoor exitDoor = new ExitDoor(new Position(4,5));
		container.add(exitDoor);
		//AÑADIR LEMMINGS
		Position pos1 = new Position(2,3);
		Lemming lemming1 = new Lemming(pos1, this);
		container.add(lemming1);
		
	
		Position pos3 = new Position(9,0);
		Lemming lemming3 = new Lemming(pos3, this);
		container.add(lemming3);
		
		Position pos4 = new Position(0,8);
		Lemming lemming4 = new Lemming(pos4, this);
		container.add(lemming4);
		
		
		//INICIALIZAR LEMMINGS IN BOARD
		this.lemmingsInBoard = container.getNumLemmings();
		
		//AÑADIR PAREDES
		Position posPared = new Position(2,4);
		Wall wall = new Wall(posPared); 
		container.add(wall);
		
		Position posPared2 = new Position(3,4);
		Wall wall2 = new Wall(posPared2); 
		container.add(wall2);
		
		Position posPared3 = new Position(4,4);
		Wall wall3 = new Wall(posPared3); 
		container.add(wall3);
		
		Position posPared9 = new Position(0,9);
		Wall wall9 = new Wall(posPared9); 
		container.add(wall9);
		
		Position posPared8 = new Position(1,9);
		Wall wall8 = new Wall(posPared8); 
		container.add(wall8);
		
		Position posPared6 = new Position(8,9);
		Wall wall6 = new Wall(posPared6); 
		container.add(wall6);
		
		Position posPared7 = new Position(9,9);
		Wall wall7 = new Wall(posPared7); 
		container.add(wall7);
		
		Position posPared4 = new Position(8,1);
		Wall wall4 = new Wall(posPared4); 
		container.add(wall4);
		
		Position posPared5 = new Position(9,1);
		Wall wall5 = new Wall(posPared5); 
		container.add(wall5);
		
		Position posPared10 = new Position(8,8);
		Wall wall10 = new Wall(posPared10); 
		container.add(wall10);
		
		Position posPared11 = new Position(4,6);
		Wall wall11 = new Wall(posPared11); 
		container.add(wall11);
		
		Position posPared12 = new Position(5,6);
		Wall wall12 = new Wall(posPared12); 
		container.add(wall12);
		
		Position posPared13 = new Position(6,6);
		Wall wall13 = new Wall(posPared13); 
		container.add(wall13);
		
		Position posPared14 = new Position(7,6);
		Wall wall14 = new Wall(posPared14); 
		container.add(wall14);
		
		Position posPared15 = new Position(7,5);
		Wall wall15 = new Wall(posPared15); 
		container.add(wall15);
		
		//
		
	}

	public void init1() {
	
			this.Cycle = 0;
			
			//INICIALIZACIÓN VARIABLES 
			this.deadLemmings = 0;
			this.lemmingsExit = 0;
			this.lemmingsToWin = 2;
			
			//AÑADIR CONTAINER
			container = new GameObjectContainer();
			//AÑADIR EXIT DOOR	
			ExitDoor exitDoor = new ExitDoor(new Position(4,5));
			container.add(exitDoor);
			//AÑADIR LEMMINGS
			
			Position pos1 = new Position(2,3);
			Lemming lemming1 = new Lemming(pos1, this);
			container.add(lemming1);
			
			Position pos2 = new Position(3,3);
			Lemming lemming2 = new Lemming(pos2, this);
			container.add(lemming2);
			
		
		
			Position pos3 = new Position(9,0);
			Lemming lemming3 = new Lemming(pos3, this);
			container.add(lemming3);
			
			Position pos4 = new Position(0,8);
			Lemming lemming4 = new Lemming(pos4, this);
			container.add(lemming4);
			
			
			//INICIALIZAR LEMMINGS IN BOARD
			this.lemmingsInBoard = container.getNumLemmings();
			
			//AÑADIR PAREDES
			Position posPared = new Position(2,4);
			Wall wall = new Wall(posPared); 
			container.add(wall);
			
			Position posPared2 = new Position(3,4);
			Wall wall2 = new Wall(posPared2); 
			container.add(wall2);
			
			Position posPared3 = new Position(4,4);
			Wall wall3 = new Wall(posPared3); 
			container.add(wall3);
			
			Position posPared9 = new Position(0,9);
			Wall wall9 = new Wall(posPared9); 
			container.add(wall9);
			
			Position posPared8 = new Position(1,9);
			Wall wall8 = new Wall(posPared8); 
			container.add(wall8);
			
			Position posPared6 = new Position(8,9);
			Wall wall6 = new Wall(posPared6); 
			container.add(wall6);
			
			Position posPared7 = new Position(9,9);
			Wall wall7 = new Wall(posPared7); 
			container.add(wall7);
			
			Position posPared4 = new Position(8,1);
			Wall wall4 = new Wall(posPared4); 
			container.add(wall4);
			
			Position posPared5 = new Position(9,1);
			Wall wall5 = new Wall(posPared5); 
			container.add(wall5);
			
			Position posPared10 = new Position(8,8);
			Wall wall10 = new Wall(posPared10); 
			container.add(wall10);
			
			Position posPared11 = new Position(4,6);
			Wall wall11 = new Wall(posPared11); 
			container.add(wall11);
			
			Position posPared12 = new Position(5,6);
			Wall wall12 = new Wall(posPared12); 
			container.add(wall12);
			
			Position posPared13 = new Position(6,6);
			Wall wall13 = new Wall(posPared13); 
			container.add(wall13);
			
			Position posPared14 = new Position(7,6);
			Wall wall14 = new Wall(posPared14); 
			container.add(wall14);
			
			Position posPared15 = new Position(7,5);
			Wall wall15 = new Wall(posPared15); 
			container.add(wall15);
			
			//
			
	}
	
	public int getCycle() {
		// TODO Auto-generated method stub
		return this.Cycle;
	}
	

	public int numLemmingsInBoard() {
		// TODO Auto-generated method stub
		return this.lemmingsInBoard;
	}

	public int numLemmingsDead() {
		// TODO Auto-generated method stub
		return this.deadLemmings;

	}

	public int numLemmingsExit() {
		// TODO Auto-generated method stub
		return this.lemmingsExit;
	}

	public int numLemmingsToWin() {
		// TODO Auto-generated method stub
		return this.lemmingsToWin;
	}

	public String positionToString(int col, int row) {
		// TODO Auto-generated method stub
		Position p = new Position(col,row);
		String str = "";
		
		if(container.getNumLemmings()> 0) {
			str = container.positionToString(col, row);
		}
		return str;
	}

	public boolean playerWins() {
		// TODO Auto-generated method stub
		return this.lemmingsExit >= this.lemmingsToWin;
	}

	public boolean playerLooses() {
		// TODO Auto-generated method stub
		return this.lemmingsInBoard == 0;
	}

	public String help() {
		// TODO Auto-generated method stub
		return Messages.HELP;
	}
	
	public boolean estaTerminado() {
		boolean ok = false;
		if(playerWins() || playerLooses()) {
			ok = true;
		}
		return ok;
	}

	public void setNumCycles() {
		this.Cycle++;
	}
	
	public void update() {
		setNumCycles();
		container.update();
	}
	
	public void reset() {
		if (this.nLevel == 1) init1();
		else init0();
	}
	
	public boolean hayWall(Position pos) {
		int c = pos.getCol();
		int r = pos.getRow() ;
		boolean hayPared = false;
		
		if (c < DIM_X && c >= 0 && r < DIM_Y && r >= 0) {
			hayPared = this.container.hayWall(pos) ;
		}
		
		return hayPared;
	}
	
	public void addLemmingDead() {
		this.deadLemmings++;
	}
	
	public void removeLemmingFromBoard() {
		this.lemmingsInBoard--;
	}
	
	public boolean dentroDelMapa(Position pos, int desplazamiento) {
		boolean dentro = false;
		//Comprobamos que la pos está en los rangos del tablero
		  // si no esta en los rangos entonces asumimos que hay pared
		int col = pos.getCol()  + desplazamiento;
		int row = pos.getRow();
		if (col < DIM_X && col >= 0 && row < DIM_Y && row >= 0) {
			dentro = true ;
					}
		return dentro;
	}
	
	public boolean inExitDoor(Lemming lemming) {
		return this.container.lemmingInExitDoor(lemming);
	}
	
	public void addLemmingExitsDoor() {
		this.lemmingsExit++;
	}
	
	public boolean CaerseDelMapa(Position pos) {
		int row = pos.getRow() + 1 ;
		return row >= DIM_Y;
		
	}
	
	public boolean fin() {
		return this.playerLooses() || this.playerWins();
	}
	
}
