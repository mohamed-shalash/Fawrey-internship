package example.store;

import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.mockito.Mockito;

import java.util.List;
import java.util.regex.Matcher;

public class MockitoTest {


    @Test void test1() {
        List list = Mockito.mock(List.class);

        list.add("red");        // add "red"
        list.add("green");      // add "green"
        list.add("blue");       // add "blue
        list.clear();           // clear

      /*  Mockito.when(list.get(Matchers.anyInt())).thenReturn("Yellow");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        Mockito.verify(list).add("red");
        Mockito.verify(list).clear();
        Mockito.verify(list, Mockito.times(3)).add(Matchers.anyString());*/
    }

}
