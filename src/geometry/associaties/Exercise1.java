package geometry.associaties;

import geometry.Rectangle;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle();
        String text = new String();

        Logo logo = new Logo(rectangle, circle, text);
        System.out.println(logo.getArea());
        System.out.println(logo);
    }
}
