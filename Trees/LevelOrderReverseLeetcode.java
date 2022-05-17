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

 //****************   Leetcode 107   *****************/
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
       List<List<Integer>> list=new ArrayList<>();
        if(root==null){
return list;
        }
        List<Integer> ans=new ArrayList<>();
        Stack<List<Integer>> st=new Stack<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(queue.size()>0){
            int s=queue.size();
            for(int i=1;i<=s;i++){

TreeNode temp=queue.remove();
              ans.add(temp.val);
                  if(temp.left!=null){
queue.add(temp.left);
                }
                if(temp.right!=null){
queue.add(temp.right);
                }
                
                
            }
        st.push(ans);
        ans=new ArrayList<>();
        
        
        }
        
        
        while(st.size()>0){
list.add(st.pop());
        
        
        
        }
        
        
        
        
        return list;
        
        
        
    }
}