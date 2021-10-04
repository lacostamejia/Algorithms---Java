import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class Binary_Search_Tree {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name); //Calling constructor for a new node.

        if (root == null) { //If this is the new element; then this new node is the root
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.Key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.RightChild;

                    if (focusNode == null) {
                        parent.RightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void InOrderTraverseTree(Node focusNode) {
        if (focusNode != null) //If is not empty
        {
            InOrderTraverseTree(focusNode.leftChild); //Go to the left
            System.out.println(focusNode);

            InOrderTraverseTree(focusNode.RightChild); //Go to the right
        }
    }


    public static void main(String[] args) {
        Binary_Search_Tree theTree = new Binary_Search_Tree();
        theTree.addNode(50, "Boss");
        theTree.addNode(40, "X");
        theTree.addNode(30, "Y");
        theTree.addNode(20, "Z");
        theTree.addNode(10, "D");

        theTree.InOrderTraverseTree(theTree.root); //We start at the root

    }

}

class Node {
    int Key;
    String name;
    Node leftChild;
    Node RightChild;

    Node(int key, String name) {
        this.Key = key;
        this.name = name;
    }

    public String toString() {
        return name + " has a key " + Key;
    }
}
