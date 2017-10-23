package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:11
 * To change this template use File | Settings | File Templates.
 */
public class Sphere extends Shape3D {
    private double radius;

    public Sphere() {
        this(new Point3D(), 10);
    }

    public Sphere(Point3D rp, double radius) {
        super(rp);
        this.radius = radius;
    }

    @Override
    public double volume() {
        // 4/3 * pi * r^3
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surface() {
        // 4 * pi * r^2
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "I am a sphere "+getRefPoint().toString()+"-"+radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
