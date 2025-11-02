package poo.exercicios.entidadesExercicios;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        double calcArea = width * height;
        return calcArea;
    }

    public double perimeter() {
        double calcPerimeter = 2 * (width + height);
        return calcPerimeter;
    }

    public double diagonal() {
        double calcDiagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return calcDiagonal;
    }

    public String toString() {
        return 
        String.format("AREA = %.2f%n", area()) + 
        String.format("PERIMETER = %.2f%n", perimeter()) + 
        String.format("DIAGONAL = %.2f%n", diagonal());
    }

}
