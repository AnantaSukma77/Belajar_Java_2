import java.util.regex.Matcher;
import java.util.regex.Pattern;

// MENGGUNAKAN IP ADDSRESS VERSI 4
public class RegexIpV4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b");
        Matcher matcher = pattern.matcher("192.0.2.146");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
