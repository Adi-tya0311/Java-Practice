public class jarray2 {
    public static void main(String[] args) {
        // String str0 = "My name is adi";
        // String a[] = str0.split("");
        // for(String s:a){
        //     System.out.println(s);
        // }
        // String ans = "";
        // for(String s:a){
        //     String temp = s.substring(0,1).toUpperCase();
        //     String temp1 = s.substring(1)+" ";
        //     ans = ans+ temp+temp1;
        // }System.out.println(ans);

        String stu[]={"adi","melon","musk","desai"};
        int maxVowels = 0;
        String maxString = "";
        for(int i=0;i<stu.length;i++){
            int counter =0;
            for(int j=0;j<stu[i].length();j++){
                char ch = stu[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    counter++;
                }
            }
            System.out.println(stu[i]+" number of vowels: "+counter);
            if(counter > maxVowels){
                maxVowels = counter;
                maxString = stu[i];
            }else if(counter == maxVowels){         //Remove vowel from desai to print this
                maxString = maxString +", "+stu[i];
            }
        }
        System.out.println("String with maximum vowels: "+maxString);
        System.out.println("Maximum vowel count: "+maxVowels);
    }
}
