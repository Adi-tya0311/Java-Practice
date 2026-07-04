public class recursion{
    static int recur(int x){
        if(x>0){
            return x+recur(x-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int result = recur(10);
            System.out.println(result);
    }

}