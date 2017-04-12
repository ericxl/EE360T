package pset2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTester {
    C c1 = new C("hello");
    C c2 = new C("hello");
    C c3 = new C("hello");

    D d1 = new D("hello", 0);
    D d2 = new D("hello", 0);
    D d3 = new D("hello", 0);

    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = new Object();

    /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */
    @Test
    public void testCNull() {
        assertFalse(c1.equals(null));
    }

    @Test
    public void testDNull() {
        assertFalse(d1.equals(null));
    }

    @Test
    public void testONull() {
        assertFalse(o1.equals(null));
    }

    /*
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */

    @Test
    public void testCCC() {
        assertTrue(c1.equals(c2) && c2.equals(c3) && c1.equals(c3));
    }

    @Test
    public void testCCD() {
        assertFalse(c1.equals(c2) && c2.equals(d1) && c1.equals(d1));
    }

    @Test
    public void testCCO() {
        assertFalse(c1.equals(c2) && c2.equals(o1) && c1.equals(o1));
    }

    @Test
    public void testCDC() {
        assertFalse(c1.equals(d1) && d1.equals(c2) && c1.equals(c2));
    }

    @Test
    public void testCDD() {
        assertFalse(c1.equals(d1) && d1.equals(d2) && c1.equals(d2));
    }

    @Test
    public void testCDO() {
        assertFalse(c1.equals(d1) && d1.equals(o1) && c1.equals(o1));
    }

    @Test
    public void testCOC() {
        assertFalse(c1.equals(o1) && o1.equals(c2) && c1.equals(c2));
    }

    @Test
    public void testCOD() {
        assertFalse(c1.equals(o1) && o1.equals(d1) && c1.equals(d1));
    }

    @Test
    public void testCOO() {
        assertFalse(c1.equals(o1) && o1.equals(o2) && c1.equals(o2));
    }

    @Test
    public void testDDD() {
        assertTrue(d1.equals(d2) && d2.equals(d3) && d1.equals(d3));
    }

    @Test
    public void testDDC() {
        assertFalse(d1.equals(d2) && d2.equals(c1) && d1.equals(c1));
    }

    @Test
    public void testDDO() {
        assertFalse(d1.equals(d2) && d2.equals(o1) && d1.equals(o1));
    }

    @Test
    public void testDCC() {
        assertFalse(d1.equals(c1) && c1.equals(c2) && d1.equals(c2));
    }

    @Test
    public void testDCD() {
        assertFalse(d1.equals(c1) && c1.equals(d2) && d1.equals(d2));
    }

    @Test
    public void testDCO() {
        assertFalse(d1.equals(c1) && c1.equals(o1) && d1.equals(o1));
    }

    @Test
    public void testDOC() {
        assertFalse(d1.equals(o1) && o1.equals(c1) && d1.equals(c1));
    }

    @Test
    public void testDOD() {
        assertFalse(d1.equals(o1) && o1.equals(d2) && d1.equals(d2));
    }

    @Test
    public void testDOO() {
        assertFalse(d1.equals(o1) && o1.equals(o2) && d1.equals(o2));
    }

    @Test
    public void testOOO() {
        assertFalse(o1.equals(o2) && o2.equals(o3) && o1.equals(o3));
    }

    @Test
    public void testOOC() {
        assertFalse(o1.equals(o2) && o2.equals(c1) && o1.equals(c1));
    }

    @Test
    public void testOOD() {
        assertFalse(o1.equals(o2) && o2.equals(d1) && o1.equals(d1));
    }

    @Test
    public void testOCO() {
        assertFalse(o1.equals(c1) && c1.equals(o2) && o1.equals(o2));
    }

    @Test
    public void testOCC() {
        assertFalse(o1.equals(c1) && c1.equals(c2) && o1.equals(c2));
    }

    @Test
    public void testOCD() {
        assertFalse(o1.equals(c1) && c1.equals(d1) && o1.equals(d1));
    }

    @Test
    public void testODO() {
        assertFalse(o1.equals(d1) && d1.equals(o2) && o1.equals(o2));
    }

    @Test
    public void testODC() {
        assertFalse(o1.equals(d1) && d1.equals(c1) && o1.equals(c1));
    }

    @Test
    public void testODD() {
        assertFalse(o1.equals(d1) && d1.equals(d2) && o1.equals(d2));
    }
}
