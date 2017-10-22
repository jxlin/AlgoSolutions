/*
Given a binary search tree and a number n, find two numbers in the tree that
sums up to n.

 Notice

Without any extra space.

Example
Given a binary search tree:

    4
   / \
  2   5
 / \
1   3
and a number n = 3
return [1, 2] or [2, 1]
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class TwoSumBSTEdition {

    /*
     * @param : the root of tree
     * @param : the target sum
     * @return: two numbers from tree which sum is n
     */
    public int[] twoSum(TreeNode root, int n) {
        int[] result = new int[2];
        if (root == null || root.left == null && root.right == null) {
            return result;
        }


        return result;
    }

    public boolean binarySearch(TreeNode root, int value) {
        if (root == null) {
            return false;
        }
        if (root.val == value) {
            return true;
        }
        if (root.val < value) {
            return binarySearch(root.right, value);
        }
        return binarySearch(root.left, value);
    }

}