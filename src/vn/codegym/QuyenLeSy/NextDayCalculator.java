package vn.codegym.QuyenLeSy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NextDayCalculator {
    public static String nextDay(String dateTime) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = simpleDateFormat.parse(dateTime);
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        String converted = simpleDateFormat.format(calendar.getTime());
        return converted;
    }
}
