public ArrayList<Integer> reverseLevelOrder(Node node) 
{
    // code here

Queue<Node> queue=new ArrayDeque<>();
Stack<Integer> st=new Stack<>();
queue.add(node);
while(queue.size()>0){
    Node temp=queue.remove();
    st.push(temp.data);
   
    if(temp.right!=null){
        queue.add(temp.right);
    }
    if(temp.left!=null){
        queue.add(temp.left);
    }    
        
        
        
    
    
    
    
    
}
    ArrayList<Integer> list=new ArrayList<>();
 while(st.size()>0){
   list.add(st.pop());
     
     
 }
   
    
    
    
    return list;
    
    
}