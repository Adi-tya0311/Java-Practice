public class NewPattern{
    public static void main(String[] args){
        //Basic star pattern 1* to 5*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Basic 5* to 1*
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Basic wall of stars
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=4;i++){
            for(int space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=5;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //9) pyramid making with gap in between
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //10 Pyramid upside down
        for(int i=5;i>=1;i--){
            for(int space=5;space>i;space--){
                System.out.print(" ");           //give space here you idiot
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //11) Upside down Pyramid with multiple * 
        for(int i=5;i>=1;i--){
            for(int space=4;space>=i;space--){
                System.out.print(" "); //give space here
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //12) Pyramid with multiple *
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //21)       ****
        //         ****
        //        ****

        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // //22) Same from above but from other direction

        for(int i=1;i<=5;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //23) Combine both and print from other side
        for(int i=1;i<=5;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        //??) Printing only borders of earlier pattern

        for(int i=1;i<=5;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if(i == 1 || i == 5 || j == 1 || j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}