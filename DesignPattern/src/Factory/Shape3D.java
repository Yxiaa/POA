package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape3D extends Shape implements Translatable3D {
    public Point3D refPoint;

    public Shape3D(Point3D rp) {
        refPoint = rp;
    }

    public abstract double volume();

    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }

    @Override
    public void translate(double dx, double dy) {
        getRefPoint().translate(dx, dy);
    }

    @Override
    public void translate(double dx, double dy, double dz) {
        getRefPoint().translate(dx, dy, dz);
    }
}
