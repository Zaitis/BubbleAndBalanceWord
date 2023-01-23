import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void beforEach(){
        bubbleSort= new BubbleSort();
    }

    @Test
    void shouldSortCorrectArray() throws Exception {
        //given
        List<Double> list= Arrays.asList(1d,4d,5d,6d,8d,3d,8d);

        //then
        List<Double> result= bubbleSort.sort(list);

        //when
        Assertions.assertEquals(Arrays.asList(1d,3d,4d,5d,6d,8d,8d), result);
    }

    @Test
    void shouldSortArrayWithDoubleValue() throws Exception {

        //given
        List<Double> list= Arrays.asList(-9.3,0.2,4d,0.1,5d,9d);

        //then
        List<Double> result= bubbleSort.sort(list);


        //when
        Assertions.assertEquals(Arrays.asList(-9.3,0.1,0.2,4d,5d,9d), result);

    }
    
    @Test
    void shouldSortNullArray() throws Exception {
        
        //given
        List<Double> list = null;

        //then
        RuntimeException thrown = Assertions
                .assertThrows(RuntimeException.class, () -> {
                    bubbleSort.sort(list);
                }, "List not be null");

        //when
        Assertions.assertEquals("List not be null", thrown.getMessage());
    }

    @Test
    void shouldSortEmptyArray() throws Exception {
        //given
        List<Double> list= new ArrayList<>();

        //then
        List<Double> result=bubbleSort.sort(list);

        //when
        Assertions.assertEquals(list,result);
    }


    @Test
    void shouldSortArrayWithNull() throws Exception {

        //given
        List<Double> list = new ArrayList<>();
        list.addAll(Arrays.asList(null,5.0001));

        //then
        List<Double> result=bubbleSort.sort(list);

        //when
        Assertions.assertEquals(Arrays.asList(5.0001), result);
    }

}