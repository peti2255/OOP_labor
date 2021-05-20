package Lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public void ReadFromFileData(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.trim().split(" ");
                Product prd = new Product(Integer.parseInt(items[0]), items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3]));
                this.products.add(prd);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Storage(String fileName) {
        this.products = new ArrayList<Product>();
        this.ReadFromFileData(fileName);
        this.SortByComparator((o1, o2) -> o1.compareTo(o2));
    }

    public void ReadFromFileUpdate(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                ;
                String[] items = line.trim().split(" ");
                Product prdt = binarySearch(Integer.parseInt(items[0]));
                try {
                    prdt.increaseAmount(Integer.parseInt(items[1]));
                    counter++;
                } catch (NullPointerException ignored) {
                }
            }
            System.out.println("Update"+counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SortByComparator(Comparator<Product> comparator) {
        this.products.sort(comparator);
    }

    public Product binarySearch(int ID) {
        int e = 0, u = this.products.size() - 1, k = 0;
        while (e <= u) {
            k = (e + u) / 2;
            if (ID == products.get(k).getID()) {
                return products.get(k);
            } else {
                if (ID < products.get(k).getID())
                    u = k - 1;
                if (ID > products.get(k).getID())
                    e = k + 1;
            }
        }
        return null;
    }

}