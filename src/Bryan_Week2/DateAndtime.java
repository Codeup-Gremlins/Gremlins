package Bryan_Week2;

import java.util.Calendar;

public class DateAndtime {

        public static void main(String[] args)
        {
            Calendar time = Calendar.getInstance();
            System.out.println();
            System.out.println("Current date and time is : " + (time.get(Calendar.MONTH) + 1) + "-"
                    + time.get(Calendar.DATE) + "-" + time.get(Calendar.YEAR) + " "
                    + time.get(Calendar.HOUR_OF_DAY) + ":" + time.get(Calendar.MINUTE) + ":"
                    + time.get(Calendar.SECOND) + "." + time.get(Calendar.MILLISECOND));
        }
    }



