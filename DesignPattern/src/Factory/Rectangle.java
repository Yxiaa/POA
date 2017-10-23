package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle() {
        this(new Point2D(), 10, 10);
    }

    public Rectangle(Point2D rp, double length, double width) {
        super(rp);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "I am a rectangle " + getRefPoint().toString() + "-" + getLength() + "x" + getWidth();
    }

    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double surface() {
        return length * width;
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
}
