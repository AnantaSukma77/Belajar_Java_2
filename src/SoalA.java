import java.util.HashMap;
import java.util.Map;

public class SoalA {
    public static void main(String[] args) {

        Map<String, Object> soalA = new HashMap<>();
        soalA.put("name", "sonoo");
        soalA.put("salary", 56000);
        soalA.put("maried", true);

        Map<String, Object> employee = new HashMap<>();
        employee.put("employee", soalA);

        System.out.println(employee);
    }
}
