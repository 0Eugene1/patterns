package com.patterns.adapter;

public class MemoryCard implements MemoryCardReader {
    @Override
    public void insert() {
        System.out.println("Карта памяти подключена");
    }
}
