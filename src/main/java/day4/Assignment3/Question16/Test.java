package day4.Assignment3.Question16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(10));
        circles.add(new Circle(9));
        circles.add(new Circle(8));
        circles.add(new Circle(7));

        Collections.sort(circles);

        System.out.println("Circle sort test: ");
        for(Circle c : circles){
            System.out.println(c.area());
        }

        System.out.println("---------------------");

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 8));
        rectangles.add(new Rectangle(8, 8));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(4.1, 8.5));

        Collections.sort(rectangles);

        System.out.println("Rectangle sort test: ");
        for(Rectangle r : rectangles){
            System.out.println(r.area());
        }

        System.out.println("---------------------");

        List<Square> squares = new ArrayList<>();
        squares.add(new Square(3));
        squares.add(new Square(1));
        squares.add(new Square(2.2));
        squares.add(new Square(6.6));

        Collections.sort(squares);

        System.out.println("Square sort test: ");
        for(Square s : squares){
            System.out.println(s.area());
        }








    }

}
