package Factory;

public class CoffeFactory {

    public Coffe getCoffe(CoffeType coffeType) {
        switch (coffeType) {
            case ESPRESSO :
                return new Espresso();
            case AMERICANO:
                return new Americano();
            default: throw new IllegalArgumentException("Такого кофе нет");
        }
    }
}
