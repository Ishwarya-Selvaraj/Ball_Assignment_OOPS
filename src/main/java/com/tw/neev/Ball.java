package com.tw.neev;

public class Ball {
    public static final int DIAMETER = 15;
    protected final int ballNumber;
    protected final int diameter;
    private int currentPosition=0;

    public Ball(int i) {
        this.ballNumber = i;
        this.diameter = DIAMETER;
    }

    public float getYPosition(int height,int ballCount) {
        return ((height*this.ballNumber)/ (ballCount+1));
    }

    public float getXPosition() {
        this.currentPosition+=this.ballNumber;
        return this.currentPosition-1;
    }
}
