package com.daclink.drew.fa21.fa21_inclasstdd;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplication_test(){
        Random random = new Random();
        int x = random.nextInt(1000);
        int y = random.nextInt(1000);

        assertEquals(x*y, Util.multiply(x,y));
    }
}