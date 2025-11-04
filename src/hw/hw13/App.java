package hw.hw13;

public class App {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[]{
                new Circle(5),
                new Triangle(3,4,5),
                new Square(4)
        };
        printAreas(figures);
    }

    private static void printAreas(GeometricFigure[] figures) {
        for (GeometricFigure f : figures) {
            System.out.println(f+" Area: "+f.area());
        }
    }
}
