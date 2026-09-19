public class patterns1 {
    public static void main(String[] args) {
        //Pattern 109
        // for(int i=1;i<=5;i++){
        //     for(int space=4;space>=i;space--){
        //         System.out.print("1");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }//Yesterday's problem taught again


        //Pattern 110 -answer
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(5 - i + j);
        //     }
        //     for (int j = i; j <= 5; j++) {
        //         System.out.print(5);
        //     }
        //     System.out.println();
        // }

        // for(int i=5;i>=1;i--)
        //     for(int space=i;space<5;space++){
        //         System.out.print(space);
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("5");
        //     }
        //     System.out.println();
        // }

        //Pattern 111
        // for(int i=5;i>=1;i--){                  //5>=1 4>=1 3>=1 2>=1 1>=1 0!>=1
        //     for(int space=5;space>=i;space--){  //5>=5 4>=4 3!>=4 
        //         System.out.print(space);
        //     }
        //     for(int j=1;j<i;j++){               //1<5 2<5 3<5 4<5
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }

        // for(int i=5;i>=1;i--){
        //     for(int space=5;space>=i;space--){
        //         System.out.print(space);
        //     }
        //     for(int j=1; j<=i;j++){
        //         System.out.print(5);
        //     }
        //     System.out.println("");
        // }

        //practice patterns
        // for(int i=1;i<=5;i++){
        //     for(int space=i;space<=5;space++){
        //         System.out.print(space);
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        for(int i=1;i<=1;i++){
            for(int space=5;space>=i;space--){
                System.out.print(space);
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
