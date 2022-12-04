package KiemTraJava.Bai04;

public class Square extends Rectangle{
    private double side;
    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[color= \" + color + \", filled= \" + filled + \"], side=" + side +"]]";
    }
}
