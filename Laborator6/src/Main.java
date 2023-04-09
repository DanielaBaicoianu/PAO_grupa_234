import model1.*;

import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.MONTH, 2);
        Pisica pisica1 = new Pisica("Costica", 13);
        System.out.println(pisica1);
        Calendar calendar2 = Calendar.getInstance(Locale.FRANCE);
        calendar2.set(Calendar.YEAR, 2000);
        calendar2.set(Calendar.DAY_OF_MONTH, 15);
        calendar2.set(Calendar.MONTH, 2);
        Caine caine = new Caine("Bobita", "Bison");
        System.out.println(caine);
    }
}