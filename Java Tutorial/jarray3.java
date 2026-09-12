public class jarray3 {
    public static void main(String[] args) {
        String a[] ={"aaa","bbb","ccc"};
        String b[] ={"ddd","eee","fff"};
        String result[] = new String[a.length+b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            result[index++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            result[index++]=b[i];
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
