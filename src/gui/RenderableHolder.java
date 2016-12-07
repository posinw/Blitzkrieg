package gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.image.Image;

public class RenderableHolder {
	
	public static Image[] tank ;
	public static Image[] soldier ;
	public static Image[] APC ;
	public static Image[] Artillery ;
	
	private List<IRenderable> entities ;
	public static final RenderableHolder instance = new RenderableHolder();
	
	
	
	public RenderableHolder(){
		
		tank = new Image[2] ;
		soldier = new Image[2] ;
		APC = new Image[2] ;
		Artillery = new Image[2] ;
		entities = new ArrayList<IRenderable>() ;
	}
	
	public synchronized void add(IRenderable entity){
		entities.add(entity) ;
	}
	
	static{
		loadResource();
	}
	
	private static void loadResource() {
		ClassLoader loader = ClassLoader.getSystemClassLoader() ;
		tank[0] = new Image(loader.getResourceAsStream("tankr.png")) ;
		tank[1] = new Image(loader.getResourceAsStream("tankl.png")) ;
		//soldier[0] = new Image(loader.getResourceAsStream("arrow_down.png")) ;
		//soldier[1] = new Image(loader.getResourceAsStream("arrow_down.png")) ;
		//APC[0] = new Image(loader.getResourceAsStream("arrow_left.png")) ;
		//APC[1] = new Image(loader.getResourceAsStream("arrow_left.png")) ;
		//Artillery[0] = new Image(loader.getResourceAsStream("arrow_right.png")) ;
		//Artillery[1] = new Image(loader.getResourceAsStream("arrow_right.png")) ;
	}
	
	public List<IRenderable> getEntities() {
		return entities;
	}



	public static RenderableHolder getInstance() {
		return instance;
	}
	
	
	
	
	
}
