package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String currentTime = new SimpleDateFormat("dd.MM.yy").format(new Date());
        System.out.println("Log info: " + currentTime + " - " +  className +  " - "  + info);
    }
}
