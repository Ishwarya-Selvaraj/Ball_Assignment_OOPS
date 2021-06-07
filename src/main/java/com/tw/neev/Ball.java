package com.tw.neev;

public class Ball {
    public static final int DIAMETER = 15;
    public final int ballNumber;
    public final int diameter;
    private final int yPosition;
    private int xPosition = 0;

    public Ball(int i, int height, int frame) {
        this.ballNumber = i;
        this.diameter = DIAMETER;
        this.yPosition = (height * i) / frame;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void increaseXposition() {
        this.xPosition += this.ballNumber;
    }
}
