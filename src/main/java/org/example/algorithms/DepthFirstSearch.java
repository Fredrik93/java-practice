package org.example.algorithms;

import java.util.*;

public class DepthFirstSearch {

    public List<Node> dfs(Node start) {
        List<Node> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        // 1. create empty stack and add start node
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(start);
        // 2. while stack is not empty take the first node and print the name
        while (!stack.isEmpty()) {

            Node current = stack.pop();
            if (!visited.contains(current.name)) {
                result.add(current);
                visited.add(current.name);
                System.out.println(current.name);
                for (Node n : current.neighbors) {
                    // 3. add neighbors
                    stack.push(n);
                }
            }
        }
        return result;
    }
}
