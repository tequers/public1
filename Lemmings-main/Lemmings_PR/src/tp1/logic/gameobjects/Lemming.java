package tp1.logic.gameobjects;

import tp1.logic.Direction;
import tp1.logic.Game;
import tp1.logic.Position;
import tp1.view.Messages;

public class Lemming {

	private Position pos;
	private boolean estaVivo;
	private Direction dir;
	private final int caida = 3;
	private Game game;
	private WalkerRoll rol;
	
	//TODO fill your code
	public Lemming(Position pos, Game game) {
		this.estaVivo = true;
		this.dir = dir.RIGHT;
		this.pos = pos;
		this.rol = new WalkerRoll();
		this.game = game;
	}
	/**
	 *  Implements the automatic update	
	 */
	public void update() {
		//TODO fill your code
		if (this.estaVivo) this.rol.play(this);
	}
	
	public boolean isInPosition(Position p) {
		boolean ok = false;
		if(pos.equals(p)) {
			ok = true;
		}
		return ok;
	}

	public Direction getDir() {
		return this.dir;
	}
	
	public String getSymbol() {
		if(getDir() == dir.LEFT) {
			return Messages.LEMMING_LEFT;
		}
		else {
			return Messages.LEMMING_RIGHT;
		}
		
	}

	public String toString(Position position) {
		String icon = "";
		if(this.estaVivo && pos.equals(position)) {
			icon = getSymbol();
		}
		return icon;
	}

	public int desplazamiento() {
		int x= 0;
		if (getDir() == dir.RIGHT) x = dir.RIGHT.getX();
		else if (getDir()==dir.LEFT) x = dir.LEFT.getX();
		return x;
	}
	
	public void cambioDeDir() {
		if (getDir() == dir.RIGHT) this.dir = Direction.LEFT;
		else if (getDir()==dir.LEFT) this.dir = Direction.RIGHT;
	}
	
	public boolean dentroDelMapa(int x) {
		return this.game.dentroDelMapa(pos,x);
	}
	
	public void move(int desplz) {
		int c = pos.getCol();
		int r = pos.getRow();
		
		if (!this.game.hayWall(new Position(c+desplz, r)) && this.dentroDelMapa(desplz)) {
				int newC = pos.getCol() + desplz;
				pos = new Position(newC,r);
			} else {
				this.cambioDeDir();
		}
	
	}
	
	public boolean enCaida() {
		boolean enCaida = false;
		int fila = this.pos.getRow() + 1;
		
		if (!this.game.hayWall(new Position(this.pos.getCol(), fila))) {
			enCaida = true;
		}
		
		return enCaida;
		
	}
	
	 public void caerse() {
		 // Le sumamos 1 al valor de la fila
		 	Position p = new Position(pos.getCol(), pos.getRow()+dir.DOWN.getY());
	    	this.pos = p;
	    }
	 
	 public boolean caerseDelMapa() {
		 return this.game.CaerseDelMapa(pos);
	 }
	 
	  public boolean sobrevivirCaida(int valorCaida) {
	    	return valorCaida < caida;
	    }
	    
	    public boolean sigueVivo() {
	    	return this.estaVivo;
	    }
	    
	   public void muere() {
			this.estaVivo = false;
			this.game.addLemmingDead();
			this.game.removeLemmingFromBoard();
		}
	   
	   public boolean inExitDoor() {
		   return this.game.inExitDoor(this);
	   } 
	   
	   public void desaparece() {
		   this.estaVivo  = false;
	   }
	  
	   public void exitsDoor() {
		   this.estaVivo = false;
		   this.game.addLemmingExitsDoor();
		   this.game.removeLemmingFromBoard();
	   }
	 
}
