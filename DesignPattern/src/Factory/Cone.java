package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone() {
        this(new Point3D(), 10, 10);
    }

    public Cone(Point3D rp, double height, double radius) {
        super(rp);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        // 1/3 pi r^2 * h
        return (1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surface() {
        // pi * r * (r+a), avec a = sqrt (r^2 + h^2)
        double a = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + a);

    }

    @Override
    public String toString() {
        return "I am a cone "+getRefPoint().toString()+"-"+height+"/"+radius;
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
