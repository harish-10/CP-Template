package datastructure;

public class PrintBinaryTree {
	TreeNode root;

	PrintBinaryTree() {
		root = null;
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(TreeNode node) {
		if (node == null)
			return;

		printPostorder(node.left);

		printPostorder(node.right);

		System.out.print(node.val + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(TreeNode node) {
		if (node == null)
			return;

		printInorder(node.left);

		System.out.print(node.val + " ");

		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.val + " ");

		printPreorder(node.left);

		printPreorder(node.right);
	}
}
