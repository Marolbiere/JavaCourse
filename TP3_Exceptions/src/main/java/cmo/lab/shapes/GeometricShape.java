package cmo.lab.shapes;

import cmo.lab.painter.GeometricShapeDrawer;

import java.awt.*;

public abstract class GeometricShape {

    public abstract double area();
    public abstract double perimeter();

    public abstract GeometricShapeDrawer newDrawer();

}
