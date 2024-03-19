public class Burger {
    private String name;
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    // Конструктор для звичайного бургера
    public Burger() {
        this.name = "Звичайний бургер";
        this.bun = "пшенична булочка";
        this.meat = "яловичина";
        this.cheese = "чеддер";
        this.greens = "салат, помідори";
        this.mayo = "майонез";
        printIngredients();
    }

    // Конструктор для дієтичного бургера (без майонезу)
    public Burger(boolean isDiet) {
        if (isDiet) {
            this.name = "Дієтичний бургер";
        } else {
            this.name = "Дієтичний бургер з майонезом";
        }
        this.bun = "бездріжджова булочка";
        this.meat = "курятина";
        this.cheese = "сир з низьким вмістом жиру";
        this.greens = "листя салату, огірки";
        if (isDiet) {
            this.mayo = "без майонезу";
        } else {
            this.mayo = "майонез";
        }
        printIngredients();
    }

    // Конструктор для бургера з подвійним м'ясом
    public Burger(String doubleMeat) {
        this.name = "Бургер з подвійним м'ясом";
        this.bun = "житнє булочка з насінням";
        this.meat = "дві шари яловичини";
        this.cheese = "гауда";
        this.greens = "руккола, цибуля";
        this.mayo = "майонез";
        printIngredients();
    }

    // Метод для виведення складу бургера
    private void printIngredients() {
        System.out.println("Бургер: " + name);
        System.out.println("Склад:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayo);
        System.out.println();
    }
}