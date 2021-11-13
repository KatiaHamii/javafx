package com.example.springball_newtry;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.List;

public class View {
    private Stage stage;
    private Model model;
    private Canvas canvas;
    private GraphicsContext gc;
    private List<Ball> balls;
    Button clear = new Button("Clear");
    private Ball ball;
    double x,y;

    public View(Stage stage) {
        this.stage = stage;
        addCanvas();
        this.model = new Model(this);
        this.stage.setTitle("JavaFX Springball");
       // drawCircle();
        this.model.addTimeLine();
        //GraphicsContext gc1 =canvas.getGraphicsContext2D();
        drawCircle(gc);


    }
    public void drawCircle(GraphicsContext gc) {
        gc.setFill(Color.YELLOW);
    }


    public void addCanvas() {
        Group root = new Group();
        //double weight = Screen.getPrimary().getBounds().getMaxX() * 0.5;
       // double height = Screen.getPrimary().getBounds().getMaxY() * 0.5 - 0.35;
        this.canvas = new Canvas(600,600);

        addTextField(root);
        this.gc = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.show();

    }
    public void addTextField(Group root) {
        //TextField textField = new TextField();
        clear = new Button("Clear");
        clear.setOnAction((ActionEvent event) -> {
        root.getChildren().removeAll(balls);
        });
        root.getChildren().add(clear);
    }
     }

