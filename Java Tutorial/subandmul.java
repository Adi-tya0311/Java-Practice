public class subandmul {
    public static void main(String[] args) {
        /*1281. Subtract the Product and Sum of Digits of an Integer
        Given an integer number n, return the difference between the product of its digits and the sum of its digits.

        Example 1:
        Input: n = 234
        Output: 15 
        Explanation: 
        Product of digits = 2 * 3 * 4 = 24 
        Sum of digits = 2 + 3 + 4 = 9 
        Result = 24 - 9 = 15

        Example 2:
        Input: n = 4421
        Output: 21
        Explanation: 
        Product of digits = 4 * 4 * 2 * 1 = 32 
        Sum of digits = 4 + 4 + 2 + 1 = 11 
        Result = 32 - 11 = 21 */

        int sum=0;
        int temp =0;
        int n = 234;
        int m = n;
        while(n>0){
            temp = n%10;
            sum = sum + temp;
            n=n/10;
        }System.out.println(sum);
        System.out.println(n);

        int prod=1;
        int tem=1;
        while(m>0){
            tem = m%10;
            prod = prod * tem;
            m=m/10;
        }System.out.println(prod);

        System.out.println(prod-sum);

    }
}
