package com.LeetCode;


 // Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class SearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root!=null)
         {
             if(root.val==val)
             {
                 System.out.println("bef "+root.val);
                 System.out.println("bef root :"+root.left.val);
                 return root;
                // System.out.print("after "+root.val);
             }
             else if(root.val>val)
               return  searchBST(root.left,val);
             else
               return  searchBST(root.right,val);
}
        return null;
    }

    public static void main(String[] args) {
        
        
        TreeNode trr=new TreeNode(5);
        TreeNode trl1=new TreeNode(1);
        TreeNode trlr1=new TreeNode(3);
        TreeNode trl=new TreeNode(2,trl1,trlr1);

        TreeNode tr=new TreeNode(4,trl,trr);
System.out.println(new SearchTree().searchBST(tr,2));
        
    }
        
    }
     