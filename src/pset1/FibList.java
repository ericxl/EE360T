package pset1;
import java.util.HashSet;
import java.util.Set;
public class FibList {
    Node header;
    int size;
    static class Node {
        int elem;
        Node next;
    }
    public FibList() {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();


        n1.elem = 1;
        n1.next = n2;
        n2.elem = 1;
        n2.next = n3;
        n3.elem = 2;
        size = 3;
        header = n1;
    }

    public boolean repOk() {
        // postcondition: returns true iff (1) <this> is an acyclic list, i.e.,
        //                         there is no path from a node to itself;
        //                         (2) the list elements form a Fibonacci series,
        //                         i.e., the element in any node is the sum of
        //                         the elements in the two preceding nodes
        //                         (if they exist); and (3) size >=3
        if (size < 3) return false;
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null) {
            if (!visited.add(n)) {
                return false;
            }
            if (n.next != null) {
                if (n.next.next != null) {
                    if (n.next.next.elem != n.elem + n.next.elem) {
                        return false;
                    }
                }
            }
            n = n.next;
        }
        return size == visited.size();
    }

    public int augment() {
        // precondition: this.repOk()
        // postcondition: adds a new node at the end of the list w.r.t. repOk
        //                and returns the element in this node;
        //                the rest of the list is unmodified;
        Node n = header;
        Node n1 = header;
        Node n2 = header;
        while (n != null) {
            if(n2 != n1){
                n2 = n2.next;
            }
            if(n1 != n){
                n1 = n1.next;
            }
            n = n.next;
        }
        n = new Node();
        n.elem = n1.elem + n2.elem;
        n1.next = n;
        size ++;
        return n.elem;
    }
}