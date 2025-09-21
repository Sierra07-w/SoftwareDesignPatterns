interface Drink {
    void prepare();
}

class Coffee implements Drink {
    @Override
    public void prepare() {
        System.out.println("Готовим кофе...");
    }
}

class Tea implements Drink {
    @Override
    public void prepare() {
        System.out.println("Готовим чай...");
    }
}

class DrinkFactory {
    public static Drink createDrink(String type) {
        if (type.equalsIgnoreCase("coffee")) {
            return new Coffee();
        } else if (type.equalsIgnoreCase("tea")) {
            return new Tea();
        } else {
            throw new IllegalArgumentException("Неизвестный напиток: " + type);
        }
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Drink drink1 = DrinkFactory.createDrink("coffee");
        drink1.prepare();

        Drink drink2 = DrinkFactory.createDrink("tea");
        drink2.prepare();
    }
}
