package fr.parisnanterre.miage.burger.api;

import java.util.ArrayList;

public class BBuilder {

    Meat meat;
    Size size;
    ArrayList<Sauce> sauce;
    boolean wo;
    boolean wc;
    boolean tomato;

    BBuilder(Meat meat) {
        this.meat = meat;
    }

    BBuilder(Meat meat, Size size) {
        this.meat = meat;
        this.size = size;
    }

    BBuilder with_sauce(Sauce s) {
        sauce.add(s);
        return this;
    }

    BBuilder with_onions(){
        this.wo = true;
        return this;
    }

    BBuilder with_cheese() {
        this.wc = true;
        return this;
    }

    Burger cook(){
        return new Burger(this);
    }

    public BBuilder addTomato() {
        this.tomato = true;
        return this;
    }
}
