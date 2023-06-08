package cmo.lab.painter;

import cmo.lab.shapes.Circle;

import java.awt.*;

public class CircleDrawer extends GeometricShapeDrawer{
    private Circle c;
    public CircleDrawer(Circle c) {
        this.c = c;
    }

    public Circle getCircle() {
        return c;
    }

    public void setCircle(Circle C) {
        this.c = c;
    }
    public void drawOn(Graphics graphics) {
        graphics.drawOval(c.getCentre().getX(), c.getCentre().getY(), c.getRayon(), c.getRayon());
    }



}
