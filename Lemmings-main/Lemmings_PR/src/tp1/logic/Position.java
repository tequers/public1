package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int col;
	private int row;

	//TODO fill your code
	public Position(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return this.col;
	}
	
	public int getRow() {
		return this.row;
	}

	public boolean equals(Position pos) {
        // Comprueba si el objeto pos no es nulo y si las coordenadas son iguales
        if (pos == null) {
            return false;
        }
        // Compara los valores de x e y de ambas posiciones
        return this.col == pos.col && this.row == pos.row;
    }
	
}
