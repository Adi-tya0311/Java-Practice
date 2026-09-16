public class array3d2 {
    public static void main(String[] args) {
        int a[][][] = {{{1,3,4},{5,6,7,8},{11,2,33}},{{11,3,4},{7,8},{44,2}}};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                    if(min>a[i][j][k]){
                        min=a[i][j][k];
                    }
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("MIN: "+min);
    }
}