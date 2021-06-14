package com.tw.neev;

import processing.core.PApplet;

import java.util.ArrayList;

public class BallProcessing extends PApplet {
    private static final int BALL_COUNT = 4;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int FRAME = 5;
    ArrayList<Ball> balls = new ArrayList<>();

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
            balls.add(new Ball(ballNumber, height, FRAME));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.move(this);
        }
    }
}