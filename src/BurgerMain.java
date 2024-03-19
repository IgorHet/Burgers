public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dietBurger = new Burger(true);
        Burger doubleMeatBurger = new Burger("double meat");
    }
}