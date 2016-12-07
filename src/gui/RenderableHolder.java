package gui;

import java.util.ArrayList;
import java.util.List;


public class RenderableHolder {
	
	private List<IRenderable> entities ;
	public static final RenderableHolder instance = new RenderableHolder();
	
	
	
	public RenderableHolder(){
		entities = new ArrayList<IRenderable>() ;
	}



	public List<IRenderable> getEntities() {
		return entities;
	}



	public static RenderableHolder getInstance() {
		return instance;
	}
	
	
	
	
	
}
