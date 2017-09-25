package exo1;

public class Shape3D extends Shape implements Translatable3D {

    private Point3D refPoint;

    public Shape3D() {
    }

    public Shape3D (Point3D p){
        this.refPoint = p;
    }

    public double volume() {
        return 0.0;
    }

    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }
}
