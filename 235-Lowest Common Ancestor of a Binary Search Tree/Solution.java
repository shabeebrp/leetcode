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
        if(q.val<p.val)
            return helper(root,q,p);
        return helper(root,p,q);
        
        
    }
    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
        if(p.val<=root.val && q.val>=root.val)
            return root;
        if(q.val<root.val)
            return helper(root.left,p,q);
        else 
            return helper(root.right,p,q);
    }
}
