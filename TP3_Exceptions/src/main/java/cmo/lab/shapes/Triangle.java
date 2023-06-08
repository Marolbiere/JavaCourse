package cmo.lab.shapes;

import cmo.lab.painter.GeometricShapeDrawer;
import cmo.lab.painter.RectangleDrawer;
import cmo.lab.painter.TriangleDrawer;

import java.awt.*;

public class Triangle extends GeometricShape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {return a;}
    public void setA(Point a) {this.a = a;}
    public Point getB() {return b;}
    public void setB(Point b) {this.b = b;}
    public Point getC() {return c;}
    public void setC(Point c) {this.c = c;}

    public double perimeter(){
        double cote1 = Math.sqrt(Math.pow(a.getX() - b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
        double cote2 = Math.sqrt(Math.pow(a.getX() - c.getX(),2)+Math.pow(a.getY() - c.getY(),2));
        double cote3 = Math.sqrt(Math.pow(b.getX() - c.getX(),2)+Math.pow(b.getY() - c.getY(),2));
        return cote1+cote2+cote3;
    }

    public double area() {
        double divider = perimeter()/2;
        return divider*(divider-Math.sqrt(Math.pow(a.getX() - b.getX(),2)+Math.pow(a.getY() - b.getY(),2)))
                *(divider-Math.sqrt(Math.pow(a.getX() - c.getX(),2) + Math.pow(a.getY() - c.getY(),2)))
                *(divider-Math.sqrt(Math.pow(b.getX() - c.getX(),2) + Math.pow(b.getY() - c.getY(),2)));

    }

    public GeometricShapeDrawer newDrawer() {
        return new TriangleDrawer(this);
    }




}
