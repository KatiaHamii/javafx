package com.example.springball_newtry;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Controller implements EventHandler<MouseEvent> {
    Canvas canvas;
    BorderPane bp;
    GraphicsContext graphicsContext;
    Scene stage;
    Ellipse ellipse;
    MouseEvent mousePressed;

    public Controller (Canvas canvas, Scene stage, BorderPane bp) {
        this.bp = bp;
        this.stage = stage;
        this.graphicsContext = canvas.getGraphicsContext2D();

        ellipse = new Ellipse();
        ellipse.setStrokeWidth(1.0);
        ellipse.setFill(Color.TRANSPARENT);
        ellipse.setStroke(Color.BLACK);

        stage.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            double startingPosX = event.getX();
            double startingPosY = event.getY();
            ellipse.setCenterX(startingPosX);
            ellipse.setCenterY(startingPosY);
            ellipse.setRadiusX(5);
            ellipse.setRadiusY(5);
            bp.getChildren().add(ellipse);
        });
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
       // canvas.setOnMousePressed(mouseEvent);
    }
}
