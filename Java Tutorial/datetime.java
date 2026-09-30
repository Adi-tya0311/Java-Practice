import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class datetime {
    public static void main(String[] args) {
        //Date time format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//MM cannot be small mm as, small m is considered as minutes
        try {   //                                                          also keep year and date in small as it gives error in final print
            Date d = sdf.parse("2009-12-13");
            System.out.println(sdf.format(d));
        } catch (ParseException e) {
            System.out.println(e);
        };
        System.out.println("After exception or after execution");
    }
}
