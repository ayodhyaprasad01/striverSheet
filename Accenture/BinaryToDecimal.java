public class BinaryToDecimal {

    public String binaryToDecimal(String n) {

        int decimal = Integer.parseInt(n, 16);
        return String.valueOf(decimal);
    }

    public static void main(String[] args) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.binaryToDecimal("16"));
    }
}

// for (int i = 0; i < array.length; i++) {

// }
// return null;
// }
// }
