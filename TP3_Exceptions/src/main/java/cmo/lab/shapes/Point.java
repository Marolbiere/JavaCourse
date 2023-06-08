package cmo.lab.shapes;

public class Point {
    private int x;
    private int y;
    public Point(int i, int j) {
        x = i;
        y = j;
    }
    public void setX(int i) {x = i;}
    public void setY(int j) {y = j;}
    public int getX() {return x;}
    public int getY() {return y;}

    public String toString() {
        return "<"+getX()+"@"+getY()+">";
    }
}