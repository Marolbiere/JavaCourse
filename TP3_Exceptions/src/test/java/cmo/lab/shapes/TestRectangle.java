package cmo.lab.shapes;
import cmo.lab.shapes.Point;
import cmo.lab.shapes.Rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    void TestConstructorTP() {
        Rectangle r = new Rectangle(4, 2, 3, 1);

        Assertions.assertEquals(4, r.getOrigin().getX());
        Assertions.assertEquals(2, r.getOrigin().getY());
        Assertions.assertEquals(3, r.getCorner().getX());
        Assertions.assertEquals(1, r.getCorner().getY());

    }
    @Test
    void TestConstructorALTERNATIVE() {
        Point o = new Point(4,2);
        Point c = new Point(3,1);
        Rectangle r = new Rectangle(o,c);

        Assertions.assertEquals(4, r.getOrigin().getX());
        Assertions.assertEquals(2, r.getOrigin().getY());
        Assertions.assertEquals(3, r.getCorner().getX());
        Assertions.assertEquals(1, r.getCorner().getY());
    }
    @Test
    void TestMeasureRectangle() {
        Rectangle r = new Rectangle(4,2,3,1 );
        int width = r.width();
        int height = r.height();
        double area = r.area();
        double perimeter = r.perimeter();

        assertEquals(1,width);
        assertEquals(1,height);
        assertEquals(1,area);
        assertEquals(4,perimeter);
    }

    @Test
    void TestPrintRectangle() {
        Rectangle r = new Rectangle(4,2,3,1 );
        r.print();
        Assertions.assertEquals("Rectangle: (<4@2> , <3@1>)",r.toString());
    }

}
