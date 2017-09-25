package exo1;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere() {

    }

    public Sphere(double r) {
        this.radius = r;
    }

    @Override
    public double volume() {
        return ((4*Math.PI) /3 ) * Math.pow(getRadius(), 3);
    }

    @Override
    public double surface() {
        return (4*Math.PI) * Math.pow(getRadius(), 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
