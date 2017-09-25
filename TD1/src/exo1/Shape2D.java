package exo1;

public class Shape2D extends Shape implements Translatable2D{

    private Point2D refPoint;

    public Shape2D() {
    }

    public Shape2D (Point2D p){
    this.refPoint = p;
    }

    public double perimeter() {
        return 0.0;
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }
}
