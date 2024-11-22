package Adapter;

public class Usb implements UsbReader {
    @Override
    public void insert() {
        System.out.println("Usb подключено");
    }
}
