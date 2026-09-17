public class regex2 {
    public static void main(String[] args) {
        //RUle out integers out of string
        String s = "A3i2ty1";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'0'&& s.charAt(i)<='9'){     //traditional method
                System.out.println(s.charAt(i));
            }
        }

        //Regex method

        // //d - single digit
        // //d+ -one or more digit
        // //d* -zero or more digit
        // //d? -zero means no digit or one

        String s1 = s.replaceAll("\\D", "");
        System.out.println(s1);

        String s2 = s.replaceAll("\\d", "");
        System.out.println(s2);

        String s3 = "";
        if(s3.matches("\\d+")){             // + checks for one or more
            System.out.println("Digit");
        }else{System.out.println("No digit");}

        String s4 = "";
        if(s4.matches("\\d*")){             // * checks for zero or more
            System.out.println("Digit");
        }else{System.out.println("No digit");}

        String s5 = "22";
        if(s5.matches("\\d?")){             // ? checks for zero or one(singular digit)
            System.out.println("Digit");
        }else{System.out.println("No digit");}

        //----------------------
        // //w- letter,digit,underscore
        String s6 = "%3$21agm*";
        System.out.println("ONly letter, words and underscore - "+s6.matches("\\w+"));
        System.out.println(s6.replaceAll("\\w", ""));

        System.out.println(s6.replaceAll("\\W", ""));   //

        //------------------------
        // //s - remove whitespace
        String s7 = " Hello @999 Java ";
        System.out.println("Remove whitespace: "+s7.replaceAll("\\s", ""));

        //S - keep whitespace remove everything
        System.out.println("Remove whitespace: "+s7.replaceAll("\\S", "x"));

        //-----------------------
        // {s}- exact s number of input is needed
        // {s,} - minimum s number of input is needed
        String s8 = "Adi_123";
        System.out.println(s8.matches("\\w{5}"));   //exact 5 input is needed
        System.out.println(s8.matches("\\w{5,}"));  //Minimum 5 needed
        System.out.println(s8.matches("\\w{5,9}")); //Range between 5 - 9 needed


        //------------------------
        // [A-Z] - check whether letter are captial or not
        String s9 = "ABCD";
        System.out.println(s9.matches("[A-Z]+"));
        String s10 = "ABCdef";
        System.out.println(s10.matches("[A-Z]+[a-z]+"));
        String s11 = "abcEFGH";
        System.out.println(s11.matches("[a-f]+[E-H]+"));//error found- if i give brackets in different order then it gives false output
        
        //-------------------------
        String s12 = "Java";
        System.out.println(s12.matches("Java|Python|PHP"));

        //-------------------------
        System.out.println("MOB: ");
        String mobile = "9860529110";
        System.out.println(mobile.matches("9\\d{9}"));









    }
}


/*
    Regex	Meaning
    .	Any character
    ^	Beginning of string/line
    $	End of string/line
    *	0 or more
    +	1 or more
    ?	0 or 1
    {n}	Exactly n
    {n,}	At least n
    {n,m}	Between n and m
    []	Character class
    [^]	Negated character class
    ()	Group
    `	`
    \	Escape / special sequence

    . - any single char
    \d - digit
    \D- Non digit
    \w - letter, digit, underscore
 */

