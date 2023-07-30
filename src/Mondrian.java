/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 3.1
 * File Name: Mondrian.java
 */

//Makes a Mondrian painting lookalike

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Mondrian extends Application
{
    public void start(Stage pS){
        //Rectangles for the painting
        Rectangle rect1 = new Rectangle (0, 0, 50, 200);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(2);
        rect1.setFill(null);
        
        Rectangle rect2 = new Rectangle (50, 0, 70, 100);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(2);
        rect2.setFill(Color.LIGHTBLUE);
        
        Rectangle rect3 = new Rectangle (50, 100, 100, 100);
        rect3.setStroke(Color.BLACK);
        rect3.setStrokeWidth(2);
        rect3.setFill(null);
        
        Rectangle rect4 = new Rectangle (120, 0, 10, 100);
        rect4.setStroke(Color.BLACK);
        rect4.setStrokeWidth(2);
        rect4.setFill(null);
        
        Rectangle rect5 = new Rectangle (130, 0, 100, 50);
        rect5.setStroke(Color.BLACK);
        rect5.setStrokeWidth(2);
        rect5.setFill(Color.AQUAMARINE);
        
        Rectangle rect6 = new Rectangle (130, 50, 100, 10);
        rect6.setStroke(Color.BLACK);
        rect6.setStrokeWidth(2);
        rect6.setFill(null);
        
        Rectangle rect7 = new Rectangle (130, 60, 100, 40);
        rect7.setStroke(Color.BLACK);
        rect7.setStrokeWidth(2);
        rect7.setFill(null);
        
        Rectangle rect8 = new Rectangle (150, 100, 150, 100);
        rect8.setStroke(Color.BLACK);
        rect8.setStrokeWidth(2);
            rect8.setFill(Color.rgb(50, 200, 100));
        
        Rectangle rect9 = new Rectangle (230, 0, 70, 100);
        rect9.setStroke(Color.BLACK);
        rect9.setStrokeWidth(2);
        rect9.setFill(null);
        
        //Tells the scene to show rectangles and defines the scenes size
        Group root = new Group(rect1, rect2, rect3, rect4,
        rect5, rect6, rect7, rect8, rect9);
        Scene scene = new Scene(root,300, 200, Color.WHITE);
        
        pS.setTitle("A Mondrian style painting");
        pS.setScene(scene);
        pS.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
