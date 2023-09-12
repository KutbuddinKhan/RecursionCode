public class code_9_InsertValueIntoBianryTree {

    public static void printLeaved(TreeNode head){
        if (head == null){
            return;
        }
        // Check if a given node is a leaf
        if (head.left == null && head.right == null){
            System.out.print(head.data + ", ");
            return;
        }
        if(head.left != null){
            printLeaved(head.left);
        }
        if(head.right != null){
            printLeaved(head.right);
        }
    }

    public TreeNode insertNode(TreeNode head, int data) {
        if (head == null) {
            return new TreeNode(data);
        }

        if (head.data < data) {
            head.right = insertNode(head.right, data);
        } else {
            head.left = insertNode(head.left, data);
        }
        return head;
    }

    public static void inOrderTraversal(TreeNode head) {
        if (head != null) {
            inOrderTraversal(head.left);
            System.out.print(head.data + " ");
            inOrderTraversal(head.right);
        }
    }

    public static void main(String[] args) {
        code_9_InsertValueIntoBianryTree tree = new code_9_InsertValueIntoBianryTree(); // Create an instance
    
        TreeNode head = new TreeNode(100);
        head = tree.insertNode(head, 80);
        head = tree.insertNode(head, 50);
        head = tree.insertNode(head, 30);
        head = tree.insertNode(head, 60);
        head = tree.insertNode(head, 90);
        head = tree.insertNode(head, 85);
        head = tree.insertNode(head, 92);
        head = tree.insertNode(head, 120);
        head = tree.insertNode(head, 110);
        head = tree.insertNode(head, 115);
        head = tree.insertNode(head, 140);
        head = tree.insertNode(head, 150);

        int valueToInsert = 108;
        head = tree.insertNode(head, valueToInsert);

        System.out.println("In-Order Traversal of the modified BST:");
        inOrderTraversal(head);

        System.out.println("\nLeaf nodes of the BST:");
        printLeaved(head);
    }
}
