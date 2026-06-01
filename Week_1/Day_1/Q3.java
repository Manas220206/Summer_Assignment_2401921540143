
class Q3  {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Q3 sol = new Q3();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = sol.maxProfit(prices);

        System.out.println(result);
    }
}