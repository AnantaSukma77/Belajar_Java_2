import java.util.HashMap;
import java.util.Map;

public class SoalD {
    public static void main(String[] args) {
        Map<String, Object> pertamaA = new HashMap<>();
        pertamaA.put("title", "Sample Konfabulator Widget");
        pertamaA.put("name", "main_window");
        pertamaA.put("width", 500);
        pertamaA.put("height", 500);

        Map<String, Object> keduaA = new HashMap<>();
        keduaA.put("src", "Images/Sun.png");
        keduaA.put("name", "sun1");
        keduaA.put("hOffset", 250);
        keduaA.put("vOffset", 250);
        keduaA.put("alignment", "center");

        Map<String, Object> ketigaA = new HashMap<>();
        ketigaA.put("data", "Click Here");
        ketigaA.put("size", 36);
        ketigaA.put("style", "bold");
        ketigaA.put("name", "text1");
        ketigaA.put("hOffset", 250);
        ketigaA.put("vOffset", 100);
        ketigaA.put("alignment", "center");
        ketigaA.put("onMouseUp", "sun1.opacity = (sun1.opacity / 100) * 90;");

        Map<String, Object> keempat = new HashMap<>();
        keempat.put("debug", "on");
        keempat.put("window", pertamaA);
        keempat.put("image", keduaA);
        keempat.put("text", ketigaA);

        Map<String, Object> kelima = new HashMap<>();
        kelima.put("widget", keempat);

        System.out.println(kelima);
    }
}
