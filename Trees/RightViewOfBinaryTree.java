/******  LEETCODE  *****/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> list=new ArrayList<>();
      if(root==null){
          return list;
      }
      Queue<TreeNode> queue=new ArrayDeque<>();
      queue.add(root);
      while(queue.size()>0){
          int s=queue.size();
          for(int i=1;i<=s;i++){
              TreeNode temp=queue.remove();
              if(i==1){
                  list.add(temp.val);
              }
              if(temp.right!=null){
                  //add right child first
                  queue.add(temp.right);
              }
              if(temp.left!=null){
                  queue.add(temp.left);
              }
              
              
          }
        
          
      }
      
      
      
      return list;
      
    }
}