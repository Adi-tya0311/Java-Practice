public class regex3 {
    public static void main(String[] args) {
        //Regex cont'd

        //validate mobile number with country code
        String mobno = "+91-9330438581";
        // String pattern1 = "^[+]+[0-9]{2}+[-]+[0-9]{10}$";
        // String pattern2 = "^[\\W]+[\\d]{2}+[\\W]+[\\d]{10}$";
        // String pattern3 = "^[\\D]+[\\w]{2}+[\\D]+[\\w]{10}$";
        String pattern4 = "^[+]+[\\d]{0,3}+[-]+[\\d]{10}$";
        if(mobno.matches(pattern4)){
            System.out.println("Correct Pattern");
        }else{
            System.out.println("incorrect pattern");
        }

        String pincode = "411041";
        System.out.println(pincode.matches("\\d{6}"));

        String name = "Aditya";
        // System.out.println(name.matches("\\w+"));
        // System.out.println(name.matches("[A-Za-z]*"));
        System.out.println(name.matches("[A-Za-z]+"));

        String vehicle = "MH12AB1234";  //MH12GU7679
        System.out.println(vehicle.matches("^[A-Z]{2}+[0-9]{1,2}+[A-Z]{2}+[0-9]{1,4}$"));
        System.out.println(vehicle.matches("^[A-Z]{2}+[\\d]{1,2}+[A-Z]{2}+[\\d]{1,4}$"));

        String s1 = "I have 2 mobiles and 1 laptop";        //Remove numbers
        System.out.println(s1.replaceAll("\\D", " "));
    }
}
