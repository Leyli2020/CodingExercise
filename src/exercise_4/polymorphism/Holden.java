package exercise_4.polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, "Holden");
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
