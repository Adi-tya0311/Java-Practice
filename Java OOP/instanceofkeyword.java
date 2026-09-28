class Morning{

}
class Afternoon extends Morning{

}
public class instanceofkeyword {
    public static void main(String[] args) {
        Morning m = new Morning();                  //instanceof is used to check whether object is related to reference
        System.out.println(m instanceof Morning);

        Afternoon a = new Afternoon();              //It also works in Parent-child relationship
        System.out.println(a instanceof Morning);   //where Child is instance of Parent
                                                    //But not the other way

        System.out.println(m instanceof Afternoon);



    }                                               
}
