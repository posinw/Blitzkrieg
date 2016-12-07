package gui;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable {
	//Fill in here
	
	public void draw(GraphicsContext gc) ;
	public boolean isDestroy() ;
}