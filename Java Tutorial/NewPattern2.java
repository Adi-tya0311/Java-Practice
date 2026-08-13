public class NewPattern2 {
    public static void main(String[] args){
        
        //Patterns continuation
        //recap practice for A to E in down 1 to 5 format
        // for(int i='A';i<='E';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //for printing i we have to put char i instead of int i
        // for(char i='A';i<='E';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }

        //pattern 27
        // for(char i='A';i<='E';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for(char i='D';i>='A';i--){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }

        //Pattern 28
        // for(int i='A';i<='E';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for(int i='D';i>='A';i--){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern 29
        // for(char i='F';i>='A';i--){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for(char i='B';i<='F';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern 30
        // for(char i='A';i<='F';i++){
        //     for(char j='F';j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for(char i='E';i>='A';i--){
        //     for(char j='F';j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }


        //Pattern 35
        // char ch = 'A';
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch++);
        //     }
        //     System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch++);
        //     }
        //     System.out.println();
        // }


        //Pattern 31
        // for(int i='A';i<='F';i++){
        //     for(int space=69;space>=i;space--){
        //         System.out.print(" ");
        //     }
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }
        // //teacher's method
        // for(int i=1;i<=5;i++){
        //     char ch='A';
        //     for(int space=4;space>=i;space--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print((ch++)+" ");
        //     }
        //     System.out.println("");
        // }

        //Pattern 32
        // for(int i='A';i<='F';i++){
        //     for(char j='F';j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern 33
        // for(int i='F';i>='A';i--){
        //     for(char j='F';j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern 34
        // for(int i='E';i>='A';i--){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern 35
        // char ch = 'A';
        // for(int i=1;i<=6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch+=5);
        //     }
        //     System.out.println("");
        // }


        //Pattern 37
        char c = 'A';
        for (int i = 1; i <= 6; i++) {
            char temp = c;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp += 5;
            }
            System.out.println();
            c++;
        }


    }
}
