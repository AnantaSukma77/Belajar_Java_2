import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SoalE {
    public static void main(String[] args) {
        List<Object> pertamaList = new ArrayList<>();
        pertamaList.add("GML");
        pertamaList.add("XML");

        Map<String, Object> pertamaMap = new HashMap<>();
        pertamaMap.put("para", "A meta-markup language, used to create markup languages such as DocBook.");
        pertamaMap.put("GlossSeeAlso", pertamaList);

        Map<String, Object> keduaMap = new HashMap<>();
        keduaMap.put("ID", "SGML");
        keduaMap.put("SortAs", "SGML");
        keduaMap.put("GlossTerm", "Standard Generalized Markup Language");
        keduaMap.put("Acronym", "SGML");
        keduaMap.put("Abbrev", "ISO 8879:1986");
        keduaMap.put("GlossDef", pertamaMap);
        keduaMap.put("GlossSee", "markup");

        Map<String, Object> ketigaMap = new HashMap<>();
        ketigaMap.put("GlossEntry", keduaMap);

        Map<String, Object> keempatMap = new HashMap<>();
        keempatMap.put("title", "S");
        keempatMap.put("GlossList", ketigaMap);

        Map<String, Object> kelimaMap = new HashMap<>();
        kelimaMap.put("title", "example glossary");
        kelimaMap.put("GlossDiv", keempatMap);

        Map<String, Object> keenamMap = new HashMap<>();
        keenamMap.put("glossary", kelimaMap);

        System.out.println(keenamMap);

    }
}
