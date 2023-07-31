package fundamentals.has_a;

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Car {
    private Engine engine = new Engine();
    {
        System.out.println("This is the Car class");
    }
}

class Engine {
    {
        System.out.println("This is the Engine class");
    }
}
