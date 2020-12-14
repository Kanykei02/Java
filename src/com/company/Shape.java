package com.company;

import java.awt.*;

public class Shape {
    private Coordinates coordinates;
    private Color color;
    private boolean inVisible;

    public Shape(Coordinates coordinates, Color color, boolean inVisible) {
        this.coordinates = coordinates;
        this.color = color;
        this.inVisible = inVisible;
    }

    public String speak() {
        return coordinates.speak() + "\nColor: " + color + "\nIs visible: " + inVisible;
    }
}
