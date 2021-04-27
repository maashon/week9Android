package com.example.week9;

import org.junit.Test;

import static org.junit.Assert.*;

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
    Change ch =new Change();
    @Test
    public void fun1test1() { assertEquals( ch.fun1("Adam Nagy"), "A7am Naay"); }
    @Test
    public void fun1test2() { assertEquals( ch.fun1("Nagy Adam"), "Naay A7am"); }
    @Test
    public void fun1test3() { assertEquals( ch.fun1("i"), "g"); }
    @Test
    public void fun1test4() { assertEquals( ch.fun1("I"), "G"); }
    @Test
    public void fun1test5() { assertEquals( ch.fun1("D"), "7"); }
    @Test
    public void fun1test6() { assertEquals( ch.fun1("g"), "a"); }
    @Test
    public void fun1test7() { assertEquals( ch.fun1("G"), "A"); }





    @Test
    public void fun2test1() { assertEquals(ch.fun2("PARSA"), 375); }
    @Test
    public void fun2test2() { assertEquals(ch.fun2("ADAM"), 275); }
    @Test
    public void fun2test3() { assertEquals(ch.fun2("ELTE"), 298); }
    @Test
    public void fun2test4() { assertEquals(ch.fun2("INF"), 221); }
    @Test
    public void fun2test5() { assertEquals(ch.fun2("BUDAPEST"), 600); }



}