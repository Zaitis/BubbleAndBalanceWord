import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Double> list = new ArrayList<>();
        BubbleSort bubbleSort= new BubbleSort();
        WordBalancerCounter balancer= new WordBalancerCounter();
        String word= "aabbabcccba";

        list.add(-9.3);
        list.add(0.2);
        list.add(4d);
        list.add(null);
        list.add(0.1);
        list.add(5d);
        list.add(9d);
        System.out.println("Array before bubble sort: "+list.toString());
        System.out.println("Array after bubble sort:  "+bubbleSort.sort(list));

        System.out.println("The word \""+word+ "\" are " + balancer.count(word) + " balanced words");



    }
}
