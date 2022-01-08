import java.io.FileInputStream;
import java.util.concurrent.Flow;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Ui extends Application{

    public void start(Stage stage1) throws Exception {

        //HBox root = new HBox(10); //row placement with gap of 10 pixels
        //VBox root = new VBox(10); //vertical placement with gap of 10 pixels
        FlowPane root = new FlowPane();
        //GridPane and StackPane

        /*
        FileInputStream fis = new FileInputStream("C:\\Users\\Avantika\\Downloads\\city.png");
        Image im = new Image(fis, 300, 300, true, true); //width, height, preserve aspect ratio, smoothness
        ImageView iv = new ImageView(im);
        //iv.setFitWidth(300);
        //
        //Label l = new Label("JavaFX", iv);
        Label l1 = new Label("", iv);
        //l.setContentDisplay(ContentDisplay.BOTTOM); */

        Label l = new Label("Hello");
        Button b1 = new Button("submit");
        Button b2 = new Button("cancel");
        Button b3 = new Button("save");
        Button b4 = new Button("exit");

        //Group root = new Group();
        root.getChildren().addAll(l,b1,b2,b3,b4);
        Scene s = new Scene(root, 600, 500);
        s.setFill(Color.BEIGE);
        stage1.setScene(s);
        stage1.setTitle("JavaFX UI ");
        stage1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
