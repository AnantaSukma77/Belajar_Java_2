import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SoalB {
    public static void main(String[] args) {
        Map<String, Object> pertama = new HashMap<>();
        pertama.put("name", "Shyam");
        pertama.put("email", "shyamjaiswal@gmail.com");

        Map<String, Object> kedua = new HashMap<>();
        kedua.put("name", "Bob");
        kedua.put("email", "bob32@gmail.com");

        Map<String, Object> ketiga = new HashMap<>();
        ketiga.put("name", "Jai");
        ketiga.put("email", "jai87@gmail.com");

        List<Object> isiList = new ArrayList<>();
        isiList.add(pertama);
        isiList.add(kedua);
        isiList.add(ketiga);

        Map<String, Object> employees = new HashMap<>();
        employees.put("employees", isiList);

        System.out.println(employees);
    }
}
