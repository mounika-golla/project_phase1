package phase1_project;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    @Override
    public void show() {
        B.super.show(); 
        C.super.show(); 
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
