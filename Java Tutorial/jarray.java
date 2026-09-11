public class jarray {
    public static void main(String[] args){
        int a[] = {11,7,22,7,33,7,7};
        int index =0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=7){
                a[index]=a[i];
                index++;
            }
        }
        for(int i=index;i<a.length;i++){
            if(a[i]!=7){
                a[i]=7;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
