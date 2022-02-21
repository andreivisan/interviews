import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
    
    public static void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.printf("%d ", current.val);

            if (current.right != null) {
                stack.push(current.right);
            }
            
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void preOrderRecursive(TreeNode root) {
        if (root != null) {
            System.out.printf("%d ", root.val);
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public static void inOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.printf("%d ", current.val);
            current = current.right;
        }
    }

    public static void inOrderRecursive(TreeNode root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.printf("%d ", root.val);
            inOrderRecursive(root.right);
        }
    }

    public static List<Integer> postOrderIterative(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root == null) {
            return values;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            values.add(0, current.val);

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }

        return values;
    }

    public static void postOrderRecursive(TreeNode root) {
        if(root == null) {
            return;
        }
            
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.printf("%d ", root.val);
    }

    public static TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);
 
        rootNode.left = node20;
        rootNode.right = node60;
 
        node20.left = node10;
        node20.right = node30;
 
        node60.left = node50;
        node60.right = node70;
 
        return rootNode;
    }

    public static void main(String[] args) {
        TreeNode binaryTree = createBinaryTree();

        System.out.println("**** PRE-ORDER TRAVERSAL ****");
        preOrderIterative(binaryTree);
        System.out.println("\n**** Recursive ****");
        preOrderRecursive(binaryTree);

        System.out.println("\n\n");

        System.out.println("**** IN-ORDER TRAVERSAL ****");
        inOrderIterative(binaryTree);
        System.out.println("\n**** Recursive ****");
        inOrderRecursive(binaryTree);

        System.out.println("\n\n");

        System.out.println("**** POST-ORDER TRAVERSAL ****");
        postOrderIterative(binaryTree).stream().forEach(value -> {
            System.out.printf("%d ", value);
        });
        System.out.println("\n**** Recursive ****");
        postOrderRecursive(binaryTree);
    }

}
