import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPropinsi {
    public static void main(String[] args) {
        List<String> propinsiList = new ArrayList<>();
        propinsiList.add("Aceh");
        propinsiList.add("Sumatera");
        propinsiList.add("Lampung");
        propinsiList.add("Banten");
        propinsiList.add("Jakarta");
        propinsiList.add("Yogyakarta");
        propinsiList.add("Bali");
        propinsiList.add("Kalimantan");
        propinsiList.add("Sulawesi");
        propinsiList.add("Gorontalo");
        propinsiList.add("Maluku");
        propinsiList.add("Papua");

        Collections.sort(propinsiList);
        Collections.reverse(propinsiList);
        System.out.println(propinsiList);
    }
}
