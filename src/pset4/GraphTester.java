package pset4;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

/**
 * Created by Eric on 4/12/2017.
 */
public class GraphTester {
    // tests for method "addEdge" in class "Graph"
    @Test
    public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals(g.toString(), "nodes=[0, 1]; edges={0=[1]}");
    }
    // your tests for method "addEdge" in class "Graph" go here
    // you must provide at least 4 test methods;
    // each test method must have at least 1 invocation of addEdge;
    // each test method must have at least 1 test assertion;
    // your test methods must provide full statement coverage of your
    // implementation of addEdge and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework
    // tests for method "unreachable" in class "Graph"

    @Test
    public void tae1() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        assertEquals(g.toString(), "nodes=[0, 1, 2, 3]; edges={0=[1], 2=[3]}");
    }

    @Test
    public void tae2() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        assertEquals(g.toString(), "nodes=[0, 1, 2]; edges={0=[1, 2]}");
    }

    @Test
    public void tae3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        assertEquals(g.toString(), "nodes=[0, 1, 2]; edges={0=[1], 1=[2]}");
    }


    @Test
    public void tae4() {
        Graph g = new Graph();
        g.addEdge(0, 0);
        g.addEdge(0, 0);
        assertEquals(g.toString(), "nodes=[0]; edges={0=[0, 0]}");
    }

    @Test
    public void tae5() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        assertEquals(g.toString(), "nodes=[0, 1]; edges={0=[1], 1=[0]}");
    }


    @Test
    public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new HashSet<Integer>();
        nodes.add(0);
        assertTrue(g.unreachable(new HashSet<Integer>(), nodes));
    }
    // your tests for method "unreachable" in class "Graph" go here
    // you must provide at least 6 test methods;
    // each test method must have at least 1 invocation of unreachable;
    // each test method must have at least 1 test assertion;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    // your test methods must provide full statement coverage of your
    // implementation of unreachable and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework


    @Test
    public void tr1() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        s.add(0);
        t.add(1);
        assertFalse(g.unreachable(s, t));
    }

    @Test
    public void tr2() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        assertTrue(g.unreachable(s, t));
    }
    @Test
    public void tr3() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        s.add(0);
        s.add(1);
        s.add(2);
        s.add(3);
        t.add(0);
        t.add(1);
        t.add(2);
        t.add(3);
        assertFalse(g.unreachable(s, t));
    }
    @Test
    public void tr4() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(3, 2);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        s.add(0);
        t.add(3);
        assertTrue(g.unreachable(s, t));
    }

    @Test
    public void tr5() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        t.add(1);
        assertTrue(g.unreachable(s, t));
    }

    @Test
    public void tr6() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        s.add(1);
        t.add(0);
        assertFalse(g.unreachable(s, t));
    }

    @Test
    public void tr7() {
        Graph g = new Graph();
        g.addNode(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        Set<Integer> s = new HashSet<>();
        s.add(0);
        s.add(1);
        s.add(2);
        Set<Integer> t= new HashSet<>();
        t.add(3);
        assertTrue(g.unreachable(s, t));
    }

    @Test
    public void tr8() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        s.add(0);
        assertTrue(g.unreachable(s, t));
    }

    @Test(expected = IllegalArgumentException.class)
    public void tr9() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.unreachable(null, null);
    }

}
