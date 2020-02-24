class maxDepthBinaryTree {
	static class TreeNode{ 
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}

	public static void main (String[] args){
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(10);
		System.out.println(maxDepth(root));
	}

	public static int maxDepth(TreeNode root){
		int depth = traverse(root, 0);
		return depth;
	}

	public static int traverse(TreeNode root, int depth){
		if (root == null)
			return depth;
		var leftDepth = traverse(root.left, depth++);
		var rightDepth = traverse(root.right, depth++);
		return Math.max(leftDepth, rightDepth); 
	}
}