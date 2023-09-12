public class code_8_MergeTwoSrotedLinkedList {

    static class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Create the first sorted linked list: 1 -> 5 -> 13 -> 14 -> 550
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(13);
        Node n4 = new Node(14);
        Node n5 = new Node(550);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Create the second sorted linked list: 2 -> 15 -> 130 -> 200 -> 350
        Node n1_1 = new Node(2);
        Node n1_2 = new Node(15);
        Node n1_3 = new Node(130);
        Node n1_4 = new Node(200);
        Node n1_5 = new Node(350);

        n1_1.next = n1_2;
        n1_2.next = n1_3;
        n1_3.next = n1_4;
        n1_4.next = n1_5;

        // Print the merged linked list
        printLinkedList(n1);
        printLinkedList(n1_1);

        // Merge the two sorted linked lists
        Node mergeLists = mergeLists(n1, n1_1);

        // Print the merged Linked list
        printLinkedList(mergeLists);
    }

    public static Node mergeLists(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        if(l1.val <= l2.val){
            l1.next = mergeLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeLists(l1, l2.next);
            return l2;
        }
    }

    private static void printLinkedList(Node node){
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
