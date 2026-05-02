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
   public List<Integer> postorderTraversal(TreeNode Root) {

        List<Integer> res = new ArrayList<>();

        if(Root == null) return res;

        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();

        stk1.push(Root);

        while(!stk1.isEmpty()){

            TreeNode root = stk1.pop();
            stk2.push(root);   // ✅ push into stk2

            if(root.left != null) stk1.push(root.left);
            if(root.right != null) stk1.push(root.right);
        }

        while(!stk2.isEmpty()){
            res.add(stk2.pop().val);   // ✅ store result
        }

        return res;
    }
}