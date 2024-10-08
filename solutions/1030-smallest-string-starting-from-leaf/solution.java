/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder smallest = new StringBuilder();
        smallestFromLeaf(root, new StringBuilder(), smallest);
        return smallest.toString();
    }
    private void smallestFromLeaf(TreeNode node, StringBuilder path, StringBuilder smallest) {
        if (node == null) return;
        path.append((char)('a'+ node.val));
        if (node.left == null && node.right == null) {
            String currentString = path.reverse().toString();
            if (smallest.length() == 0 || currentString.compareTo(smallest.toString()) < 0) {
                smallest.setLength(0);
                smallest.append(currentString);
            }
            path.reverse();
        }
        smallestFromLeaf(node.left, path, smallest);
        smallestFromLeaf(node.right, path, smallest);
        path.setLength(path.length()-1);

        
    }
}
