package cmo.lab.painter;

import javax.swing.*;
import java.util.ArrayList;

import cmo.lab.command.CommandLineInterface;
import cmo.lab.command.GeoFormCreator;
import cmo.lab.shapes.*;


public class PainterApp {

    public static void drawShapes(ArrayList<GeometricShape> shapes) {
        ArrayList<GeometricShapeDrawer> drawers = new ArrayList<GeometricShapeDrawer>();
        for (GeometricShape shape: shapes) {
            drawers.add(shape.newDrawer());
        }
        displayShapes(drawers);

    }

    public static void displayShapes(ArrayList<GeometricShapeDrawer> shapes) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        Painter drawer = new Painter();
        drawer.setShapes(shapes);
        window.getContentPane().add(drawer);
        window.setVisible(true);
    }

    public static void main(String[] args){
        ArrayList<GeometricShape> shapes = new ArrayList<GeometricShape>();
        Rectangle r=new Rectangle(40,20,30,50);
        Point a = new Point(50, 50);
        Point b = new Point(20,70);
        Point centre = new Point(30,50);
        Circle c=new Circle(centre, 40);
        Triangle t=new Triangle(a,b,centre);;
        shapes.add(r);
        shapes.add(c);
        shapes.add(t);

        drawShapes(shapes);
    }
}
