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
        // p.methodTwo(); // Compile-time error: methodTwo() is not defined in Parent

        Child c = new Child();
        c.methodOne();
        c.methodTwo();

        Parent p1 = new Child();
        p1.methodOne();
        // p1.methodTwo(); // Compile-time error: methodTwo() is not defined in Parent

        // Child c1 = new Parent(); // Compile-time error: incompatible types
    }
}
// The IsaRelation class demonstrates the relationship between Parent and Child classes.
// The Parent class has a methodOne() method, while the Child class extends Parent and adds 
