public class NSEWForK {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            // Calculate the area
            int area = width * h;
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Maximum area: " + maxArea(height)); // Output: 49
    }
}