package com.tw.neev;

public class Ball {
    public static final int DIAMETER = 15;
    public final int ballNumber;
    private final int yPosition;
    private int xPosition = 0;

    public Ball(int i, int height, int frame) {
        this.ballNumber = i;
        this.yPosition = (height * i) / frame;
    }

    public void increaseXPosition() {
        this.xPosition += this.ballNumber;
    }

    public void movePosition(BallProcessing ballProcessing) {
        ballProcessing.ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
        increaseXPosition();
    }
}