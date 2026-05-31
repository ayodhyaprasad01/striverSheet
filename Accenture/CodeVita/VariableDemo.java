class VariableDemo {
    static int count = 0;

    static void increment() {
        count++;
    }

    public static void main(String args[]) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj: count is=" + count);
        // System.out.println("Obj2: count is=" + obj2.count);
    }
}