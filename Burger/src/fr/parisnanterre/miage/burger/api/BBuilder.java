package fr.parisnanterre.miage.burger.api;

import java.util.ArrayList;

public class BBuilder {

    Meat meat;
    Size size;
    ArrayList<Sauce> sauce = new ArrayList<Sauce>();
    boolean wo;
    boolean wc;
    boolean tomato;
    Menu menu;

    BBuilder(Meat meat) {
        this.meat = meat;
        this.size = Size.MEDIUM;
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

    BBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    BBuilder addMenu(Menu meatMenu) {
        this.menu = meatMenu;
        return this;

    }
}
