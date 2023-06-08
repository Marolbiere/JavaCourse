package cmo.lab.painter;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Painter extends JComponent {

    private ArrayList<GeometricShapeDrawer> shapes;
    public void setShapes(ArrayList<GeometricShapeDrawer> s) {
        this.shapes = s;
    }

    public void paint(Graphics g) {
        for (GeometricShapeDrawer s :
                shapes) {
            s.drawOn(g);
        }
    }
}
