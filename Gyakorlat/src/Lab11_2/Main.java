package Lab11_2;

public class Main {

    public static void main(String[] args) {
        StorageMap storageMap = new StorageMap("data1000000.txt");

        long startTime = System.nanoTime();

        //ide kell beirni az elvegzendo muveletet
        storageMap.updates("update10000000.txt");

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        //storageMap.printProducts();
        System.out.println("\n");
        Storage storage = new Storage("data1000000.txt");
        startTime = System.nanoTime();

        //ide kell beirni az elvegzendo muveletet
        storage.ReadFromFileUpdate("update10000000.txt");

        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
