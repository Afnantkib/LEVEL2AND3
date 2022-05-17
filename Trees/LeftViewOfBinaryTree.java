ArrayList<Integer> leftView(Node root)
{

  ArrayList<Integer> list=new ArrayList<>();
  if(root==null){
      return list;
  }
  Queue<Node> queue=new ArrayDeque<>();
  queue.add(root);
  while(queue.size()>0){
      int s=queue.size();
      for(int i=1;i<=s;i++){
          Node temp=queue.remove();
          if(i==1){
              list.add(temp.data);
          }
          if(temp.left!=null){
              //add left child first
              queue.add(temp.left);
          }
          if(temp.right!=null){
              queue.add(temp.right);
          }
          
          
      }
      
  }
  
  return list;
  
  
}