package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
public interface Translatable2D {
    public Point2D getRefPoint();
    public void translate(double dx, double dy);
}
