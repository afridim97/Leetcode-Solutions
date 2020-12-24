class Solution {
    public boolean isPalindrome(int x) {
        
        int a=x;
        
        /*if(x<0){
            
            a=0-x;
        }*/
        
        int rev=0;
        
        while(a>0){
            
          rev=rev*10+a%10;
            
            a=a/10;
        }
        
        /*if(x<0){
            
            rev=0-rev;
        }*/
        
        if(rev==x){
        
            return true;
        }
        
        else{
        //ystem.out.println(x);
            return false;
        }
    }
}
