import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPostCode {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([1-9])[0-9]{4}$");
        Matcher matcher = pattern.matcher("67123");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
