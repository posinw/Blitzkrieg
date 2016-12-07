package gui;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameZone extends Canvas{
	
	private static final int zonewidth = GameScreen.gscreenwidth-GameScreen.ctrwidth ;
	private static final int zoneheight = GameScreen.gscreenheight ;
	
	public GameZone(){
		super(zonewidth,zoneheight);
		paintComponents();
	}
	
	public void paintComponents(){
		//Fill in here
		GraphicsContext gc  = this.getGraphicsContext2D() ;
		gc.setFill(Color.LIGHTGRAY);
		gc.fillRect(0, 0, zonewidth, zoneheight);
		
		
	}
	
	
	
	
	
}
