package exo1;

public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone() {

    }

    public Cone(double h, double r) {
        this.height = h;
        this.radius = r;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight() / 3;
    }

    @Override
    public double surface() {
        return 2 * Math.PI * getRadius();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
