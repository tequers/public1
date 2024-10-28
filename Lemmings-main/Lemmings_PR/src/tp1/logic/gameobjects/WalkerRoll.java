package tp1.logic.gameobjects;

import tp1.logic.Direction;
import tp1.view.Messages;

public class WalkerRoll {
	private int valorCaida=0;

    public void play( Lemming lemming ) {
    	if (!lemming.inExitDoor()) {
    		if  (lemming.enCaida()) {
    			if (lemming.caerseDelMapa())lemming.muere();
    			else {
    				lemming.caerse();
    				this.valorCaida++;
    			}
    		}  	else { //Lemming se mueve normalmente
    				int desplazamiento = lemming.desplazamiento();
    					if (lemming.sobrevivirCaida(this.valorCaida)) {
    						lemming.move(desplazamiento);
    					} else lemming.muere();
    					this.valorCaida = 0;
    					}}
    	 else {
    		lemming.exitsDoor();
    	}
    	
    }
    
    public String getIcon( Lemming lemming ) {
    	String icon = "";
    	if (lemming.sigueVivo()) {
    		if (lemming.getDir() == Direction.RIGHT) {
    			icon = Messages.LEMMING_RIGHT;
    		} else {
    			icon = Messages.LEMMING_LEFT;
		}
    	}
    	return icon; 
  
    }
    
}
