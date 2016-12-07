package logic;

import javafx.scene.canvas.GraphicsContext;

public class Soldier extends Unit {
	
	
	public Soldier(int x, int y, int firepower, int health, int direction){
		super(x, y);
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDestroy() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
