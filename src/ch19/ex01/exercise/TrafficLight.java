package ch19.ex01.exercise;


import static ch19.ex01.exercise.Signal.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class TrafficLight {
    Signal color = RED;

    public void change() {
        switch (color) {
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is "+ color;
    }
}
