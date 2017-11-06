package fr.parisnanterre.miage.burger.api;

import java.util.ArrayList;

public class Burger {

    private Meat meat;
    private Size size;
    private ArrayList<Sauce> sauce;
    private boolean wo;
    private boolean wc;

    Burger (BBuilder b) {
    this.meat = b.meat;
    this.size = b.size;
    this.sauce = b.sauce;
    this.wo = b.wo;
    this.wc = this.wc;
    }

    public String toString() {
        return "";
    }

}
