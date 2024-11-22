package Factory;

public class CoffeMashine {

    public void makeCoffe(Coffe coffe) {
        System.out.println("Начало варки кофе");
        coffe.brew();
    }
}
