package fr.parisnanterre.miage.burger.api;

import static fr.parisnanterre.miage.burger.api.Menu.FISH_MENU;
import static fr.parisnanterre.miage.burger.api.Menu.MEAT_MENU;

public class BigBurgerRestaurant {
    private static BigBurgerRestaurant instanceResto = new BigBurgerRestaurant();

    public static BigBurgerRestaurant queue() {
        return instanceResto;
    }

    public BBuilder order_menu(Menu menu) {
        BBuilder b;
        switch(menu) {
            case MEAT_MENU:
                    b = new BBuilder(Meat.BEEF).
                        with_sauce(Sauce.BURGER).
                        with_onions().
                            addMenu(MEAT_MENU).
                        addTomato();
                return b;
            case FISH_MENU:
                    b = new BBuilder(Meat.FISH).
                            addMenu(FISH_MENU).
                        with_sauce(Sauce.BEARNAISE);
                return b;
            default:
                return null;
        }

    }

    public BBuilder order_personal(Size size, Meat meat) {
        BBuilder b = new BBuilder(meat, size).
                addMenu(FISH_MENU);
        return b;
    }

    private BigBurgerRestaurant() {
    }
}
