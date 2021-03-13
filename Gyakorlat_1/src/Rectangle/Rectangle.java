package Rectangle;

public class Rectangle {
    private double lenght;
    private  double width;
    public  Rectangle(double lenght, double width)
    {
        this.lenght = lenght;
        this.width = width;
    }
    public double getLenght() {
        return this.lenght;
    }

    public double getWidth() {
        return this.width;
    }


    public double area()
    {
        return this.lenght*this.width;
    }
    public double perimeter()
    {
        return (2*this.lenght)+(2*this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}
