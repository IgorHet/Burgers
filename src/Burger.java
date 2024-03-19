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
    }

    // Конструктор для бургера з подвійним м'ясом
    public Burger(String doubleMeat) {
        this.name = "Бургер з подвійним м'ясом";
        this.bun = "житнє булочка з насінням";
        this.meat = "дві шари яловичини";
        this.cheese = "гауда";
        this.greens = "руккола, цибуля";
        this.mayo = "майонез";
    }

    // Перевизначений метод toString() для виведення інформації про бургер
    @Override
    public String toString() {
        return "Бургер: " + name + "\n" +
                "Склад:\n" +
                "Булочка: " + bun + "\n" +
                "М'ясо: " + meat + "\n" +
                "Сир: " + cheese + "\n" +
                "Зелень: " + greens + "\n" +
                "Майонез: " + mayo + "\n";
    }
}