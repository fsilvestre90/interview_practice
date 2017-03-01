public class AppleStockCalculator {
    public static int getMaxProfit(int[] yesterdaysPrices) {
        int maxProfit = 0;
        // we are going to compare each time, solution is O(N^2)
        for (int outerTime = 0; outerTime < yesterdaysPrices.length; outerTime++) {
            for (int innerTime = 0; innerTime < yesterdaysPrices.length; innerTime++) {
                // now we get the times
                int earlierTime = Math.min(outerTime, innerTime);
                int laterTime = Math.max(outerTime, innerTime);

                // now get the prices
                int earlierPrice = yesterdaysPrices[earlierTime]; 
                int laterPrice = yesterdaysPrices[laterTime];

                // calculate the potential profit
                int potentialProfit = laterPrice - earlierPrice;
                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        System.out.println(getMaxProfit(stockPricesYesterday));
    }
}