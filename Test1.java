class Foo {
    class Bar {
    }
}

class Test1 {
    public static void main(String[] args) {
        Foo.Bar f = new Foo().new Bar();
        // Foo.Bar f = new Bar();
        /* Line 10: Missing statement ? */
        // Foo.Bar b = f.new Bar();
    }
}