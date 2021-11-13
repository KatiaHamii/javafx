package com.example.springball_newtry;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Circle {
    private double xSpeed, ySpeed;


    public Ball(double x, double y, double radius) {

        super (x,y,radius);
    }

    public void move(double step) {
        setCenterX(getCenterX() + xSpeed * step);
        setCenterY(getCenterY() + ySpeed * step);
    }
    public void setSpeed (double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setxSpeed(double xSpeed) { this.xSpeed = xSpeed;    }
    public void setySpeed(double ySpeed) {this.ySpeed = ySpeed;}
    public double getxSpeed() {return xSpeed; }
    public double getySpeed() {
        return ySpeed;
    }

}