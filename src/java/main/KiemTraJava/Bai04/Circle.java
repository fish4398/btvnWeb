package KiemTraJava.Bai04;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color= " + color + ", filled= " + filled + "], radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (this.radius * 2)*Math.PI;
    }
}
