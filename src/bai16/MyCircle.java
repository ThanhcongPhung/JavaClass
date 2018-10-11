package bai16;

public class MyCircle {
    private MyPoint center;
    private double radius;


    public MyCircle() {
        center = new MyPoint();
        radius = 1.0;
    }

    public MyCircle(int xCenter, int yCenter, double radius) {
        center = new MyPoint(xCenter, yCenter);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setRadius(MyPoint center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "Hinh tron @(" + center + ") Ban kinh = " + radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        c1.setCenterXY(0, 3);
        System.out.println(c1);
        MyPoint p1 = new MyPoint(4, 0);
        MyCircle c2 = new MyCircle(p1, 9);
        System.out.println(c2);
        System.out.println(c1.distance(c2));
    }
}
