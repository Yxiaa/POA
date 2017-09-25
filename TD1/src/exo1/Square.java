package exo1;

public class Square extends Rectangle {

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double surface() {
        return super.surface();
    }

    public Square() {
    super();
    }

    public Square(double l, double w){

        if(l == w)
        {
            setLength(l);
            setWidth(w);
        }
        else
            System.out.println("erreur");

    }
}
