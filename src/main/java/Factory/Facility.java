package Factory;

public class Facility {
    private final CoffeMashine coffeMashine;

    public Facility(CoffeMashine coffeMashine) {
        this.coffeMashine = coffeMashine;
    }

    public void start(CoffeType coffeType) {
        CoffeFactory coffeFactory = new CoffeFactory();
        Coffe coffe = coffeFactory.getCoffe(coffeType);

        coffeMashine.makeCoffe(coffe);
        System.out.println("Процесс завершен. Ваше " + coffeType + " готово!" );
        }
    }

