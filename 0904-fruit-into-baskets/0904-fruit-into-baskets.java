import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int res = 0;

        for (int high = 0; high < fruits.length; high++) {

            // Add current fruit
            int fruit = fruits[high];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            // Shrink window if more than 2 fruit types
            while (map.size() > 2) {

                int leftFruit = fruits[low];
                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                low++;
            }

            // Update maximum window size
            int len = high - low + 1;
            res = Math.max(len, res);
        }

        return res;
    }
}
    
