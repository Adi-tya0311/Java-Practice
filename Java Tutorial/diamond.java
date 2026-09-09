public class diamond {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        for(int i=4;i>=1;i--){
            for(int space=i;space<=4;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

}
