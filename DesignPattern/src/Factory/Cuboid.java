package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:14
 * To change this template use File | Settings | File Templates.
 */
public class Cuboid extends Shape3D {
    private double length;
    private double width;
    private double height;

    public Cuboid() {
        this(new Point3D(), 10, 10, 10);
    }

    public Cuboid(Point3D rp, double length, double width, double height) {
        super(rp);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double surface() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    @Override
    public String toString() {
        return "I am a cuboid "+getRefPoint().toString()+"-"+length+"x"+width+"x"+height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
