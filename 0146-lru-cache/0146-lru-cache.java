class LRUCache {

     int capacity;
    HashMap<Integer,Integer> cmap;
    LinkedList<Integer> llist;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cmap=new HashMap<>();
        this.llist=new LinkedList<>();
    }
    
    public int get(int key) {
        if(!cmap.containsKey(key)){
            return -1;
        }
        llist.remove(Integer.valueOf(key));
        llist.addFirst(key);
        return cmap.get(key);
    }
    
    public void put(int key, int value) {
        if(cmap.containsKey(key)){
            cmap.put(key,value);
            llist.remove(Integer.valueOf(key));
        }
        else{
           if(cmap.size()>=capacity){
             int latest=llist.removeLast();
             cmap.remove(latest);
           }
           cmap.put(key,value);
        }
        llist.addFirst(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */