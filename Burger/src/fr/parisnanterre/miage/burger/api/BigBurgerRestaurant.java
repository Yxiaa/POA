package fr.parisnanterre.miage.burger.api;

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
                        addTomato();
                return b;
            case FISH_MENU:
                    b = new BBuilder(Meat.FISH).
                        with_sauce(Sauce.BEARNAISE);
                return b;
            default:
                return null;
        }

    }

    public BBuilder order_personal(Size size, Meat meat) {
        BBuilder b = new BBuilder(meat, size);
        return b;
    }

    private BigBurgerRestaurant() {
    }
}
