package exo1;

public class Cuboid extends Shape3D {

    private double height;
    private double length;
    private double width;


    public Cuboid(double h, double l, double w) {

        height = h;
        length = l;
        width = w;

    }

    @Override
    public double volume() {
        return getHeight() * getLength() * getWidth();
    }

    @Override
    public double surface() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() + getLength());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
