package logic;

import java.util.Random;

import gui.RenderableHolder;

public class GameManager {
	
	public GameManager(){
		
		Tank t = new Tank(0, 0, 1, 1) ;
		RenderableHolder.instance.add(t) ;
		
		
	}
	
	public void update() {
		
	}
	
	
}
