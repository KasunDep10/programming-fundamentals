package fundamentals.has_a;

public class Aggregation {
    public static void main(String[] args) {
        Engine1 engine = new Engine1();
        Car1 car1 = new Car1(engine);
    }
}

class Car1 {
    private Engine1 engine;

    public Car1(Engine1 engine) {
        this.engine = engine;
        System.out.println("This is the Car1");
    }
}

class Engine1 {
    {
        System.out.println("This is the Engine");
    }
}
