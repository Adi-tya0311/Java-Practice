import java.util.Arrays;
public class revstringlc {
    public static void main(String[] args) {
        /*344. Reverse String
        Write a function that reverses a string. The input string is given as an array of characters s.
        You must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]

        Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"] */

        String s[] = {"h","e","l","l","o"};
        int left = 0;
        int right = s.length-1;

        while(left<right){
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }

        System.out.println(Arrays.toString(s));

        /*Alternate Solution: 
        class Solution {
            public void reverseString(char[] s) {
                int l = s.length;
                for(int i = 0 ; i<l/2 ; i++){
                    char temp = s[i];
                    s[i] = s[l-1-i];
                    s[l-1-i] = temp;
                }
                
            }
        }
        */
    }
}
