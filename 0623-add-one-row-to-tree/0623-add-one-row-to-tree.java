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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1) return new TreeNode(val,root,null);
        dfs(root,1,val,depth);
        return root;
    }
    void dfs(TreeNode node,int curr,int val,int target){
        if(node==null) return;
        if(curr==target-1){
            node.left = new TreeNode(val,node.left,null);
            node.right = new TreeNode(val,null,node.right);
        }
        else{
            dfs(node.left,curr+1,val,target);
            dfs(node.right,curr+1,val,target);
        }
    }
}