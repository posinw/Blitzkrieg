package logic;

import gui.RenderableHolder;
import javafx.scene.canvas.GraphicsContext;

public class Artillery extends Unit{
	
	private int direction ;
	private int firepower ;
	private int firerange ;
	private int walkrange ;
	private int health ;
	private int player ;
	
	public Artillery(int x, int y, int direction, int player){
		super(x, y);
		this.firepower = 3 ;
		this.health = 10 ;
		this.firerange  = 4 ;
		this.walkrange = 2 ;
		this.direction = 1 ;
		this.player = player ;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		/*if(direction==1)gc.drawImage(RenderableHolder.Artillery[0],this.x,this.y);
		if(direction==-1)gc.drawImage(RenderableHolder.Artillery[1], this.x, this.y);*/
		
	}

	@Override
	public boolean isDestroy() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
