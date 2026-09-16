public class array3d1 {
    public static void main(String[] args) {
        //max element
        int a[][][] = {{{1,3,4},{5,6,7,8},{11,2,33}},{{11,3,4},{7,8},{44,2}}}; //3D array
        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                    if(max<a[i][j][k]){
                        max = a[i][j][k];
                    }
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Max: "+max);
    }
}
