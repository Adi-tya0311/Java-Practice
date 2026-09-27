public class charString{
    public static void main(String[] args){
        String str = "programming mg";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 0) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}