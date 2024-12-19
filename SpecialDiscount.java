public class SpecialDiscount {

    public int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        // SpecialDiscount sd = new SpecialDiscount();
        // int[] prices = { 10, 1, 1, 6 };
        // int[] result = sd.finalPrices(prices);
        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }
        if (true && false | true) {
            System.out.println("trues");
        }
    }
}
