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

    boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q != null) {
            return false;
        }

        if(p != null && q == null) {
            return false;
        } 

         if(p == null && q == null) {
            return true;
        } 
        
        if(p.val != q.val) {
            return false;
        } 

        isSame = isSameTree(p.left, q.left);
        if(!isSame) { return false; }
        isSame = isSameTree(p.right, q.right);
        if(!isSame) { return false; }

        return true;
    }
}