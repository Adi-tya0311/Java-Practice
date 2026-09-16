public class array3d {
    public static void main(String[] args) {
        // 1D array -> 2D array -> 3D array 
        int d[] = {1,2,3,4};    //1D array
        int a1[] = {5,6,7,8};
        int a2[] = {1,2,3,4};
        int b[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};    //2D array
        int c[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};

        int a[][][] = {{{1,3,4},{5,6,7,8},{11,2,33}},{{11,3,4},{7,8},{44,2}}}; //3D array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                int sum = 0;
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                    sum = sum + a[i][j][k];
                }
                System.out.println(" : "+sum);
            }
            System.out.println(" ");
        }

        System.out.println(a[0][2][0]);
        System.out.println(a[0][2][2]);
        System.out.println(a[1][2][0]);



        
    }
}
