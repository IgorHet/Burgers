public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger();
        Burger dietBurger = new Burger(true);
        Burger doubleMeatBurger = new Burger("double meat");

        // Виведення інформації про бургери
        System.out.println(regularBurger);
        System.out.println(dietBurger);
        System.out.println(doubleMeatBurger);
    }
}