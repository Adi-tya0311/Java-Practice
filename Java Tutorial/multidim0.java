public class multidim0 {
    public static void main(String[] args){
        int a[][]={{1,2,3},{2,3,4},{3,4,5}};
        int b[][]=new int[a.length][a.length];
        for (int i=0;i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                b[i][j] = a[i][j];
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        //find sum of even num
        //find sum of odd num
        int evesum=0;
        int oddsum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]%2==0){
                    evesum = evesum + a[i][j];
                }else{
                    oddsum = oddsum + a[i][j];
                }
            }
        }System.out.println("Even Sum = "+evesum);
        System.out.println("Odd Sum = "+oddsum);
    }
}

