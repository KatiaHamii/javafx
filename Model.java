package com.example.springball_newtry;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.util.Duration;

import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private View view;
    private List<Ball> balls;
    private Timeline timeline;
    //private  Ball ball;
    private boolean movable;
    //private List<Ball> toShow;

    public Model(View view) {
        this.view = view;
        this.balls = new ArrayList<Ball>();
        //this.ball = new Ball(10,20,20, Color.GREEN);
        this.movable = true;
    }
    /*void addBall(double x, double y, double radius,Color color) {
        Ball ball = new Ball(10,20,20, Color.GREEN);
    }*/

    void addTimeLine() {
        EventHandler<ActionEvent> handler = actionEvent -> {
            updateBalls();
        };
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.5));
        this.timeline = new Timeline();
        this.timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    void updateBalls() {
       // this.toShow = new ArrayList<Ball>();
    }


}
