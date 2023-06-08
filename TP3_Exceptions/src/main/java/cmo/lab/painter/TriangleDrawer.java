package cmo.lab.painter;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Triangle;

import java.awt.*;

public class TriangleDrawer extends GeometricShapeDrawer {
    private Triangle t;
    public TriangleDrawer(Triangle t) {
        this.t = t;
    }

    public Triangle getTriangle() {
        return t;
    }

    public void setTriangle(Triangle t) {
        this.t = t;
    }

    public void drawOn(Graphics graphics) {
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getB().getX(), t.getB().getY());
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY());
        graphics.drawLine(t.getC().getX(), t.getC().getY(), t.getB().getX(), t.getB().getY());
    }
}
