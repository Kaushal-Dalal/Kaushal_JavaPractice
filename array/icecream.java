package array;

import java.util.Arrays;

public class icecream {
      public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
         int count = 0;
        for (int i = 0; i < costs.length;i++) {
            if (coins < costs[i]) {
                return count;
            }
            coins -= costs[i];
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] costs = {2,3,1,4,5};
        int coins = 1;
        System.out.print(maxIceCream(costs , coins));
    }
}
