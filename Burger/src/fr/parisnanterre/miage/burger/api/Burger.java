package fr.parisnanterre.miage.burger.api;

import java.util.ArrayList;

public class Burger {

    private Meat meat;
    private Size size;
    private ArrayList<Sauce> sauce;
    private boolean wo;
    private boolean wc;
    private Menu menu;

    Burger (BBuilder b) {
    this.meat = b.meat;
    this.size = b.size;
    this.sauce = b.sauce;
    this.wo = b.wo;
    this.wc = b.wc;
    this.menu = b.menu;
    }

    public String toString() {
        String str = this.menu + "\n" +
                this.meat +  " ( "+ this.size + " )\n";

        if(!sauce.isEmpty()) {
            for (Sauce c : sauce) {
                str = str + c + " \n";
            }
        }

        if(wo) {
            str = str + "With onion \n";
        }

        if(wc) {
            str = str + "With cheese \n";
        }

        str = str + "\n\n";
        return str;
    }

}
