package tp1.control;

import java.util.Scanner;

import tp1.logic.Game;
import tp1.view.GameView;
import tp1.view.Messages;
import tp1.logic.gameobjects.Lemming;
import tp1.logic.Position;

/**
 *  Accepts user input and coordinates the game execution logic
 */
public class Controller {

	private Game game;
	private GameView view;

	public Controller(Game game, GameView view) {
		this.game = game;
		this.view = view;
	}


	/**
	 * Runs the game logic, coordinate Model(game) and View(view)
	 * 
	 */
	
	
	private String[] prompt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		
		String[] words = line.toLowerCase().trim().split("\\s+");

		return words;
	}
	
	public void run() {
		view.showWelcome();
		//TODO fill your code: The main loop that displays the game, asks the user for input, and executes the action.
		
		view.showGame();
		boolean exit = false;
		
		while(!exit && !game.fin()) {
			
			String[] command = prompt();
			if (command.length == 1 || command.length == 0) {
				switch(command[0]) {
				case "e":
				case "exit":
					exit = true;
					System.out.println(Messages.COMMAND_EXIT_HELP);
					break;
				case "n":
				case "none":
				case "":
					game.update();
					view.showGame();
					break;
				case "r":
				case "reset":
					game.reset();
					view.showGame();
					break;
				case "h":
				case "help":
					System.out.println(game.help());
					break;
		
				default:
					view.showError(Messages.COMMAND_INCORRECT_PARAMETER_NUMBER);
				}
				} else {
					view.showError(Messages.COMMAND_INCORRECT_PARAMETER_NUMBER);
				}
					
		}
		view.showEndMessage();
	}

}
