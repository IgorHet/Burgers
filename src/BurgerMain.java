public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Звичайний бургер", "пшенична булочка", "яловичина", "чеддер", "салат, помідори", "майонез");
        Burger dietBurger = new Burger("Дієтичний бургер", "бездріжджова булочка", "курятина", "сир з низьким вмістом жиру", "листя салату, огірки");
        Burger doubleMeatBurger = new Burger("Бургер з подвійним м'ясом", "житнє булочка з насінням", "яловичина", "гауда", "руккола, цибуля", true);

        // Виведення інформації про бургери
        System.out.println(regularBurger);
        System.out.println(dietBurger);
        System.out.println(doubleMeatBurger);
    }
}