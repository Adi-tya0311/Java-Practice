public class jarray1 {
    public static void main(String[] args){
        int a[] ={1,2,3,1,2,5,1,5,1,2,5,1}; //find frequency of unique elements
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int element=0;
        int element2=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c==0){
                for(int k=0;k<a.length;k++){
                    if(a[k]==a[i]){
                        c++;
                    }
                }System.out.println(a[i]+" : "+c);
                if(max < c){
                    max = c;
                    element = a[i];
                }
                if(min > c){
                    min = c;
                    element2 = a[i];
                }
            }
        }System.out.println("Max: "+element+" "+max);
        System.out.println("Min: "+element2+" "+min);
    }
}
