import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordBalancerCounterTest {
    private WordBalancerCounter counter;


    @BeforeEach
    void beforeEach(){
        counter = new WordBalancerCounter();
       }


    @Test
    void shouldCountCorrectWord() {

        //given
        String word= "aabbabcccba";

        //then
        int result= counter.count(word);

        //when
        Assertions.assertEquals(28,result);
    }

    @Test
    void shouldCountEmptyString() {

        //given
        String word= "";

        //then
        int result= counter.count(word);

        //when
        Assertions.assertEquals(0,result);
    }

    @Test
    void shouldThrowRuntimeExceptionOnInvalidArgument() {

       //given
        String word= "abababa1";

        //then
        RuntimeException thrown = Assertions
                .assertThrows(RuntimeException.class, () -> {
                    counter.count(word);
                }, "Value have special chars.");



        //when
        Assertions.assertEquals("Value have special chars.", thrown.getMessage());

    }

    @Test
    void shouldThrowRuntimeExceptionOnNull(){

        //given
        String word= null;

        //then
        RuntimeException thrown =Assertions
                .assertThrows(RuntimeException.class, () -> {
                    counter.count(word);
                }, "Value is null.");

        //when
        Assertions.assertEquals("Value is null.", thrown.getMessage());
    }
}