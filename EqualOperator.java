public class EqualOperator {
    public static void main(String[] args) {

        String s = new String("bye");

        Object obj = new Object();
        System.out.println(obj.equals(s));// false
        System.out.println(obj == s);// false
        System.out.println(obj.equals(s.toString()));// false

        obj = "bye";
        System.out.println(obj.equals(s));// true
        System.out.println(obj == s);// false
        System.out.println(obj.toString() == s);// false

        // System.out.println(s.equals());// false

    }
}
