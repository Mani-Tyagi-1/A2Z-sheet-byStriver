public class StockBuyAndSell {
    public static void main(String[] args) {
        
        int prices[] = {7, 1, 5 ,4, 3, 6};
        int min=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++)
        {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        System.out.println(profit);

        // return profit;
    }
}
