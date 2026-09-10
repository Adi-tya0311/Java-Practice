public class multidim4 {
    public static void main(String[] args) {
        //Jagged Array- Array with uneven rows of elements
        int a[][] ={{1,2,3},{1,2},{1,2,3,4}};
        //can also be declared like this
        // int a[][] = new int[][]{
        //     new int[] {1,2,3},
        //     new int[] {1,2},
        //     new int[] {1,2,3,4}
        // };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){         //To print all arrays as it is, we have to use a[i].length,
                System.out.print(a[i][j]+" ");      //if not then a.length will mean to consider the length of first array only.
            }
            System.out.println();
        }

        String b[][] = {{"A","B","C"},{"A","B"},{"A","B","C","D"}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}


