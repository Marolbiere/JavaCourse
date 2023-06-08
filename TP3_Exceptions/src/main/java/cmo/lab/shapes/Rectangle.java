package cmo.lab.shapes;


import cmo.lab.painter.CircleDrawer;
import cmo.lab.painter.GeometricShapeDrawer;
import cmo.lab.painter.RectangleDrawer;

import java.awt.*;

public class Rectangle extends GeometricShape {
    private Point origin ;
    private Point corner ;

    public Rectangle(int x1, int y1, int x2, int y2) {
        origin = new Point(x1,y1);
        corner = new Point(x2,y2);
    }

    public Rectangle(Point i, Point j) {
        origin = i;
        corner = j;
    }

    public void setOrigin(Point pto) {origin = pto;}
    public void setCorner(Point ptc) {corner = ptc;}

    public Point getOrigin() {return origin;}
    public Point getCorner() {return corner;}

    public int width() {
        return Math.abs(origin.getX() - corner.getX());
    }

    public int height() {
        return Math.abs(origin.getY() - corner.getY());
    }

    public double area() {
        return height() * width();
    }

    public double perimeter() {
        return Math.abs(2*(height()+width()));
    }

    public String toString() {
        //Ancienne version avec appel juste sur Rectangle !
        //return "Rectangle: (<"+origin.getX()+"@"+origin.getY()+"> , <"+corner.getX()+"@"+corner.getY()+">)";
        return "Rectangle: ("+origin.toString()+" , "+ corner.toString()+")";
    }

    public GeometricShapeDrawer newDrawer() {
        return new RectangleDrawer(this);
    }

    public void print() {
        System.out.println(this.toString());
    }

}
