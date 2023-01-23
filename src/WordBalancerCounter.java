import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordBalancerCounter {
    public WordBalancerCounter() {
    }

    private boolean isBalancedWord(String word) {
        Map<Integer, Integer> letterSet = new HashMap<>();
        Set<Integer> countLetterList = new HashSet<>();
        word.toLowerCase();
        int length = word.length();
        Integer temp = 0;

        for (int i = 0; i < length; i++) {
            letterSet.putIfAbsent((int) word.charAt(i), 0);
            temp = letterSet.get((int) word.charAt(i));
            temp++;
            letterSet.put((int) word.charAt(i), temp);
        }

        letterSet.forEach((k, v) -> countLetterList.add(v));

        return countLetterList.size() == 1;
    }

    public Integer count(String input) {
        if (input == null) throw new RuntimeException("Value is null.");
        int length = input.length();
        int count = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if ((int) input.charAt(i) < 97 || (int) input.charAt(i) > 122)
                throw new RuntimeException("Value have special chars.");
        }

        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < length - i + 1; j++) {
                word = input.substring(j, j + i);
                if (isBalancedWord(word)) count++;

            }

            }

            return count;
        }
    }






