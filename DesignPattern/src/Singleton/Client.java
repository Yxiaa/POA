package Singleton;

public class Client {

    Product prodA;
    Product prodB;

    public Client() {
        prodA = ProductFactory.getInstance().createProductA();
    }

    public void foo() {
        prodA.stuff();
        Product myProdB = ProductFactory.getInstance().createProductB();
        myProdB.stuff();
        Product myProdC = ProductFactory.getInstance().createProductC();
        myProdC.stuff();
    }

}
