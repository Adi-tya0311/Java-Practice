public class multidim3{
    public static void main(String[] args) {
        //Conversion from 2D array to 1D array
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[] = new int[a.length*a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                b[index] = a[i][j];         //Whenver value is stored in index it is stored as a[0][0] =1, a[0][1]=2
                // System.out.println("B index: "+b[index]);
                index++;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("B array: ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+" "+i);
        }
    }
}
