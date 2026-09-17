public class regex0 {
    public static void main(String[] args){
        //String started
        String name="One";
        System.out.println(name);
        System.out.println(System.identityHashCode(name));
        name = name.concat("Args");
        System.out.println(name);
        System.out.println(System.identityHashCode(name));

        //New memory address is created for every updated String,
        //gpt told me simply- name just stopped referring to [One] and changed its connection to [OneArgs]

        int num[] = {1,2,3,4};
        System.out.println(System.identityHashCode(num));
        num[1]=20;
        System.out.println(System.identityHashCode(num));

        //char mutable or not- char is mutable but object is not, so we cannot test it, as everytime we check, we have to go for object
        String s1 = "Hello";
        String s2 = "Hell";
        System.out.println(s1==s2);
        //String constant pool- A memory area which checks for same contents of memory, if found then two different objects are given same address
        //it checks whether s1 and s2 refer to the same object 
        s1.equals(s2);

        String s3 = new String("Hellooo"); //After creating string using new keyword, every content is saved in new memory
        String s4 = new String("Hello");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        //compareTO method- has a > sign, it compares length of content
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

    }
}