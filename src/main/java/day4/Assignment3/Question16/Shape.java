package day4.Assignment3.Question16;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
    public abstract double area();
    public abstract int compareTo(Shape shape);
}
