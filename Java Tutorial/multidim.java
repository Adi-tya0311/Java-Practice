public class multidim{
    public static void main(String[] args){
    int a[][]={{1,2,3,4},{4,5,6,7},{7,8,9,9},{33,44,55,66}};    //Print diagonal elements of array
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i]==a[j]){//a[i]==a[j] also works
                System.out.print(a[i][j]+" ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i]==a[j]){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
        }
    }
}