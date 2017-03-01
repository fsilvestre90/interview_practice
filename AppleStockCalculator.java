public class AppleStockCalculator {
    public static int getMaxProfit(int[] yesterdaysPrices) {
        int minPrice = yesterdaysPrices[0]; // lowest price so far
        int maxProfit = 0;

        for (int currentPrice : yesterdaysPrices) {
            // ensure we have the minimum price
            minPrice = Math.min(minPrice, currentPrice);

            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        System.out.println(getMaxProfit(stockPricesYesterday));
    }
}