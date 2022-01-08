import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Basic extends Application {
    public void start(Stage stage1) throws Exception {

        Group root = new Group();

        /* 3D object
        Box b1 = new Box();
        b1.setHeight(100);
        b1.setWidth(100);
        b1.setDepth(100);
        b1.setTranslateX(250);
        b1.setTranslateY(300);
        b1.setTranslateZ(350);
        PerspectiveCamera pc = new PerspectiveCamera();
        pc.setTranslateX(100);
        pc.setTranslateY(150);
        pc.setTranslateZ(350);
        root.getChildren().addAll(b1);*/

        /* POLYGON
        double[] d = {100,200,300,350,350,100};
        Polygon p = new Polygon(d);
        root.getChildren().addAll(p); *?

        /* ARC
        Arc a = new Arc(100, 200, 100, 200, 300, 65);
        a.setType(ArcType.ROUND);
        //a.setType(ArcType.CHORD);
        //a.setType(ArcType.OPEN);
        root.getChildren().addAll(a);*/


        /* ELLIPSE
        Ellipse e = new Ellipse();
        e.setCenterX(250);
        e.setCenterY(300);
        e.setRadiusX(100);
        e.setRadiusY(200);
        Ellipse e1 = new Ellipse(250, 300, 50, 100);
        root.getChildren().addAll(e, e1);*/

        /* CIRCLE
        Circle c = new Circle();
        c.setCenterX(250);
        c.setCenterY(300);
        c.setRadius(100);
        c.setFill(Color.BLUE);
        Circle c1 = new Circle(250, 300, 50);
        c1.setFill(Color.WHEAT);;
        root.getChildren().addAll(c, c1);*/

        /* RECTANGLE
        Rectangle r = new Rectangle(100, 200, 300, 200);
        //r.setX(100);
        //r.setY(200);
        //r.setWidth(300);
        //r.setHeight(200);
        r.setFill(Color.ROYALBLUE);
        r.setSmooth(false);
        r.setStroke(Color.RED);
        r.setArcHeight(20);
        r.setArcWidth(20); */
        
        /* LINE
        Line l = new Line(100, 200, 500, 600);
        //l.setStartX(100);
        //l.setStartY(200);
        //l.setEndX(500);
        //l.setEndY(600);
        l.setFill(Color.RED);
        
        //Line l = new Line(100, 200, 500, 600);
        //ObservableList ol = root.getChildren();
        //ol.addAll(l);
        Line l1 = new Line(100, 250, 450, 450);
        Line l2 = new Line(150, 200, 400, 400);
        Line l3 = new Line(200, 300, 500, 300);
        //ol.addAll(l1,l2,l3);
        root.getChildren().addAll(l,l1,l2,l3,r);*/

        Scene s = new Scene(root, 500, 600);
        //Scene s = new Scene(root, 500, 600, Color.BEIGE);
        //Scene s = new Scene(root, 500, 600, Color.rgb(170, 100, 120));
        //Scene s = new Scene(root, 500, 600, Color.web("#FF5733", 0.5));
        //Scene s = new Scene(root, 500, 600, Color.hsb(0,0,0));
        
        //for 3D objects:
        //s.setCamera(pc);

        s.setFill(Color.BEIGE);
        stage1.setScene(s);
        stage1.setTitle("JavaFX Application");
        stage1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
