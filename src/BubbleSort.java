import java.util.List;

public class BubbleSort{
    public BubbleSort(){



    }

   public List<Integer> sort(List<Integer> input) throws Exception{
        int count;
        do {
             count=0;
            for (int i = 0; i < input.size() - 1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    count++;
                    int a = input.get(i + 1);
                    input.set(i + 1, input.get(i));
                    input.set(i, a);
                }

            }
        }while (count>0);




       return input;
   }


}
