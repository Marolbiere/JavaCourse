package cmo.lab.painter;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Rectangle;
import cmo.lab.shapes.*;

import java.awt.*;

public abstract class GeometricShapeDrawer {

    public abstract void drawOn(Graphics graphics);


    /*void drawOn(Graphics graphics) {
        if(shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            paintRectangle(r, graphics);
        }
        if(shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            paintTriangle(t, graphics);
        }
        if(shape instanceof Circle) {
            Circle c = (Circle) shape;
            paintCircle(c, graphics);
        }
    }

    void paintRectangle(Rectangle r, Graphics graphics) {
        graphics.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }

    void paintCircle(Circle c, Graphics graphics) {
        graphics.drawOval(c.getCentre().getX(), c.getCentre().getY(), c.getRayon(), c.getRayon());
    }

    void paintTriangle(Triangle t, Graphics graphics) {
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getB().getX(), t.getB().getY());
        graphics.drawLine(t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY());
        graphics.drawLine(t.getC().getX(), t.getC().getY(), t.getB().getX(), t.getB().getY());
    }*/

}
