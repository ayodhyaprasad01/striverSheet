import java.util.Arrays;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0);

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < list.size(); right++) {
            if (list.get(right) == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (list.get(left) == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Maximum consecutive 1s (with one flip): " + maxLen);
    }
}
