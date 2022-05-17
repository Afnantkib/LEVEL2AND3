/*987. Vertical Order Traversal of a Binary Tree*/
class Solution {
    public static class Pair implements Comparable<Pair>{
     TreeNode node;
        int v;
        int h;
        Pair(TreeNode node,int h,int v){
            this.node=node;
            this.v=v;
            this.h=h;
        }
        public int compareTo(Pair o){
         if(this.v==o.v){
                return this.node.val-o.node.val;
         }   else{
             
             return this.v-o.v;
         }
                    
        }
        
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,PriorityQueue<Pair>> hmap=new HashMap<>();
   
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(root,0,1));
        
        int lmh=0;
        int rmh=0;
        
        while(q.size()>0){
Pair temp=q.remove();
  if(!hmap.containsKey(temp.h)){
hmap.put(temp.h,new PriorityQueue<>());
hmap.get(temp.h).add(temp);      
  }else{
      hmap.get(temp.h).add(temp);
  }
     if(temp.h<lmh){
lmh=temp.h;
     }
            if(temp.h>rmh){
rmh=temp.h;
            }
            
            
            
       if(temp.node.left!=null){
           
q.add(new Pair(temp.node.left,temp.h-1,temp.v+1));
       }    
             if(temp.node.right!=null){
           
q.add(new Pair(temp.node.right,temp.h+1,temp.v+1));
       }    
            
        
        
        
        
        
        }
        
        for(int w=lmh;w<=rmh;w++){
ArrayList<Integer> ans=new ArrayList<>();
PriorityQueue<Pair> p=hmap.get(w);
       while(p.size()>0) {
Pair pp=p.remove();
           ans.add(pp.node.val);
       
       }    
        list.add(ans);    
            
            
        }
        
        return list;
        
        
        
    }
}