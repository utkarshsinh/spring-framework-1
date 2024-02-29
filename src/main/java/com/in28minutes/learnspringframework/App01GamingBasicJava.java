package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.Pacman;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
		var game  = new Pacman(); // Creation of object
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
//		Object Creation + Wiring
//		game is a dependency of gameRunner 
		gameRunner.run();
	}

}
