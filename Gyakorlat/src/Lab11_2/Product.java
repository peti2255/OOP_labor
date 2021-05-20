package Lab11_2;

import java.lang.management.BufferPoolMXBean;

public class Product implements Comparable<Product>{

    private final int ID;
    private final String name;
    private int amount;
    private int price;

    public Product(int ID, String name, int amount, int price) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount (int newAmount)
    {
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.ID).append("\n")
                .append("\tName: ").append(this.name).append("\n")
                .append("\tAmount: ").append(this.amount).append("\n")
                .append("\tPrice: ").append(this.price).append("\n")
                .append("----------\n");

        return buffer.toString();
    }

    @Override
    public int compareTo(Product o) {

        return this.ID - o.getID();
    }
}
