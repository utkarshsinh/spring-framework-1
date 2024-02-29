package com.in28minutes.learnspringframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.Pacman;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App03GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game  = new Pacman(); // Creation of object
		
		try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();;
		}
		
		
		
		
		
		
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		
////		Object Creation + Wiring
////		game is a dependency of gameRunner 
//		gameRunner.run();
		

	}

}
