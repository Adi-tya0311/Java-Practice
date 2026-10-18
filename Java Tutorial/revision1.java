public class revision1{
    public static void main(String[] args){
        /*Complete the missing code to find the largest number in an array.
    int[] a = {12, 45, 7, 89, 34};
    int max = ______(1)______;
    for (int i = ______(2)______;
    i < ______(3)______; i++) {
    if (a[i] ______(4)______ max) {
    max = ______(5)______;
    }
    }
    System.out.println("Largest: " + max);

        Expected output:
        Largest: 89 */
        int a[] = {12,45,7,89,34};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }System.out.println("Largest: "+max);

        /*Print each number only once, even if it occurs multiple times.

    int[] a = {10, 20, 10, 30, 20, 40};
    for (int i = 0; i < ______(1)______; i++) {
    boolean found = ______(2)______;
    for (int j = 0; j < ______(3)______; j++) {
    if (i != j && a[i] ______(4)______ a[j]
    && j < i) {
    found = true;
    break;
    }
    }
    if (______(5)______) {
    System.out.print(a[i] + " ");

        Expected output:
        10 20 30 40 */

        //Answer-> -> -> -> -> ->
        // int b[] ={10,20,10,30,20,40};
        // for(int i=0;i<b.length;i++){
        //     boolean found = false;
        //     for(int j=0;j<i;j++){
        //         if(b[i] == b[j]){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         System.out.print(b[i]+" ");
        //     }
        // }

        /*Q3. Find the Second-Largest Distinct Element
            Objective: Test initialization, comparison, and conditional updates.
            class SecondLargest {
                public static void main(String[] args) {
                int[] a = {10, 50, 30, 50, 40};
                int largest = ______(1)______;
                int second = ______(2)______;
                for (int i = 0; i < a.length; i++) {
                if (a[i] > largest) {
                second = ______(3)______;
                largest = ______(4)______;
                } else if (a[i] < largest && a[i] > second) {
                second = ______(5)______;
                }
                }
                System.out.println("Second largest: " + second);
                }
            }
            Expected output:
            Second largest: 40
            */

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int[] c = {10, 50, 30, 50, 40};
        for(int i=0;i<c.length;i++){
            int counter = 0;
            for(int j=0;j<c.length;j++){
                if(i != j && c[i]==c[j]){
                    counter++;
                }
            }
            if(counter==0){
                if (c[i] > largest) {
                    secondLargest = largest;
                    largest = c[i];
                } else if (c[i] > secondLargest && c[i] < largest) {
                    secondLargest = c[i];
                }
            }
        }
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest distinct element: " + secondLargest);
        } else {
            System.out.println("No second largest distinct element.");
        }

        /*Q4. Reverse an Array Without Using Another Array
            Objective: Test two-pointer logic and swapping.
            class ReverseArray {
            public static void main(String[] args) {
            int[] a = {10, 20, 30, 40, 50};
            int start = ______(1)______;
            int end = ______(2)______;
            while (start ______(3)______ end) {
            int temp = a[start];
            a[start] = ______(4)______;
            a[end] = ______(5)______;
            start++;
            end--;
            }
            for (int n : a) {
            System.out.print(n + " ");
            }
            }
            }

            Expected output:
            50 40 30 20 10
 */

        int[] d = {10, 20, 30, 40, 50};
        for(int i=d.length-1;i>=0;i--){
            System.out.println(d[i]);
        }

        /*
        Q5. Count Even and Odd Numbers
            Objective: Test the modulus operator and conditional counting.
            class EvenOddCount {
            public static void main(String[] args) {
            int[] a = {11, 20, 35, 42, 56, 71};
            int even = 0, odd = 0;
            for (int i = 0; i < ______(1)______; i++) {
            if (a[i] % ______(2)______ == 0) {
            even = ______(3)______;
            } else {
            odd = ______(4)______;
            }
            }
            System.out.println("Even: " + even);
            System.out.println("Odd: " + ______(5)______);
            }
            }
            Expected output:
            Even: 3
            Odd: 3 */

            int[] e = {11, 20, 35, 42, 56, 71};
            int even=0;
            int odd=0;
            for(int i=0;i<e.length;i++){
                if(e[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }System.out.println("Total number of even: "+even+"\nTotal number of odd: "+odd);

            /*Section B: String Programming (Questions 6–10)
            Q6. Check Whether a String Is a Palindrome
            Objective: Test String indexing and character comparison.
            A palindrome reads the same forward and backward.
            class Palindrome {
            public static void main(String[] args) {
            String s = "madam";
            boolean palindrome = true;
            for (int i = 0; i < ______(1)______; i++) {
            if (s.charAt(i) != s.charAt(______(2)______ - i - 1)) {
            palindrome = ______(3)______;
            break;
            }
            }
            if (______(4)______) {
            System.out.println("Palindrome");
            } else {
            System.out.println("Not Palindrome");
            }
            }
            }
            Expected output:
            Palindrome */

            String s = "madam";
            String rev ="";
            for(int i=s.length()-1;i>=0;i--){
                rev = rev + s.charAt(i);
            }
            if(s.equals(rev)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not palindrome");
            }

        /*Q7. Count Vowels in a String
            Objective: Test character conversion and logical conditions.
            Count vowels in both uppercase and lowercase letters.
            class CountVowels {
            public static void main(String[] args) {
            String s = "Education";
            int count = 0;
            for (int i = 0; i < ______(1)______; i++) {
            char ch = Character.______(2)______(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            count = ______(3)______;
            }
            }
            System.out.println("Vowels: " + ______(4)______);
            }
            }
            Expected output:
            Vowels: 5 */

        String str = "Education";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a'|| ch== 'e' || ch=='o'|| ch =='u'){
                count++;
            }
        }System.out.println(count);
    }
}