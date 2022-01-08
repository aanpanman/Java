import javax.swing.Action;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Event extends Application{

    public void start(Stage stage1) throws Exception {
        
        class NewEvent implements EventHandler <ActionEvent>{
            public void handle(ActionEvent ae) {
                System.out.println("Submited");
                
            }
        }

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                System.out.println("Cancelled");
                
            }
        };

        Label l = new Label("Hello");
        Button b1 = new Button("submit");
        Button b2 = new Button("cancel");
        Button b3 = new Button("save");
        Button b4 = new Button("exit");

        b1.setOnAction(new NewEvent()); //when class is defined
        b2.setOnAction(event); 
        b3.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                System.out.println("Saved");
                l.setText("Content Saved");
                
            }
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(l,b1,b2,b3,b4);
        Scene scene = new Scene(root, 600, 500, Color.BEIGE);
        //s.setFill(Color.BISQUE);
        stage1.setScene(scene);
        stage1.setTitle("JavaFX Event");
        stage1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
