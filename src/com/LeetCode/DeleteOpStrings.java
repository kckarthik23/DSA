package com.LeetCode;

public class DeleteOpStrings  {
   
    public int minDistance(String word1, String word2) {
         int dparr[][]=new int[word1.length()+1][word2.length()+1];
       // Queue<Character> q=new LinkedList<>();
        
   int m=word1.length()-1;
        int n=word2.length()-1;
         //word1.length()+word2.length()-
          return  lcs(word1,word2,m,n,dparr);
    }
   int  lcs(String word1,String word2,int m,int n,int [][] dparr)
   {
       if(m<0||n<0)
       {
           
           return 0;
       }
       if(dparr[m][n]>0)return dparr[m][n];
       
       if(word1.charAt(m)==word2.charAt(n))
           dparr[m][n]=1+lcs(word1,word2,m-1,n-1,dparr);
       else
           dparr[m][n]=Math.max(lcs(word1,word2,m,n-1,dparr),lcs(word1,word2,m-1,n,dparr));
       
       return dparr[m][n];
   }

   public static void main(String[] args) {
       System.out.println(new DeleteOpStrings().minDistance("gctztnfwruxxviwdguh", "ljvisqlfktmmhmomysvyrhocwojrrvxw"));
   }
}

