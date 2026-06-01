package org.example.algorithms;

import java.util.*;

public class BreadthFirstSearch {

    public Node bfs(Node start){
        // should print nodes in bfs order
        Queue<Node> queue = new ArrayDeque<>();
        Node node = start;
        while(node != null){
            queue.add(node);

        }
        return start;
    }
    public class Node {
        String name;
        public List<Node> neighbors = new ArrayList<>();

        public Node(String name) {this.name = name;}
    }
}
