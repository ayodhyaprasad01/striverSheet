// Parent class
class Parent {
    public void property() {
        System.out.println("cash + land + gold");
    }

    public void marry() {
        System.out.println("subbalakshmi"); // overridden method
    }
}

// Child class that overrides marry()
class Child extends Parent {
    @Override
    public void marry() {
        System.out.println("3sha / 4me / 9tara / anushka"); // overriding method
    }
}

// Test class with main method
public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marry(); // subbalakshmi (Parent method)

        Child c = new Child();
        c.marry(); // 3sha / 4me / 9tara / anushka (Child method)

        Parent p1 = new Child(); // runtime polymorphism
        p1.marry(); // 3sha / 4me / 9tara / anushka (Child method)
    }
}
