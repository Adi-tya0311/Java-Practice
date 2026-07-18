public class Attributepractice {
    final int x = 9; //After assigning final keyword, we get error msg if we try to change the value of x below.

    public static void main(String[] args){
        Attributepractice myObject = new Attributepractice();
      //myObject.x = 33; //We can override and change value of x, to stop it we can use 'final' keyword.
        System.out.println(myObject.x);
    }
}
