package org.example.algorithms;

import java.util.*;

public class BreadthFirstSearch {

    public List<Node> bfs(Node start) {
        List <Node> result = new ArrayList<>();
        // should print nodes in bfs order
        // Add set of visited nodes so that it wont loop forever if theres a cycle
        Set <Node> visited = new HashSet<>();

        // 1. create empty queue and add the first node (start node)
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(start);

        // 2 while queue is not empty take the first node out and print the name
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if(!visited.contains(currentNode)) {
                System.out.println("the node is: " + currentNode.name);
                result.add(currentNode);
                // 3. for each neighbor, add it to the queue
                for(Node n: currentNode.neighbors){
                    queue.add(n);
                }
            }
            visited.add(currentNode);


        }
        return result;
    }

    public class Node {
        public String name;
        public List<Node> neighbors = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }
    }
}
