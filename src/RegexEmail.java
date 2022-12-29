import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher("contoh@gmail.com");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
