package exo1;

public class Point3D extends Point2D {
    private double z = 0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public void translate(double x, double y, double z) {
        super.translate(x, y);
        this.setZ(z);
    }


    public double distance(Point3D p) {
        return Math.sqrt(Math.pow(p.getX() - getX(), 2) + Math.pow(p.getY() - getY(), 2) + Math.pow(p.getZ() - getZ(), 2));
    }

    @Override
    public boolean isOrigin() {
        return super.isOrigin() && z == 0;
    }
}
