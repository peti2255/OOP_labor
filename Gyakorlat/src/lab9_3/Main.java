package lab9_3;

public class Main {
    public static void main(String[] args) {
//        Storage storage = new Storage("data10.txt");
//        Storage storage1 = new Storage("data100.txt");
       Storage storage2 = new Storage("data1000.txt");
//        Storage storage3 = new Storage("data10000.txt");
//        Storage storage4 = new Storage("data100000.txt");
//        Storage storage5 = new Storage("data1000000.txt");
//        storage.ReadFromFileUpdate("update10.txt");
//        storage1.ReadFromFileUpdate("update100.txt");
//        storage2.ReadFromFileUpdate("update1000.txt");
        long startTime = System.nanoTime();
        storage2.ReadFromFileUpdate("update1000000.txt");
        long elapseTime = System.nanoTime() - startTime;
        System.out.println("Ido :"+ elapseTime/100000);
    }
}
