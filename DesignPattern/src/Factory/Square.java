package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Rectangle {
    public Square() {
        this(new Point2D(), 10);
    }

    public Square(Point2D rp, double size) {
        super(rp, size, size);
    }

    public double getSize() {
        // attribut calculé
        return this.getWidth();
    }

    @Override
    public String toString() {
        return "I am a square " + getRefPoint().toString() + "-" + getSize();
    }
}
