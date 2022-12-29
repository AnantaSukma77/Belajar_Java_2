import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^((Senin|Selasa|Rabu|Kamis|Jum'at|Sabtu|Minggu)\\\\,\\\\ (Januari|Februari|Maret|April|Mei|Juni|Juli|Agustus|September|Oktober|November|Desember)\\\\ ([0-9]{2}))*$");
        Matcher matcher = pattern.matcher("Rabu, September 22");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
