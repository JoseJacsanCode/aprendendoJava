package poo.utilitarios;

public class Calculator {
    public static  final double PI = 3.14159;

    public static double circumference(double radius) {
        double calcCircumference = 2.0 * PI * radius;
        return calcCircumference;
    }

    public static double volume(double radius) {
        double calcVolume = 4.0 * PI * Math.pow(radius, 3) / 3.0;
        return calcVolume;
    }
}
