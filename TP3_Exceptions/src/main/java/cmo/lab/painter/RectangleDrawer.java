package cmo.lab.painter;

import cmo.lab.shapes.GeometricShape;
import cmo.lab.shapes.Rectangle;

import java.awt.*;

public class RectangleDrawer extends GeometricShapeDrawer {
    private Rectangle r;
    public RectangleDrawer(Rectangle r) {
        this.r = r;
    }

    public Rectangle getRectangle() {
        return r;
    }

    public void setRectangle(Rectangle r) {
        this.r = r;
    }

    public void drawOn(Graphics graphics) {
        graphics.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }
}
