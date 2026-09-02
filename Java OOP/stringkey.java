
public class stringkey{
public static void main(String[] args) {
    String data ="Hello";
    //replace()- replace old keyword with new content
    System.out.println(data.replace('H','E'));
    System.out.println(data.replace(data, "HTML CSS"));

    //substring()- return part of string as per index
    String data2 = "Pune Pune";
    System.out.println(data2.substring(3));
    System.out.println(data2.substring(2,7));

    //toLowerCase()- 
    System.out.println(data2.toLowerCase());

    //valueOf- typecasting int to string 
    int x = 108;
    String value = String.valueOf(x);
    System.out.println(value+2);

    // parseInt / parseFloat: convert a numeric String to a primitive value
    String d = "108";
    int i = Integer.parseInt(d);
    float f = Float.parseFloat(d);
    System.out.println(i + " Int");
    System.out.println(f + " Float");

    //toString
    car c = new car();
    System.out.println(c);

    //trim keyword()- trims the whitespace from the front and the back
    String trim = "    Trimmer trim is here.     ";
    System.out.println(trim.trim());

    //startswith()- it tells if a String starts with that specific word
    String start = "It's the month of September";
    System.out.println(start.startsWith("September"));
    System.out.println(start.startsWith("It's"));

    //endswith()- it tells if String ends with a specific word
    String emailcheck = "adityajagtap@gmail.com";
    System.out.println(emailcheck.endsWith("@gmail.com"));

    //indexOf()- returns index position
    System.out.println(emailcheck.indexOf("@"));
    String multiple = "the football went into the bin and it was the coach who was the most angry about it.";
    System.out.println(multiple.indexOf("the")); //returns index of only the first occurence

    //lastindexOf()-
    System.out.println(multiple.lastIndexOf("the"));

    //contains()- checks whether String is present in that string or not
    System.out.println(multiple.contains("angry"));
    System.out.println(multiple.contains(" "));// even space is checked,lol!!

    //isBlank() and isEmpty()-
    String s = "";
    System.out.println(s.isBlank());//true
    System.out.println(s.isEmpty());//true
    String s1= " ";
    System.out.println(s1.isBlank());//true
    System.out.println(s1.isEmpty());//false

    //join
    // String j = "Bada";

    //Strip()- 
    String s2 = "\u3000Hello it is me\u3000";
    System.out.println(s2.strip());
    System.out.println(s2.trim());

    System.out.println(s2.stripLeading());
    System.out.println(s2.stripTrailing());
    System.out.println(s2.stripIndent());

    //split() - split a whole sentence into words string
    String str = "Aditya is Learning String keywords today";
    String a[] = str.split(" ");
    for(int k=0;k<a.length;k++){
        System.out.println(a[k]);
    }
}
}



//toString()- 
        class car{
            int carage= 3;
            public String toString(){
                return "TZhis car is " +carage+" year old";
            }
        }

