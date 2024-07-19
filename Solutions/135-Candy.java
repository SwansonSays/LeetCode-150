class Solution135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candies = 0;
        int[] candiesArr = new int[n];

        for(int i = 0; i < n; i++) {
            candiesArr[i] = 1;
        }

        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i-1]) {
                candiesArr[i] = candiesArr[i-1] + 1;
            }
        }

        for(int i = n - 2; i >=0; i--) {
            if(ratings[i] > ratings[i+1]) {
                if(candiesArr[i] <= candiesArr[i+1]) {
                    candiesArr[i] = candiesArr[i+1] + 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            candies += candiesArr[i];
        }

        return candies;
    }
}