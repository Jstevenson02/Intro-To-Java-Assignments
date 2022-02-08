package Lab5(4);

public class A {

    public A() { 
        System.out.println("A constructor called");
    }

    class  B extends A {
        public B() {
            System.out.println("B constructor called");
        }
    }
}