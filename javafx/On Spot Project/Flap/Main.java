package Flap;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application {
    Circle character;
    double x=500,y=500;
    public void start(Stage primaryStage) throws Exception {  
        
        Pane root = new Pane();
        Line top = new Line (100, 100, 490, 100);
        Line bottom = new Line (100, 490, 490, 490);

        // Defining the character in our case that is a circle        
        character= new Circle();
        character.setCenterX(300);
        character.setCenterY(300);
        character.setRadius(25);
        Scene scene = new Scene(root, 720, 540);
        root.getChildren().addAll(character, top, bottom);
    
        Button start = new Button("Start");
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                KeyCode code = ke.getCode();
                switch(code)
                {
                    case SPACE: 
                        {
                            character.setCenterY(character.getCenterY() - 10);
                            y=character.getCenterY();
                            break;
                        }
                }
            }
        });
            
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now)
            {
                double speed=0.5;
                y=y+speed;
                character.setCenterY(character.getCenterY()+speed);
                if(character.getBoundsInParent().intersects(bottom.getBoundsInParent())){
                    System.out.println("You lose!");
                    System.exit(0);
                }
                if(character.getBoundsInParent().intersects(top.getBoundsInParent())){
                    System.out.println("Congrats you win!");
                    System.exit(0);
                }
                
            }
                
        };
        
        timer.start();
        primaryStage.setTitle("Flap");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
