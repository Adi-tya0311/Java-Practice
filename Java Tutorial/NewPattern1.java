public class NewPattern1 {
    public static void main(String[] args){

        //00000
        //11111
        //00000
        //11111 Pattern

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        //10101
        //10101
        //10101
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j%2==0){
        //             System.out.print("0");
        //         }
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        //10101
        //01010
        //10101
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        //0
        //01
        //010
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        //1
        //10
        //101
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j%2==0){
        //             System.out.print("0");
        //         }
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Patern
        //1
        //01
        //101
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        //10000
        //01000
        //00100
        //00010
        //00001
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==j){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }


        //Pattern
        //10001
        //01010
        //00100
        //01010
        //10001
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if((i==j) || (j==6-i)){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern
        
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5;j++){
        //         if((i==j)||(j==6-i)){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print("-");
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern 109
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print("1");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }


    }
}
