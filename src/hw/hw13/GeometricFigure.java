package hw.hw13;

public abstract sealed class GeometricFigure permits Circle,Triangle,Square {
    public abstract double area();
}
