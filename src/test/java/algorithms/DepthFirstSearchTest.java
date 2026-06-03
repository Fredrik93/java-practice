package algorithms;

import org.example.algorithms.BreadthFirstSearch;
import org.example.algorithms.DepthFirstSearch;
import org.example.algorithms.Node;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstSearchTest {
    private final DepthFirstSearch dfs = new DepthFirstSearch();

    @Test
    void testOk() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");

        // A -> B, C
        a.neighbors.add(b);
        a.neighbors.add(c);

        // B -> D, E
        Node d = new Node("D");
        Node e = new Node("E");
        b.neighbors.add(d);
        b.neighbors.add(e);

        // C -> F
        Node f = new Node("F");
        c.neighbors.add(f);

        List<Node> result = dfs.dfs(a);
        List<String> actualNodeNames = result.stream().map(n -> n.name).toList();
        List<String> expectedNodeNames = List.of("A", "C", "F", "B", "E", "D");

        assertEquals(expectedNodeNames, actualNodeNames);
    }

    /**
     * If there is a cycle we should make sure that it does not loop forever
     */
    @Test
    void testCycleisOk() {

        Node a = new Node("A");
        Node b = new Node("B");
        // A -> B
        a.neighbors.add(b);

        // B -> A
        b.neighbors.add(a);

        List<Node> result = dfs.dfs(a);
        List<String> actualNodeNames = result.stream().map(n -> n.name).toList();
        List<String> expectedNodeNames = List.of("A", "B");

        assertEquals(expectedNodeNames, actualNodeNames);


    }


}
