package com.tw.neev;

import processing.core.PApplet;

import java.util.ArrayList;

public class BallProcessing extends PApplet {

    public static final int BALL_COUNT = 4;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int FRAME = 5;
    ArrayList<Ball> Balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("com.tw.neev.BallProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ballNumber = 1; ballNumber <= BALL_COUNT; ballNumber++) {
            Balls.add(new Ball(ballNumber, height, FRAME));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : Balls) {
            ball.movePosition(this);
        }
    }
}