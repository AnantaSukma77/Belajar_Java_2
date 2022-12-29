import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^((0[1-9]|1[0-9]|2[0-9]|3[01])\\-(0[1-9]|1[0-2])\\-([0-9]{4}))*$");
        Matcher matcher = pattern.matcher("12-08-1999");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
