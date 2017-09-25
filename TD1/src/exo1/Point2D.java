package exo1;

public class Point2D {

    private double x = 0;
    private double y = 0;

    public Point2D (double x, double y){
        translate(x, y);
    }

    public void translate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(p.getX() - getX(), 2) + Math.pow(p.getY() - getY(), 2));
    }

    public boolean isOrigin() {
        return x == 0 && y ==0;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
