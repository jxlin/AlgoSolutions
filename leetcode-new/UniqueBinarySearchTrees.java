/*
Given n, how many structurally unique BST's (binary search trees) that store 
values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += numTrees(i) + numTrees(n - 1 - i);
        }
        return result;
    }

}
