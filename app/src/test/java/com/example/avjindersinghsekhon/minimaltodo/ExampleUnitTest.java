package com.example.avjindersinghsekhon.minimaltodo;

import com.example.avjindersinghsekhon.minimaltodo.Utility.ToDoItem;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void add() { assertEquals(4, 2 + 2);
    }

    @Test
    public void testa(){
        int a = ToDoItem.addition(4,5);
        assertEquals(a,9);
    }
}