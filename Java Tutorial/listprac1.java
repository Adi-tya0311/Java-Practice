import java.util.ArrayList;
import java.util.List;

public class listprac1{
    public static void main(String[] args) {
        //Java Collection Start
        List<Object> data = new ArrayList<Object>();
        System.out.println(data);
        data.add(1);
        data.add("Prithvi");
        data.add(1);
        data.add(null);
        data.add(23.04f);
        System.out.println(data);
        //System.out.println(data[0]); // this works in normal array but doesnt work here
        System.out.println(data.get(2));

        //2nd method to used list
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Gir gardhan ghat");l1.add("Sattu Supari");l1.add("Sattu Supari2");
        l1.add("Gopal");
        System.out.println(l1);
        l1.remove(1); //we can remove elements by index or by name both
        l1.remove("Sattu Supari2");
        System.out.println(l1);

        //Remove all - this is global method for list
        l1.removeAll(l1);
        System.out.println("Remove All method: "+l1);
        l1.add("Gir gardhan ghat");l1.add("Sattu Supari");l1.add("Sattu Supari2");
        l1.clear(); // this method is specifically for arraylist
        System.out.println("Clear method: "+l1);

        //addAll operation- add elements of list to another list
        l1.add("Gir gardhan ghat");l1.add("Sattu Supari");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Gopal");l2.add("Vasooli Bhai");
        l2.addAll(l1);
        l1.addAll(l2);
        System.out.println("List 2: "+l2);
        System.out.println("List 1: "+l1);
    }
}
