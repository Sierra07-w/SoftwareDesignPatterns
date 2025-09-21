package abstractFactory;

interface Coffee {
    void brew();
}

interface Tea {
    void brew();
}

class ItalianCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("Итальянский кофе сварен!");
    }
}

class ItalianTea implements Tea {
    @Override
    public void brew() {
        System.out.println("Итальянский чай заварен!");
    }
}

class KazakhCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("Казахский кофе сварен!");
    }
}

class KazakhTea implements Tea {
    @Override
    public void brew() {
        System.out.println("Казахский чай заварен!");
    }
}

interface CafeFactory {
    Coffee createCoffee();
    Tea createTea();
}

class ItalianCafeFactory implements CafeFactory {
    @Override
    public Coffee createCoffee() {
        return new ItalianCoffee();
    }
    @Override
    public Tea createTea() {
        return new ItalianTea();
    }
}

class KazakhCafeFactory implements CafeFactory {
    @Override
    public Coffee createCoffee() {
        return new KazakhCoffee();
    }
    @Override
    public Tea createTea() {
        return new KazakhTea();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CafeFactory factory = new ItalianCafeFactory();
        Coffee coffee = factory.createCoffee();
        Tea tea = factory.createTea();
        coffee.brew();
        tea.brew();

        System.out.println("------");

        factory = new KazakhCafeFactory();
        coffee = factory.createCoffee();
        tea = factory.createTea();
        coffee.brew();
        tea.brew();
    }
}
