package fundamentals.oop.lsp;

public class LSP {
    public static void main(String[] args) {
        C d = new D();
        d.myMethod();
    }
}

class A{
    int x = 10;
    public void myMethod(){
        System.out.println("x = " + x);
    }
}

class B extends A{
    int x = 20;
}

class C extends B{
    int x = 30;
}

class D extends C{
    int x = 40;

    @Override
    public void myMethod() {
        System.out.println("x = " + x);
    }
}


