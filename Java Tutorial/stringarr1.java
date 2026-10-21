public class stringarr1{
    public static void main(String[] args) {
        /*1480. Running Sum of 1d Array
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums.

        Example 1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        Example 2:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

        Example 3:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]*/

        int a[] = {1,2,3,4};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(i==0){
                b[i]=a[i];
            }else{
                b[i] =b[i-1] + a[i];
            }
            System.out.println(b[i]);
        }

    }
}