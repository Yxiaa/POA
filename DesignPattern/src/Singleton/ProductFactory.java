package Singleton;

public class ProductFactory {

    private static ProductFactory ourInstance = new ProductFactory();

    public static ProductFactory getInstance() {
        return ourInstance;
    }

    private ProductFactory() {
    }

    public Product createProductA() {
        return new ProductA();
    }

    public Product createProductC() {
        return new ProductC();
    }
    public Product createProductB() {
        return new ProductB();
    }

}
