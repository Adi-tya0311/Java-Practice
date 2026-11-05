import java.util.Vector;
public class vector2 {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();
        System.out.println("Initial vector size: "+v1.size());
        v1.add(1);
        v1.add(3);
        System.out.println(v1);
        System.out.println("After add vector size: "+v1.capacity());
        v1.ensureCapacity(10);
        System.out.println(v1.add(2));
        v1.add(23);
        v1.add(24);
        v1.add(25);
        v1.add(26);
        v1.add(27);
        v1.add(28);
        v1.add(29);v1.add(99);
        System.out.println(v1);
        System.out.println(v1.capacity());
        
        
    }
}


