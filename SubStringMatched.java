public class SubStringMatched {

    public int strStr(String haystack, String needle) {

        int n=haystack.length();
        int m=needle.length();
 
         if(needle.isEmpty()){
             return 0;
         }
 
        for(int i=0;i<n-m;i++){
 
             int j=0;
             while(j<m && haystack.charAt(i+j)==needle.charAt(j)){
                 j++;
             }
             if(j==m){
                 return i;
             }
         }
         return -1;
     }

     public static void main(String[]args){
        SubStringMatched s=new SubStringMatched();
        System.out.println(s.strStr("hello","lol"));
     }
     
}
