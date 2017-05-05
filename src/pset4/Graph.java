package pset4;

import java.util.*;

public class Graph {
    private Set<Integer> nodes; // set of nodes in the graph
    private Map<Integer, List<Integer>> edges;

    // map between a node and a list of nodes that are connected to it by outgoing edges
    // class invariant: fields "nodes" and "edges" are non-null;
    // "this" graph has no node that is not in "nodes"
    public Graph() {
        nodes = new HashSet<Integer>();
        edges = new HashMap<Integer, List<Integer>>();
    }

    public String toString() {
        return "nodes=" + nodes + "; " + "edges=" + edges;
    }

    public void addNode(int n) {
        // postcondition: adds the node "n" to this graph
        nodes.add(n);
    }

    public void addEdge(int from, int to) {
        // postcondition: adds a directed edge "from" -> "to" to this graph
        if (!nodes.contains(from)) {
            addNode(from);
        }
        if (!nodes.contains(to)) {
            addNode(to);
        }

        if (!edges.containsKey(from)) {
            List<Integer> newList = new ArrayList<>();
            newList.add(to);
            edges.put(from, newList);
        } else {
            edges.get(from).add(to);
        }
    }

    public boolean unreachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) throw new IllegalArgumentException();
        // postcondition: returns true if (1) "sources" is a subset of "nodes", (2) "targets" is
        // a subset of "nodes", and (3) for each node "m" in set "targets",
        // there is no node "n" in set "sources" such that there is a
        // directed path that starts at "n" and ends at "m" in "this"; and
        // false otherwise
        if (nodes.containsAll(sources) && nodes.containsAll(targets)) {
            for (int source : sources) {
                for (int target : targets) {

                    if (source == target) {
                        return false;
                    }

                    Queue<Integer> queue = new PriorityQueue<>();
                    queue.add(source);

                    while (!queue.isEmpty()) {
                        int popped = queue.poll();
                        if (popped == target) {
                            return false;
                        }

                        if (edges.containsKey(popped)) {
                            for (int adjacent : edges.get(popped)) {
                                queue.add(adjacent);
                            }
                        }
                    }

                }
            }

            return true;
        }

        return false;
    }

}
