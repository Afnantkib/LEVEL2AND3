//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#
public static class Pair{
    Node node;
    int idx;
    Pair(Node node,int idx){
        this.node=node;
        this.idx=idx;
    }
    
}
static ArrayList<Integer> bottomView(Node root)
{
    // add your code
    Pair rp=new Pair(root,0);
    Queue<Pair> q=new ArrayDeque<>();
    HashMap<Integer,Integer> hmap=new HashMap<>();
    q.add(rp);
    while(q.size()>0){
        int s=q.size();
        for(int i=1;i<=s;i++){
        Pair temp=q.remove();
        Node tempn=temp.node;
        int idx=temp.idx;
        
            hmap.put(idx,tempn.data);
        if(tempn.left!=null){
            Pair p=new Pair(tempn.left,idx-1);
            q.add(p);
        }
         if(tempn.right!=null){
            Pair p=new Pair(tempn.right,idx+1);
            q.add(p);
        }
        
        
        
            
        }
        
        
        
        
    }
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int key:hmap.keySet()){
        if(key<min){
            min=key;
        }
        if(key>max){
            max=key;
        }
    }
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=min;i<=max;i++){
        list.add(hmap.get(i));
    }
    
    
    
    return list;
    
    
}