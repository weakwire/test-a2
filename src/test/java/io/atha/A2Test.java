package io.atha;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class A2Test extends TestCase {
    public A2Test(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(A2Test.class);
    }

    public void testA2() {
        assertTrue(new A2().getName().contains("A2"));
    }
}
