import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left = null, right = null;

    Node(int val) {
        this.data = val;
    }
}

public class PreOrdertraversal {
    public static List<Integer> preOrdertraversal(Node node) {

        List<Integer> list = new ArrayList<>();
        preOrderHelpper(node, list);

        return list;
    }

    public static void preOrderHelpper(Node node, List<Integer> list) {

        if (node == null) {
            return;
        }

        list.add(node.data);
        preOrderHelpper(node.left, list);
        preOrderHelpper(node.right, list);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> list = preOrdertraversal(root);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
