import java.util.*;

import static java.lang.String.valueOf;

public class WordBalancerCounter {
   public WordBalancerCounter(){

   };
    private boolean isBalancedWord(String word){
        Map<Integer, Integer> sets= new HashMap<>();
        Set<Integer> list= new HashSet<>();
        Integer length=word.length();
        word.toLowerCase();
        Integer temp=0;
        for(int i=0;i<length;i++){

            if (sets.get((int)word.charAt(i))==null)
            sets.put((int) word.charAt(i),0);
            temp=sets.get((int)word.charAt(i));
            temp++;
            sets.put((int) word.charAt(i),temp);
        }
sets.forEach((k,v) -> list.add(v));
        if(list.size()==1)
        return true;
        else
            return false;
    }
   public Integer count(String input){
        int count=0;
        String word ="";
        for(int i=1;i<input.length()+1;i++){
            for (int j=0; j<input.length()-i+1;j++) {
                word = input.substring(j, j + i);
                if (isBalancedWord(word)) {
                    count++;
                }
            }
        }

    return count;
   }


}
