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
    int ans=0;
    int tlevel=-1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    void dfs(TreeNode node,int level){
        if(node==null) return;
        if(level>tlevel){
            ans=node.val;
            tlevel=level;
        }
        dfs(node.left,level+1);
        dfs(node.right,level+1);
    }
}