package datastructure;

import java.util.List;

public class ConvertToBST {

	// Convert Array to Binary Search Tree
	public TreeNode convertToBST(int left, int right, int[] nums) {

		if (left > right) {
			return null;
		}

		int mid = (left + right) / 2;

		TreeNode node = new TreeNode(nums[mid]);

		if (left == right) {
			return node;
		}

		node.left = convertToBST(left, mid - 1, nums);
		node.right = convertToBST(mid + 1, right, nums);

		return node;
	}

	// Convert List to Binary Search Tree
	public TreeNode convertToBST(int left, int right, List<Integer> values) {

		if (left > right) {
			return null;
		}

		int mid = (left + right) / 2;
		TreeNode node = new TreeNode(values.get(mid));

		if (left == right) {
			return node;
		}

		node.left = convertToBST(left, mid - 1, values);
		node.right = convertToBST(mid + 1, right, values);

		return node;

	}
}
