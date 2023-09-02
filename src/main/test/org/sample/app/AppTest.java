package org.sample.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    App app;
    int v1;
    int v2;

    @Before
    public void setup(){
        app = new App();
        v1 = 100;
        v2 = 50;
    }

    @Test
    public void testAdd(){
        int result = app.add(v1,v2);
        Assert.assertEquals(result, 150);
    }

    @Test
    public void testSubtract(){
        int result = app.subtract(v1,v2);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void testMultiply(){
        int result = app.multiply(v1,v2);
        Assert.assertEquals(result, 5000);
    }

    @Test
    public void testDivide(){
        int result = app.divide(v1,v2);
        Assert.assertEquals(result, 2);
    }
}
