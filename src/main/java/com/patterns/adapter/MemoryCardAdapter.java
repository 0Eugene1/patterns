package com.patterns.adapter;

public class MemoryCardAdapter implements Usb {
    private final MemoryCardReader memoryCardReader;

    public MemoryCardAdapter(MemoryCardReader memoryCardReader){
        this.memoryCardReader = memoryCardReader;
    }

    @Override
    public void connect() {
        memoryCardReader.insert();
    }
}
