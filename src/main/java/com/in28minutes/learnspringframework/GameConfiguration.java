package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GameConfiguration {
	
//	var game = new MarioGame();
	
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
//	@Bean
//	public GameRunner gameRunner() {
//		var gameRunner = new GameRunner(game());
//		return gameRunner;
//	}
//	
	
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
	
//	var game  = new Pacman(); // Creation of object
	
//	var game = new SuperContraGame();
//	var gameRunner = new GameRunner(game);
	
//	Object Creation + Wiring
//	game is a dependency of gameRunner 
//	gameRunner.run();
	

}
