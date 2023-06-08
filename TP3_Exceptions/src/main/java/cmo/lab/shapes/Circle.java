package cmo.lab.shapes;

import cmo.lab.painter.CircleDrawer;
import cmo.lab.painter.GeometricShapeDrawer;

import java.awt.*;

public class Circle extends GeometricShape {

    private Point centre;
    private int rayon;

    public Circle(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {this.rayon = rayon;}
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double area() {return Math.PI*(rayon*rayon);}

    public double perimeter() {return Math.PI*rayon;}


    public String toString() {
        return "Cercle: (centre :"+centre.toString()+", rayon:"+rayon+")";
    }

    public GeometricShapeDrawer newDrawer() {
        return new CircleDrawer(this);
    }
}

