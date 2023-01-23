import java.util.List;

public class BubbleSort{
    public BubbleSort(){}

   public List<Double> sort(List<Double> input) throws Exception{
        if(input==null) throw new RuntimeException("List not be null");
        int count;
        input.remove(null);
        int listSize=input.size();
        do {
             count=0;
            for (int i = 0; i < listSize - 1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    count++;
                    Double a = input.get(i + 1);
                    input.set(i + 1, input.get(i));
                    input.set(i, a);
                }

            }
        }while (count>0);




       return input;
   }


}
