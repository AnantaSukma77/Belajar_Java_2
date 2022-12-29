import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class SoalC {
    public static void main(String[] args) {
        Map<String, Object> menu = new HashMap<>();

        menu.put("id", "file");
        menu.put("value", "File");

        Map<String, Object> popup = new HashMap<>();
        menu.put("popup", popup);

        List<Object> menuitem = new ArrayList<>();
        popup.put("menuitem", menuitem);
        Map<String, String> data1 = new HashMap<>();
        data1.put("value", "New");
        data1.put("onclick", "CreateDoc()");

        menuitem.add(data1);

        Map<String, String> data2 = new HashMap<>();
        data2.put("value", "Open");
        data2.put("onclick", "OpenDoc()");

        menuitem.add(data2);
        Map<String, String> data3 = new HashMap<>();
        data3.put("value", "Save");
        data3.put("onclick", "SaveDoc()");

        menuitem.add(data3);

        System.out.println(menuitem);
    }
}
