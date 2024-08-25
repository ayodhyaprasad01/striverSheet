public class NewClass {
    public static void main(String[] args) {
        
        int num = 70;
        int i = 3;

        int getIthBit = (num >> (i - 1)) & 1;

        int setIthBit = num | (1 << (i - 1));

        int clearIthBit = num & (~(1 << (i - 1)));

        System.out.println(getIthBit + " " + setIthBit + " " + clearIthBit);
    }
}
