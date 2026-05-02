/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
         List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();

        stk1.push(root);

        while(!stk1.isEmpty()){

            Node curr = stk1.pop();
            stk2.push(curr);

            for(Node child : curr.children){
                if(child != null){
                    stk1.push(child);
                }
            }
        }

        while(!stk2.isEmpty()){
            res.add(stk2.pop().val);
        }

        return res;
        
    }
}