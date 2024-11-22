package Factory;

public class Americano implements Coffe {
    @Override
    public void brew() {
        System.out.println("Готовим Американо");
    }
}
