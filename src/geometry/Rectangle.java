package geometry;

public class Rectangle {
    private double length;//default = à
    private double width; //default = 0
    private double area;
    private static int amountOfRectanglesCreated = 0;

    {
        amountOfRectanglesCreated++;

    }

    public static int getAmountOfRectanglesCreated() {
        return amountOfRectanglesCreated;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
        area = this.length * this.width;
    }

    public Rectangle() {
        this(length = 1, width = 1);
        System.out.println("This is a constructor without parameters.");
    }

    public Rectangle(double side) {

    }

}
