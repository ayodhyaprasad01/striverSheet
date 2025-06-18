class Parent {
    public void methodOne() {
    }
}

class Child extends Parent {
    public void methodTwo() {
    }
}

class IsaRelation {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.methodOne();

        Child c = new Child();
        c.methodOne();
        c.methodTwo();

        Parent p1 = new Child();
        p1.methodOne();
        p1.methodTwo(); // Compile-time error: methodTwo() is not defined in Parent

    }
}
