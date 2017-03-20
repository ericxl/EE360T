package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
public class FibListAugmentTester {
    @Test
    public void test0(){
        FibList l = new FibList();
        assertTrue(l.repOk());
        l.augment();
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        // your code goes here

        assertTrue(l.repOk());
        assertTrue(l.size == 4);
        FibList.Node current = l.header;
        assertTrue(current != null);
        assertTrue(current.elem == 1);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 1);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 2);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 3);

    }

    @Test
    public void test1() {
        FibList l = new FibList();
        assertTrue(l.repOk());
        l.augment();
        assertTrue(l.repOk());
        l.augment();
        assertTrue(l.repOk());
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        // your code goes here

        assertTrue(l.repOk());
        assertTrue(l.size == 5);
        FibList.Node current = l.header;
        assertTrue(current != null);
        assertTrue(current.elem == 1);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 1);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 2);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 3);
        current = current.next;
        assertTrue(current != null);
        assertTrue(current.elem == 5);
    }
}
