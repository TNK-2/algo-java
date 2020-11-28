package hackerrank.search.icecreamparlor;

import java.util.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(Integer[] cost, int money) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            List<Integer> list = map.get(cost[i]);
            if (list == null) {
                list = new ArrayList<>();
                list.add(i + 1);
                map.put(cost[i], list);
            } else {
                list.add(i + i);
            }
        }

        for (int i = 0; i < cost.length; i++) {
            Integer searchPrice = money - cost[i];
            if (searchPrice <= 0) {
                continue;
            }
            if (map.get(searchPrice) != null && map.get(searchPrice).size() > 1) {
                for (int j = 0; j < map.get(searchPrice).size(); j++) {
                    if (map.get(searchPrice).get(j) == i + 1) {
                        continue;
                    }
                    List<Integer> resultList = map.get(searchPrice);
                    System.out.println((i + 1) + " " + resultList.get(j));
                    return;
                }
            } else if (map.get(searchPrice) != null && map.get(searchPrice).size() == 1) {
                if (map.get(searchPrice).get(0) == i + 1) {
                    continue;
                }
                List<Integer> resultList = map.get(searchPrice);
                System.out.println((i + 1) + " " + resultList.get(0));
                return;
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Integer[] cost = new Integer[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                Integer costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
