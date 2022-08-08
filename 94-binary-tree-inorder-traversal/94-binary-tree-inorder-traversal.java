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

   public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        find(root,result);
        return result;
    }
    public void find(TreeNode current, List<Integer> result){
        if(current == null) {
            return;
        }
        find(current.left, result);
        result.add(current.val);
        
        find(current.right, result);
    }
}