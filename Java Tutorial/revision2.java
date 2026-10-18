public class revision2 {
    public static void main(String[] args) {
        //Revision practice and annotations
        int a[] = {1,2,2,3,4,5,3};
        //distinct nos-> 1,2,3,4,5
        //unique nos-> 1,2,4

        System.out.println("Distinct numbers: ");
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c==0){
                System.out.println(a[i]);
            }
        }

        System.out.println("Unique NUmbers: ");
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println(a[i]);
            }
        }
    }
}
