package day4.Assignment3.Question16;

public class Square extends Shape{
    private final double width;

    public Square(double width){
        this.width = width;
    }

    @Override
    public double area() {
        return Math.pow(width, 2);
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(this.area(), shape.area());
    }
}
