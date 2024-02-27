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
    TreeNode in=null, start=null, end=null;
    public void recoverTree(TreeNode root) {
        dfs(root);
        swap(start,end);
    }
    void dfs(TreeNode node){
        if(node==null) return ;
        dfs(node.left);
        
        if(in!=null && node.val<in.val){
            if(start==null) start=in;
            end=node;
        }
        in=node;
        dfs(node.right);
    }
    void swap(TreeNode start,TreeNode end){
        int temp=start.val;
        start.val=end.val;
        end.val=temp;
    }
}