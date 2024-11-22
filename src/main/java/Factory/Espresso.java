package Factory;

public class Espresso implements Coffe{
    @Override
    public void brew() {
        System.out.println("Готовим Эспрессо");
    }
}
