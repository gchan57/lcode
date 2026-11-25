class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new LinkedList<>();
        if(root==null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> in=new LinkedList<>();
            int l=q.size();
        for(int i=0;i<l;i++){
            
            TreeNode n=q.poll();
            in.add(n.val);
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        res.add(in);
    }
    return res;
    }       
}