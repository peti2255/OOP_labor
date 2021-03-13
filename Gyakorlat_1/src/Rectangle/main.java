package Rectangle;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        for (int i = 0; i < rectangles.length; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }

        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);
        System.out.println("Area");
        for (Rectangle rectangle : rectangles)
        System.out.println(rectangle.area());
        System.out.println("Perimeter");
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle.perimeter());
    }
}
