class buySell {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        maxProfit(prices);

    }
    public static int maxProfit(int[] prices) {
        int mp = 0,bp = 0 , sp = 1;

        while(sp < prices.length){
            int tp = prices[sp] - prices[bp];
            if(bp > sp) {
                bp = sp;
                sp += 1;
            }
            if(bp < sp){
                sp += 1;
            }

            mp = Math.max(tp,mp);


        }
        System.out.print(mp);
        if(mp <= 0) return 0;
        else return mp;

    }

}