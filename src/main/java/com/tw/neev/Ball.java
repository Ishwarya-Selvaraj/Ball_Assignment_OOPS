package com.tw.neev;

import processing.core.PApplet;

public class Ball {
    private static final int DIAMETER = 15;
    private final int BALL_NUMBER;
    private final int Y_Position;
    private int xPosition = 0;

    protected Ball(int ballNumber, int height, int frame) {
        this.BALL_NUMBER = ballNumber;
        this.Y_Position = (height * ballNumber) / frame;
    }

    private void increaseXPosition() {
        this.xPosition += this.BALL_NUMBER;
    }

    protected void move(PApplet pApplet) {
        pApplet.ellipse(xPosition, Y_Position, DIAMETER, DIAMETER);
        increaseXPosition();
    }
}