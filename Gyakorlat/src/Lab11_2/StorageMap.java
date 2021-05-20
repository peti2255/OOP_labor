package Lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StorageMap {
    private Map<Integer,Product> products = new HashMap<>();

    public StorageMap(String filename)
    {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.trim().split(" ");
                Product prd = new Product(Integer.parseInt(items[0].trim()),
                        items[1].trim(),
                        Integer.parseInt(items[2].trim()),
                       Integer.parseInt(items[3].trim()));
                this.products.put(prd.getID(),prd);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printProducts()
    {
        for (Map.Entry<Integer,Product> p : products.entrySet()) {
            System.out.println(p.getKey() + "->" + p.getValue());
        }
    }

    public void updates(String filename)
    {
        try (Scanner scanner = new Scanner(new File(filename))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                ;
                String[] items = line.trim().split(" ");
                int id = Integer.parseInt(items[0]);
                if(products.containsKey(id))
                {
                   Product prd = products.get(id);
                   prd.increaseAmount(Integer.parseInt(items[1]));
                   counter++;
                }
            }
            System.out.println("Update:" + counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
