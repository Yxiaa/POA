package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 03/12/2013
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class Tests {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Point2D p2_0 = factory.createPoint2D();
        Point2D p2_1 = factory.createPoint2D(2,4);
        Point3D p3_0 = factory.createPoint3D();
        Point3D p3_1 = factory.createPoint3D(2, 3, 4);
        //
        // Square fail1 = new Shape2D(); // impossible
        Shape pas_fail1 = factory.createSquare();
        System.out.println(pas_fail1); // square
        //
        Shape2D s1 = factory.createSquare(p2_0,20);
        System.out.println(s1); // square
        System.out.println(s1.perimeter() + " " + s1.surface());
        Shape2D s2 = factory.createRectangle(p2_1,20, 25);
        System.out.println(s2); // square
        //
        Shape2D r1 = factory.createRectangle();
        System.out.println(r1); // rectangle
        System.out.println(r1.perimeter() + " " + s1.surface());
        //
        Shape3D c1 = factory.createCone(p3_1,10,20);
        System.out.println(c1); // cone
        System.out.println(c1.volume() + " " + c1.surface());
        //
        Shape3D h1 = factory.createSphere(p3_1,10);
        System.out.println(h1); // sphere
        System.out.println(h1.volume() + " " + h1.surface());
        //
        Shape3D k1 = factory.createCuboid(p3_1,10,20,30);
        System.out.println(k1); // cuboid
        System.out.println(k1.volume() + " " + k1.surface());
    }
}
