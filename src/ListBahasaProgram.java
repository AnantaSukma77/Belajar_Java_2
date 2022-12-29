import java.util.ArrayList;
import java.util.List;

public class ListBahasaProgram {
    public static void main(String[] args) {
        List<String> bahasaList = new ArrayList<>();
        bahasaList.add("Python");
        bahasaList.add("Java");
        bahasaList.add("JavaScript");
        bahasaList.add("Ruby");
        bahasaList.add("C");
        bahasaList.add("C#");
        bahasaList.add("C++");
        bahasaList.add("PHP");
        bahasaList.add("Pearl");
        bahasaList.add("Golang");
        bahasaList.add("Kotlin");
        bahasaList.add("Swift");

        System.out.println(bahasaList);

        bahasaList.remove("Ruby");
        bahasaList.remove("C#");
        bahasaList.remove("PHP");
        bahasaList.remove("Golang");
        bahasaList.remove("Swift");

        System.out.println(bahasaList);
    }
}
