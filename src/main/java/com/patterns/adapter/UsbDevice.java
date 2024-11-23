package com.patterns.adapter;

public class UsbDevice implements Usb {
    @Override
    public void connect() {
        System.out.println("Usb подключено");
    }
}
