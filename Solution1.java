public class Solution1 {
    // Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                n /= 2;
                if (n % 2 == 1) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(Solution1.countSetBits(5));
        int i, j;

i = 100;

j = 300;

while(++i < --j);

System.out.println(i);
    }
}
