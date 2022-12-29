import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ListTahunPildun {
    public static void main(String[] args) {
        List<Year> pildunList = new ArrayList<>();
        pildunList.add(Year.of(1998));
        pildunList.add(Year.of(2002));
        pildunList.add(Year.of(2006));
        pildunList.add((Year.of(2010)));
        System.out.println(pildunList);
    }
}
