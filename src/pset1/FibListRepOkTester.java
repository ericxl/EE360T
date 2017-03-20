package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class FibListRepOkTester {
    @Test public void t0() {
        FibList l = new FibList();
        l.size = 2;
        assertFalse(l.repOk());
    }
    @Test public void t1() {
        FibList l = new FibList();
        assertTrue(l.repOk());
    }
    @Test public void t2() {
        //cycle
        FibList l = new FibList();
        l.header.next.next.next= l.header.next;
        assertFalse(l.repOk());
    }
    @Test public void t3() {
        //size is incorrect
        FibList l = new FibList();
        FibList.Node n = new FibList.Node();
        l.header.next.next.next = n;
        n.elem = 3;
        assertFalse(l.repOk());
    }
    @Test public void t4() {
        FibList l = new FibList();
        FibList.Node n = new FibList.Node();
        l.header.next.next.next = n;
        n.elem = 3;
        l.size = 4;
        assertTrue(l.repOk());
    }
}