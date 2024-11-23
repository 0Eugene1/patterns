package com.patterns.adapter;

public class Computer {

    public void connectUsb(Usb usbDevice) {
        usbDevice.connect();
        System.out.println("Подключено к компьютеру через USB");
    }
}
