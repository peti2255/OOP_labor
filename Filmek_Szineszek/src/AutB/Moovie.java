package AutB;

import java.util.Random;

public class Moovie {
    public  static int mooviecount = 0;
    private String id;
    private String title;
    private final Category category;
    private int ActorCount;
    private final double lenght;
    private final boolean fiction;

    public Moovie(String title, Category category,double lenght, boolean fiction) {
        Moovie.mooviecount++;
        this.title = title;
        this.category = category;
        this.fiction = fiction;
        this.lenght = lenght;
        this.id = this.title.substring(0,1) +"_"+ category.toString().substring(0,1) +"_"+ Moovie.mooviecount;
        this.ActorCount = (new Random().nextInt(31))+1;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getActorCount() {
        return this.ActorCount;
    }

    public double getLenght() {
        return this.lenght;
    }

    public boolean isFiction() {
        return this.fiction;
    }

    @Override
    public String toString() {
       StringBuffer buffer = new StringBuffer();

       buffer.append(this.id).append(": \n")
               .append("\tTitle:").append(this.title).append("\n")
               .append("\tCategory:").append(this.category).append("\n")
               .append("\tCast count:").append(this.ActorCount).append("\n")
               .append("\tLenght:").append(this.lenght).append("\n")
               .append("\tFiction:").append(this.fiction).append("\n");
       return buffer.toString();
    }
}
