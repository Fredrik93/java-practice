package algorithms;

import org.example.algorithms.BreadthFirstSearch;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearchTest {
    private BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

    @Test
    void testOk() {
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        BreadthFirstSearch.Node a = bfs.new Node("A");
        BreadthFirstSearch.Node b = bfs.new Node("B");
        BreadthFirstSearch.Node c = bfs.new Node("C");

        // A -> B, C
        a.neighbors.add(b);
        a.neighbors.add(c);

        // B -> D, E
        BreadthFirstSearch.Node d = bfs.new Node("D");
        BreadthFirstSearch.Node e = bfs.new Node("E");
        b.neighbors.add(d);
        b.neighbors.add(e);

        // C -> F
        BreadthFirstSearch.Node f = bfs.new Node("F");
        c.neighbors.add(f);


        breadthFirstSearch.bfs(a);
    }


}
