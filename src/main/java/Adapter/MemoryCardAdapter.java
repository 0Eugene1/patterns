package Adapter;

public class MemoryCardAdapter implements UsbReader {
    private final MemoryCardReader memoryCardReader;

    public MemoryCardAdapter(MemoryCardReader memoryCardReader){
        this.memoryCardReader = memoryCardReader;
    }

    @Override
    public void insert() {
        memoryCardReader.insert();
    }
}
