package gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GameScreen extends BorderPane {
	
	public static final int gscreenwidth = 1000 ;
	public static final int gscreenheight = 860 ;
	
	public GameScreen(){
		this.setPrefSize(gscreenwidth, gscreenheight);
		
		BorderPane ctrcenter = new BorderPane() ;
		FlowPane act = new FlowPane() ;
		
		ctrcenter.setPrefWidth(250);
		ctrcenter.setStyle("-fx-background-color: black");
		
		act.setPrefHeight(100);
		act.setStyle("-fx-background-color: darkgreen");
		
		Label turnButton = new Label("End Turn");
		turnButton.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.ITALIC, 40));
		turnButton.setTextFill(Color.WHITE);
		
		act.getChildren().add(turnButton) ;
		act.setAlignment(Pos.CENTER);
		
		act.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e){
				//setBackground("-fx-background-color: rgb(236, 208, 120)");
				//setBackground(236,208,120);
				act.setStyle("-fx-background-color: red");
			}
		});
		act.setOnMouseExited(new EventHandler<MouseEvent>(){
			public void handle(MouseEvent event){
				act.setStyle("-fx-background-color: darkgreen");
			}
		});
		
		this.setRight(ctrcenter);
		ctrcenter.setBottom(act);
	}

}
