package SOLID.LSP.goodCode;

public class WriteableClass extends ReadableClass implements Writable{

    @Override
    public void write() {
        System.out.println("We are doing a write");
    }
}
