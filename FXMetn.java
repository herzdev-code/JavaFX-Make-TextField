package com.example.javafxprojects;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
public class FXMetn extends Application{
    public void start(Stage pStage){
        pStage.setTitle("Mətn sahəsi");

        TextField metn = new TextField();
        metn.setMaxHeight(25);
        metn.setMaxWidth(250);

        BorderPane pane = new BorderPane();
        pane.setCenter(metn);
        Scene s = new Scene(pane,400,200);
        pStage.setScene(s);
        pStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
