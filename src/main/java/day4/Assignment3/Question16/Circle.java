package day4.Assignment3.Question16;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(this.area(), shape.area());
    }

//    @Override
//    public int compare(Shape o1, Shape o2) {
//        return Double.compare(o1.area(), o2.area());
//    }
}

