package logic;

import gui.RenderableHolder;
import javafx.scene.canvas.GraphicsContext;

public class APC extends Unit {
	
	private int direction ;
	private int firepower ;
	private int firerange ;
	private int walkrange ;
	private int health ;
	private int player ;
	
	public APC(int x, int y, int direction, int player){
		super(x, y);
		this.firepower = 2 ;
		this.health = 13 ;
		this.firerange  = 2 ;
		this.walkrange = 4 ;
		this.direction = 1 ;
		this.player = player ;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		/*if(direction==1)gc.drawImage(RenderableHolder.APC[0],this.x,this.y);
		if(direction==-1)gc.drawImage(RenderableHolder.APC[1], this.x, this.y);*/
		
	}

	@Override
	public boolean isDestroy() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
