package Adapter;

public class Computer {

    public void connect(UsbReader usbReader) {
        usbReader.insert();
        System.out.println("Подключено к компьютеру через USB");
    }
}
