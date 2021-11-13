package com.example.springball_newtry;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class ActionListener implements EventHandler<MouseEvent> {
    private Model model;
    //private View view;
    private Canvas canvas;
   // private Ball ball;
    double x,y;

    ActionListener(Canvas canvas, Model model) {
        this.canvas = canvas;
        this.model = model;
        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
    }
    @Override
    public void handle(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.YELLOW);
        //this.model.addBall(x,y,30, Color.YELLOW);
    }
}
