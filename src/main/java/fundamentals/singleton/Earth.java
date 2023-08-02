package fundamentals.singleton;

public class Earth {
    private static Earth earth;

    private Earth() {
    }

    public static Earth getInstance(){
        return (earth != null)? earth:(earth = new Earth());
    }
}
