package Factory;

public class ShapeFactory {

    public Shape2D createRectangle() {
        return new Rectangle();
    }

    public Shape2D createRectangle(Point2D rp, double l, double w) {
        return new Rectangle(rp, l,w);
    }

    public Shape3D createCuboid() {
        return new Cuboid();
    }

    public Shape3D createCuboid(Point3D rp, double length, double width, double height) {
        return new Cuboid(rp, length, width, height);
    }

    public Shape3D createCone() {
        return new Cone();
    }

    public Shape3D createCone(Point3D rp, double height, double radius) {
        return new Cone(rp, height, radius);
    }

    public Shape3D createSphere() {
        return new Sphere();
    }

    public Shape3D createSphere(Point3D rp, double radius) {
        return new Sphere(rp, radius);
    }

    public Shape2D createSquare() {
        return new Square();
    }

    public Shape2D createSquare(Point2D rp, double size) {
        return new Square(rp, size);
    }

    public Point2D createPoint2D() {
        return new Point2D();
    }

    public Point2D createPoint2D(double x, double y) {
        return new Point2D(x, y);
    }

    public Point3D createPoint3D() {
        return new Point3D();
    }

    public Point3D createPoint3D(double x, double y, double z) {
        return new Point3D(x, y, z);
    }



}

