package pset2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTester {
    /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */
    @Test
    public void cAndNull() {
        assertFalse(new C("ha").equals(null));
    }

    @Test
    public void dAndNull() {
        assertFalse(new D("ha",1).equals(null));
    }

    @Test
    public void objectAndNull() {
        assertFalse(new Object().equals(null));
    }

    /*
     * P2: It is reflexive: for any non-null reference value x, x.equals(x) should return true.
     */
    @Test
    public void cAndC() {
        C c = new C("ha");
        c.equals(c);
    }

    @Test
    public void dAndD() {
        D d = new D("ha",3);
        d.equals(d);
    }

    @Test
    public void objectAndObject() {
        Object o = new Object();
        o.equals(o);
    }
    /*
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */
    // your test methods for P4 go here
}
