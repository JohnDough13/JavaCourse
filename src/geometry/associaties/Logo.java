package geometry.associaties;

import geometry.Rectangle;

public class Logo {
    public class Logo(Rectangle rectangle, Circle circle, String s) {
    }

    public static void main(String[] args) {
        Rectangle rectangle;
        Circle circle;
        String text;

        public class Logo(Rectangle rectangle, Circle circle, String text) {
            this.rectangle = rectangle;
            this.circle = circle;
            this.text = text;

        }
        public Rectangle getRectangle () {
            return rectangle;
        }
        public.void setRectangle (Rectangle rectangle){
            this.rectangle = rectangle;
        }
        public Circle getCircle () {
            return circle;
        }
        public void setCircle (Circle circle){
            this.circle = circle;
        }
        public String getText () {
            return text;
        }
        public void setText (String text){
            this.text = text;
        }

        public double getArray () {
            return rectangle.getArea() + circle.getArea();
        }
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getCircumference() {
        double circumference = (length * 2) * (widt * 2);
        return circumference;
    }

    @Override
    public String toString() {
//        return "Rectangle - length: " + length + "| width: " + width + "| Area: " + getArea();
        return "Logo \n" + text + "\n" rectangle + "\n" + circle
    }

}
}
        }
