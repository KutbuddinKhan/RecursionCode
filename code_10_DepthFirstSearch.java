import java.util.Set;
import java.util.HashSet;


public class code_10_DepthFirstSearch {

    // Define the node class
    static class Node{
        int val;
        Set<Node> neighbors;

        public Node(int val){
            this.val = val;
            this.neighbors = new HashSet<>();
        }

        public Set<Node> getNeighbors(){
            return neighbors;
        }
    }
    
    // Depth first search
    boolean depthFirstSearch(Node node, Set<Node> visited, int goal){
        if(node == null){
            return false;
        }
        if(node.val == goal){
            return true;
        }

        for (Node neighbor : node.getNeighbors()){
            if(visited.contains(neighbor)) continue;
            visited.add(neighbor);
            boolean isFound = depthFirstSearch(neighbor, visited, goal);

            if(isFound) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        code_10_DepthFirstSearch dfs = new code_10_DepthFirstSearch();

        // Create ndoes and build a graph
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);

        // Connect nodes to represent a graph
        nodeA.getNeighbors().add(nodeB);
        nodeA.getNeighbors().add(nodeC);
        nodeB.getNeighbors().add(nodeD);
        nodeC.getNeighbors().add(nodeD);
        
        Set<Node> visitedNodes = new HashSet<>();
        int goalValue = 10;

        // Perform DFS From nodeA to search for the goalValue
        boolean isFound = dfs.depthFirstSearch(nodeA, visitedNodes, goalValue);

        if(isFound){
            System.out.println("Goal value "+ goalValue + " found");
        }else{
            System.out.println("Goal value "+ goalValue + " not found");
        }
    }
}
