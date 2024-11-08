class A {
    public void m1() {
        System.out.println("M1 from class A");
    }

    void m2() {
        m1();
    }
}

class B extends A {
    public void m1() {
        System.out.println("B");
    }
}

class Strings {
    public static void main(String[] args) {
        B obj = new B();
        // B.m2();

    }
}
