package leetcode;
/*回文*/
public class huiwenshu {
   static public boolean isPalindrome(int x) {
       if(x<0)return false;
       else {
           String s=String.valueOf(x);
           int left=0;
           int right=s.length()-1;
           while(left<right)
           {
               if(s.charAt(left)!=s.charAt(right))
                   return false;
               left++;
               right--;
           }
           return true;
       }
    }

    public static void main(String[] args) {
           System.out.println(isPalindrome(12221));
    }
}
