package tipedata;
import java.text.SimpleDateFormat;
import java.util.Date;
public class latihan26_WaktuSaatIni {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}