import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNama {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)+");
        Matcher matcher = pattern.matcher("Nanta Sukma");
        if(matcher.find()){
            System.out.println("cocok");
        } else {
            System.out.println("tidak cocok"); }
    }
}
