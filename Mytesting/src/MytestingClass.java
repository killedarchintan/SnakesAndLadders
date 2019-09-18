import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MytestingClass {

  public static void main(String[] args) throws ParseException {
   // Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss");
    sdf.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
    String strDate = sdf.format(new Date(1590228300000L));
    System.out.println("Current date in String Format: " + strDate);
  }
}
