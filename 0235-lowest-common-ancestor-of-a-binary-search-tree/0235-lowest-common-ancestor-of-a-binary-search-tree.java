/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            //case 1
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            //case 2
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            //case 3
            else
                return root;
            }
    }
}