package hello;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class AppTest {

    @Test
    public void test1() {
    test1 t=new test1();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void test18() {
    test1 t=new test1();
        String expected = "beer";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);

        
    }

    
    @Test
    public void test18() {
    test1 t=new test1();
        String expected = "naman";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
