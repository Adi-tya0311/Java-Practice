//Im solving patterns which i found difficult at the moment
public class patternpractice1{
    public static void main(String[] args) {
        for(int i=69;i>=65;i--){
            for(char j=65;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        /*O/p- 
        ABCDE
        ABCD
        ABC
        AB
        A
        */

        //diamond shape
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int space=i;space<=4;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
