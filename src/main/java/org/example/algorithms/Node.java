package org.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Node {

        public String name;
        public List<Node> neighbors = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

}
