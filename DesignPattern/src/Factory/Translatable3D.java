package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
public interface Translatable3D extends Translatable2D {
    public Point3D getRefPoint();
    public void translate(double dx, double dy, double dz);
}
