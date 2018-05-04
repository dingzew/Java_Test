class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if ((p == null && q != null) 
                 || (p != null && q == null)) return false;
        else return (p.val == q.val) && 
            isSameTree(p.left, q.left) && 
            isSameTree(p.right, q.right);
    }


    private static void printTree(TreeNode node) {
    	if (node == null) {
    		System.out.print("null ");
    		return;
    	}
    	printTree(node.left);
    	System.out.print(node.val + " ");
    	printTree(node.right);
    }

    public static void main(String args[]) {
    	TreeNode root1 = new TreeNode(1);
    	root1.left = new TreeNode(2);
    	root1.right = new TreeNode(3);

    	TreeNode root2 = new TreeNode(1);
    	root2.left = new TreeNode(2);
    	root2.right = new TreeNode(3);

    	System.out.println("Compare between:");
    	printTree(root1);
    	System.out.println("");
    	System.out.println("-----------------");
    	printTree(root2);
    	System.out.println("");
    	System.out.println("-----------------");
    	System.out.println(isSameTree(root1, root2));
    }

}