package AutB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private String Name;
    private String Located;
    private boolean Open;
    public ArrayList<Moovie> movie;

    public Cinema(String name, String located) {
        this.Name = name;
        this.Located = located;
        this.Open = true;
        this.movie = new ArrayList<>();
    }

    public void Opene()
    {
        this.Open = !this.Open;
    }

    public void newMoovie(Moovie moovie)
    {
        this.movie.add(moovie);
    }
    public void printMoovieForId(String id)
    {
        for (Moovie c : movie)
            if(movie.equals(id))
                System.out.println(movie);
    }
    public void ReadFileFromCsv(String filename)
    {
        Scanner scanner =null;
        try {
            scanner = new Scanner(new File(filename));
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if (line.isEmpty())
            {
                continue;
            }
            String[] items = line.trim().split(", ");
            this.movie.add(new Moovie(items[0],Category.valueOf(items[1]),Double.parseDouble(items[2]),Boolean.parseBoolean(items[3])));

        }
    }
    public int NotFictionCounter ()
    {
        int count=0;
        for (int i = 0 ;i < movie.size();i++)
        {
            if(movie.get(i).isFiction())
            {
                count++;
            }

        }
        return count;
    }

    public void PrintToFile(Category category)
    {
        FileWriter file = null;
        try {
            file = new FileWriter("output.csv");
            for (Moovie m : movie)
            {
                if(m.getCategory() == category)
                    file.write(m.toString());
            }
            file.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public boolean xwatch(double timer)
    {
        if(!this.Open)
        {
            return false;
        }
            double time = 0;
            for (Moovie m : movie)
            {
                time += m.getLenght();
            }
            if(time < timer)
                return true;
            else
                return false;
        }

     public int xMovie()
     {
         int counter = 0;
         for (Moovie m: movie)
         {
             if(m.getActorCount() < 10)
                 counter++;
         }
         return counter;
     }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.Name).append("\n")
                .append(this.Located).append("\n")
                .append(this.Open).append("\n");
        for (Moovie m : movie)
        {
            buffer.append(m.getTitle()).append("\n");
        }
        return buffer.toString();
    }
}
