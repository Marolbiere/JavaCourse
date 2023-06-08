package cmo.lab.shapes;
import cmo.lab.shapes.Point;
import cmo.lab.shapes.Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestTriangle {
    @Test
    void TestConstructor() {
        Point a = new Point(2,4);
        Point b = new Point(3,6);
        Point c = new Point(1,2);
        Triangle t = new Triangle(a,b,c);

        assertEquals(a, t.getA());
        assertEquals(b, t.getB());
        assertEquals(c, t.getC());
    }

    void TestMeasureTriangle() {
        Point a = new Point(2,4);
        Point b = new Point(3,6);
        Point c = new Point(1,2);
        Triangle t = new Triangle(a,b,c);

        //assertEquals(,t.perimeter());
        //assertEquals(,t.area());

    }

}
