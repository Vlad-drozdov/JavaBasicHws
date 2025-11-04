package hw.hw13;

public final class Square extends GeometricFigure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return Math.pow(a,2);
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
