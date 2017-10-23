package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape2D extends Shape implements Translatable2D {
    private Point2D refPoint;

    public Shape2D(Point2D rp) {
        this.refPoint = rp;
    }

    public abstract double perimeter();

    @Override
    public void translate(double dx, double dy) {
        getRefPoint().translate(dx, dy);
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }
}
