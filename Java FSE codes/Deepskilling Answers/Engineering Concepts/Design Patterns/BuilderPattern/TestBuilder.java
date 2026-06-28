public class TestBuilder {

    public static void main(String[] args) {

        Computer c1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM(16)
                .setStorage(512)
                .build();

        Computer c2 = new Computer.Builder()
                .setCPU("AMD Ryzen 7")
                .setRAM(32)
                .setStorage(1000)
                .build();

        c1.display();
        System.out.println();
        c2.display();
    }
}