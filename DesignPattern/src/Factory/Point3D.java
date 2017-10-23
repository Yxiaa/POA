package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public void translate(double dx, double dy) {
        super.translate(dx, dy);
    }

    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);

        z += dz;
    }

    @Override
    public boolean isOrigin() {
        return (super.isOrigin() && (z == 0));
    }

    public double distance(Point3D other) {
        // sqrt((x-x')^2 + (y-y')^2 + (z-z')^2)
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2)
                + Math.pow(this.getY() - other.getY(), 2)
                + Math.pow((this.getZ() - other.getZ()), 2));

    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
