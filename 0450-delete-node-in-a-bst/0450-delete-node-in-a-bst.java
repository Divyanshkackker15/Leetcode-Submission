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
   
     public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null) return null;

        TreeNode[] arr = searchNode(root, key);

        if(arr == null){
            return root;   // same as "not present"
        }

        TreeNode par = arr[0];
        TreeNode child = arr[1];

        // CASE: 2 children
        if(child.left != null && child.right != null){

            TreeNode succ = child.right;
            TreeNode parentSucc = child;

            while(succ.left != null){
                parentSucc = succ;
                succ = succ.left;
            }

            child.val = succ.val;

            // now delete successor
            child = succ;
            par = parentSucc;
        }

        // CASE: leaf
        if(child.left == null && child.right == null){

            if(par == null){
                return null;   // deleting root
            }
            else if(child == par.left){
                par.left = null;
            }
            else{
                par.right = null;
            }
        }

        // CASE: one child (left)
        else if(child.left != null){

            if(par == null){
                return child.left;
            }
            else if(child == par.left){
                par.left = child.left;
            }
            else{
                par.right = child.left;
            }
        }

        // CASE: one child (right)
        else{

            if(par == null){
                return child.right;
            }
            else if(child == par.left){
                par.left = child.right;
            }
            else{
                par.right = child.right;
            }
        }

        return root;   // ✅ IMPORTANT
    }

    public TreeNode[] searchNode(TreeNode root, int x){

        TreeNode curr = root;
        TreeNode par = null;

        while(curr != null){

            if(curr.val == x){
                return new TreeNode[]{par, curr};
            }

            par = curr;

            if(x > curr.val){
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        return null;
    }
}