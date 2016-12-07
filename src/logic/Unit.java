package logic;

import gui.*;

public abstract class Unit extends Entity{
	protected int x,y ;
	
	
	public Unit(int x, int y){
		super(x, y) ;
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
}
