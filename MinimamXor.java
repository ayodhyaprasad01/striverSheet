public class MinimamXor {
    public int minimizeXor(int num1, int num2) {
        int tarB = Integer.bitCount(num2);
        int curB = Integer.bitCount(num1);

        if (curB == tarB) {
            return num1;
        }

        int result = num1;

        if (curB > tarB) {
            for (int i = 0; i < 32 && curB > tarB; i++) {
                if ((result & (1 << i)) != 0) {
                    result &= ~(1 << i);
                    curB--;
                }
            }
        } else {
            for (int i = 0; i < 32 && curB < tarB; i++) {
                if ((result & (1 << i)) == 0) {
                    result |= (1 << i);
                    curB++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MinimamXor m = new MinimamXor();
        System.out.println(m.minimizeXor(5, 3)); // 3
        System.out.println(m.minimizeXor(10, 7)); // 11

    }
}
