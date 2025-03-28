package collection.set.test;

import java.util.Objects;

public class Rectangle {

    private int length;
    private int height;


    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
