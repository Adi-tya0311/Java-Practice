public class binaryconv {
    public static void main(String[] args) {
        int num = 20;
        System.out.println("Binary conversion: "+Integer.toBinaryString(num));

        int num2 = 1010;
        String num3 = Integer.toString(num2);
        System.out.println("Integer conversion: "+Integer.parseInt(num3,2));
    }
}
