package com.tw.neev;

import processing.core.PApplet;

import java.util.ArrayList;

public class BallProcessing extends PApplet {

    public static final int BALLCOUNT = 4;
    final int width = 600;
    final int height = 600;
    ArrayList<Ball> BalLList = new ArrayList<Ball>();

    public static void main(String[] args) {
        PApplet.main("com.tw.neev.BallProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        for(int i = 0; i< BALLCOUNT; i++){
            BalLList.add(new Ball(i));
        }
    }

    @Override
    public void draw() {

    }
}
