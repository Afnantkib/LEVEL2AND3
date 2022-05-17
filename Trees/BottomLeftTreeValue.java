/*****513. Find Bottom Left Tree Value*******/
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        
        Stack<TreeNode> st=new Stack<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
int s=q.size();
            for(int i=1;i<=s;i++){
TreeNode temp=q.remove();
      st.push(temp);
                if(temp.right!=null){
q.add(temp.right);
                }
                if(temp.left!=null){
q.add(temp.left);
                }
                
                
                
            }
        
        
        
        
        }
        
        
        
        
        return st.pop().val;
        
        
        
        
        
        
        
        
    }
}