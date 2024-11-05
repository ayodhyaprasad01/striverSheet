class A {
    public static class InnerStrings {

        public static void m1() {
            System.out.println("M1 from class A");
        }

        public static void m2() {
            m1();
        }
    }
}

class B extends A {
    public static void m1() {
        System.out.println("B");
    }
}

public class Strings {
    public static void main(String[] args) {
        B obj = new B();
        B.InnerStrings.m2();

    }
}
