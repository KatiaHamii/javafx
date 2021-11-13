package com.example.springball_newtry;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

public class Main extends Application {
    private Ball ball;
    private double centerX, centerY, radius;
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Button clear = new Button("Clear");
    public static Pane canvas;
    Group root = new Group();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        ball = new Ball (centerX,centerY, radius);
        ball.setFill(Color.YELLOW);
        ball.setStroke(Color.BLACK);
        root.getChildren().add(ball);
        //for Button:start
        clear.setMaxSize(200,200);
        root.getChildren().add(clear);
        clear.setOnAction((ActionEvent event) -> {
            root.getChildren().removeAll(balls);
            balls.clear();
        }); //for Button: end
        //root.getChildren().add(ball);

        Scene scene = new Scene(root,600,600);
        setHandlers(scene);
        stage.setTitle("My Springball");
        stage.setScene(scene);
        stage.show();
    }
    public void setHandlers(Scene scene) {
    //create PressEvent
        scene.setOnMousePressed(event -> {
            centerX = event.getX();
            //System.out.println(centerX);
            centerY= event.getY();
           // System.out.println(centerY)
            ball.setRadius(40);
            ball.setCenterX(centerX);
            ball.setCenterY(centerY);
            System.out.println("Ball with koordinates: 'centerX: " + "-" + centerX + "; \n" + "centerY: "+ "-" + centerY );
            //
            System.out.println(balls.size()+1);
            balls.add(new Ball(centerX,centerY,radius));
            root.getChildren().addAll(balls) ;








        });
    }

}
/*public class Main c{

    private Ball ball;
    //private Pane pane;
    ArrayList<Ball> balls = new ArrayList<>();
    Button clear = new Button("Clear");
    Canvas canvas;
    double x, y, z;
    Color color;

    @Override
     public void start(Stage primaryStage) {
         Group root = new Group();
         Scene scene = new Scene(root, 600,600);
         primaryStage.setTitle("My JavaFX Project");
         primaryStage.setScene(scene);
         primaryStage.show();

         clear.setMaxSize(200,200);
         root.getChildren().add(clear);
         clear.setOnAction((ActionEvent event) -> {
             root.getChildren().removeAll(balls);
             balls.clear();
         });
         Canvas canvas = new Canvas(800,800);
         root.getChildren().add(canvas);
         ball = new Ball(x,y,z, color);
         ball.setStrokeWidth(6);
         ball.setFill(Color.YELLOW);
         ball.setStroke(Color.BLACK);
         canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseEvent -> {
             double x = mouseEvent.getX();
             System.out.println(x);
             double y = mouseEvent.getY();
             System.out.println(y);
             BorderPane bp = new BorderPane();
             GraphicsContext gc = canvas.getGraphicsContext2D();
             //gc.setFill(Color.GREEN);
             //gc.fillOval(40 ,40,40,40);
             //balls.add(ball);
             ball.setCenterX(x);
             ball.setCenterY(y);
             ball.setRadius(40);
             bp.getChildren().add(ball);
             //balls.add(ball);
         });

         }

 
    public static void main(String[] args) {
        launch();
    }
}
*/