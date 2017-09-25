package exo1;

public class Rectangle extends Shape2D {


    private double length;
    private double width;

    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public double surface() {
        return getWidth() * getLength();
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
