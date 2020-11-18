package strings.makinganagrams;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        Map<Character, Integer> aCharsCounts = new HashMap<>();
        Map<Character, Integer> bCharsCounts = new HashMap<>();
        initCharMap(aCharsCounts);
        initCharMap(bCharsCounts);

        for (int i = 0; i < a.length(); i++) {
            Integer aCharCount = aCharsCounts.get(a.charAt(i));
            if (aCharCount == 0) {
                aCharsCounts.put(a.charAt(i), 1);
            } else {
                aCharsCounts.put(a.charAt(i), ++aCharCount);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            Integer bCharCount = bCharsCounts.get(b.charAt(i));
            if (bCharCount == 0) {
                bCharsCounts.put(b.charAt(i), 1);
            } else {
                bCharsCounts.put(b.charAt(i), ++bCharCount);
            }
        }

        int delCount = 0;
        delCount += Math.abs(aCharsCounts.get('a') - bCharsCounts.get('a'));
        delCount += Math.abs(aCharsCounts.get('b') - bCharsCounts.get('b'));
        delCount += Math.abs(aCharsCounts.get('c') - bCharsCounts.get('c'));
        delCount += Math.abs(aCharsCounts.get('d') - bCharsCounts.get('d'));
        delCount += Math.abs(aCharsCounts.get('e') - bCharsCounts.get('e'));
        delCount += Math.abs(aCharsCounts.get('f') - bCharsCounts.get('f'));
        delCount += Math.abs(aCharsCounts.get('g') - bCharsCounts.get('g'));
        delCount += Math.abs(aCharsCounts.get('h') - bCharsCounts.get('h'));
        delCount += Math.abs(aCharsCounts.get('i') - bCharsCounts.get('i'));
        delCount += Math.abs(aCharsCounts.get('j') - bCharsCounts.get('j'));
        delCount += Math.abs(aCharsCounts.get('k') - bCharsCounts.get('k'));
        delCount += Math.abs(aCharsCounts.get('l') - bCharsCounts.get('l'));
        delCount += Math.abs(aCharsCounts.get('m') - bCharsCounts.get('m'));
        delCount += Math.abs(aCharsCounts.get('n') - bCharsCounts.get('n'));
        delCount += Math.abs(aCharsCounts.get('o') - bCharsCounts.get('o'));
        delCount += Math.abs(aCharsCounts.get('p') - bCharsCounts.get('p'));
        delCount += Math.abs(aCharsCounts.get('q') - bCharsCounts.get('q'));
        delCount += Math.abs(aCharsCounts.get('r') - bCharsCounts.get('r'));
        delCount += Math.abs(aCharsCounts.get('s') - bCharsCounts.get('s'));
        delCount += Math.abs(aCharsCounts.get('t') - bCharsCounts.get('t'));
        delCount += Math.abs(aCharsCounts.get('u') - bCharsCounts.get('u'));
        delCount += Math.abs(aCharsCounts.get('v') - bCharsCounts.get('v'));
        delCount += Math.abs(aCharsCounts.get('w') - bCharsCounts.get('w'));
        delCount += Math.abs(aCharsCounts.get('x') - bCharsCounts.get('x'));
        delCount += Math.abs(aCharsCounts.get('y') - bCharsCounts.get('y'));
        delCount += Math.abs(aCharsCounts.get('z') - bCharsCounts.get('z'));
        return delCount;
    }

    private static void initCharMap(Map<Character, Integer> charCountMap) {
        charCountMap.put('a', 0);
        charCountMap.put('b', 0);
        charCountMap.put('c', 0);
        charCountMap.put('d', 0);
        charCountMap.put('e', 0);
        charCountMap.put('f', 0);
        charCountMap.put('g', 0);
        charCountMap.put('h', 0);
        charCountMap.put('i', 0);
        charCountMap.put('j', 0);
        charCountMap.put('k', 0);
        charCountMap.put('l', 0);
        charCountMap.put('m', 0);
        charCountMap.put('n', 0);
        charCountMap.put('o', 0);
        charCountMap.put('p', 0);
        charCountMap.put('q', 0);
        charCountMap.put('r', 0);
        charCountMap.put('s', 0);
        charCountMap.put('t', 0);
        charCountMap.put('u', 0);
        charCountMap.put('v', 0);
        charCountMap.put('w', 0);
        charCountMap.put('x', 0);
        charCountMap.put('y', 0);
        charCountMap.put('z', 0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
