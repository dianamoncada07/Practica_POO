package ar.com.ada.oop.overloading.instantation;

public class Arithmetic {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(Integer a, int b) {
        return a + b;
    }

    public int sum(int a, Integer b) {
        return a + b;
    }

    public int sum(Integer a, Integer b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(Double a, double b) {
        return a + b;
    }

    public double sum(double a, Double b) {
        return a + b;
    }

    public double sum(Double a, Double b) {
        return a + b;
    }
    
}