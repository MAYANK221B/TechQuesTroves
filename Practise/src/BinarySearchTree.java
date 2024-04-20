/**
 * ---------------------------------------------NODE CLASS--------------------------------------------------------
 */
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
/**
 * ---------------------------------------------BST CLASS--------------------------------------------------------
 */
public class BinarySearchTree {
private TreeNode root;

public BinarySearchTree() {
    this.root = null;
}
//-------------------------------------------INSERT---------------------------------------------------------------------
public TreeNode insertRecursive(TreeNode node, int val){
        if(node == null)
            return new TreeNode(val);

        if(val < node.value)
            node.left = insertRecursive(node.left, val);
        else
            node.right = insertRecursive(node.right, val);

        return node;
}
    // Helper method to Insert into BST(for testing)
    public void insertR(int val) {
        this.root = insertRecursive(this.root, val);
    }

    public TreeNode insertNonRecursive(TreeNode node, int val){
    if (node==null)
        return new TreeNode(val);

    TreeNode tempNode = node;
    while(true){
        if(val>tempNode.value) {
            if(tempNode.right==null) {
                tempNode.right = new TreeNode(val);
                break;
            }
            tempNode = tempNode.right;
        }
        else {
            if(tempNode.left==null) {
                tempNode.left = new TreeNode(val);
                break;
            }
            tempNode = tempNode.left;
        }
    }
    return node;
}
    // Helper method to Insert into BST(for testing)
public void insertNR(int val){
    this.root = insertNonRecursive(this.root, val);
}

//--------------------------------------------------PRINTING-----------------------------------------------------------
private void printInorderRecursive(TreeNode node) {
    if (node == null) {
        return;
    }
    printInorderRecursive(node.left);
    System.out.print(node.value + " ");
    printInorderRecursive(node.right);
}
// Helper method to print the BST inorder (for testing)
    public void printInorder() {
        printInorderRecursive(this.root);
        System.out.println();
    }

    private void printPreorderRecursive(TreeNode node){
    if(node == null){
        return;
    }
    System.out.print(node.value + " ");
    printPreorderRecursive(node.left);
    printPreorderRecursive(node.right);
    }
    // Helper method to print the BST preorder (for testing)
    public void printPreorder() {
        printPreorderRecursive(this.root);
        System.out.println();
    }

    private void printPostorderRecursive(TreeNode node){
        if(node == null){
            return;
        }
        printPreorderRecursive(node.left);
        printPreorderRecursive(node.right);
        System.out.print(node.value + " ");
    }
    // Helper method to print the BST inorder (for testing)
    public void printPostorder() {
        printPostorderRecursive(this.root);
        System.out.println();
    }

//-----------------------------------------------SEARCHING : FIND THE NODE----------------------------------------------------------
    private boolean lookup(TreeNode root, int val){
    if(root == null)
        return false;

    TreeNode temp = root;
    while(temp!=null){
        if(val>temp.value)
            temp= temp.right;
        else if (val<temp.value)
            temp = temp.left;
        else return true;
    }
    return false;
    }
    // Helper method to search the BST (for testing)
    private boolean contains(int val){
        return lookup(this.root, val);
    }
//--------------------------------------------MIN VALUE-----------------------------------------------------------------

    private int minValue(TreeNode node){
    if(node==null)
        return 0;
    TreeNode temp =  node;
    while(temp.left!=null){
        temp =temp.left;
    }
    return temp.value;
    }
//Helper Method to find minimum value in BST
    private int findMinValue(){
    return minValue(this.root);
    }

//--------------------------------------------MAX VALUE-----------------------------------------------------------------
private int maxValue(TreeNode node){
    if(node==null)
        return 0;
    TreeNode temp =  node;
    while(temp.right!=null){
        temp =temp.right;
    }
    return temp.value;
}
    //Helper Method to find maximum value in BST
    private int findMaxValue(){
        return maxValue(this.root);
    }
//--------------------------------------------Descending order BST-----------------------------------------------------------------

    private void descendingOrderRecursive(TreeNode node){
    if(node == null)
        return;
     descendingOrderRecursive(node.right);
     System.out.print(node.value + " ");
     descendingOrderRecursive(node.left);
    }
//Helper method to print descending order BST
    private void printDescendingOrderBST(){
    descendingOrderRecursive(this.root);
    System.out.println();

    }

//--------------------------------------------MAIN----------------------------------------------------------------------
    public static void main(String[] args){
    //BinarySearchTree bst = new BinarySearchTree();
    //bst.insertR(47);
    //bst.insertR(76);
    //bst.insertR(82);
    //bst.insertR(54);
    //bst.insertR(21);
    //bst.insertR(69);

    //NonRecursive Insert
    BinarySearchTree bst2 = new BinarySearchTree();
    bst2.insertNR(50);
    bst2.insertNR(60);
    bst2.insertNR(40);
    bst2.insertNR(55);
    bst2.insertNR(45);
    bst2.insertNR(25);
    bst2.insertNR(35);

    //System.out.print("Inorder traversal of BST: ");
    //bst.printInorder(); // Output:

    System.out.print("Inorder traversal of BST 2: ");
    bst2.printInorder(); // Output:

    System.out.print("Postorder traversal of BST 2: ");
    bst2.printPostorder(); // Output:

    System.out.print("Preorder traversal of BST 2: ");
    bst2.printPreorder(); // Output:

    int value =65;
    System.out.println("Is value " + value + " present in the Tree: " + bst2.contains(value));

    int minValue = bst2.findMinValue();
    System.out.println("Minimum value of BST is " + minValue);

    int maxValue = bst2.findMaxValue();
    System.out.println("Maximum value of BST is " + maxValue);

    System.out.print("Printing BST in descending order: ");
    bst2.printDescendingOrderBST();

    System.out.print("Printing BST in ascending order: ");
    bst2.printInorder();

}
}
