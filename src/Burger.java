public class Burger {
    private String name;
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    // Конструктор для звичайного бургера
    public Burger(String name, String bun, String meat, String cheese, String greens, String mayo) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }

    // Конструктор для дієтичного бургера (без майонезу)
    public Burger(String name, String bun, String meat, String cheese, String greens) {
        this(name, bun, meat, cheese, greens, "без майонезу");
    }

    // Конструктор для бургера з подвійним м'ясом
    public Burger(String name, String bun, String meat, String cheese, String greens, boolean doubleMeat) {
        this(name, bun, doubleMeat ? "дві шари " + meat : meat, cheese, greens);
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