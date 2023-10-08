package homework_nr_8;

import java.util.HashMap;
import java.util.Map;
public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> Dictionary = new HashMap<>();
        Dictionary.put("Hello", "Salut");
        Dictionary.put("Goodbye", "La revedere");
        Dictionary.put("Day", "Ziua");
        Dictionary.put("Night", "Noapte");
        Dictionary.put("Morning", "Dimineata");
        Dictionary.put("Evening", "Seara");
        Dictionary.put("Car", "Vehicol");
        Dictionary.put("Plane", "Aeronava");
        Dictionary.put("Bycicle", "Bicicleta");
        Dictionary.put("Cat", "Pisica");
        System.out.println("Vocabular engleza-roman");
        System.out.println("-----------------------");
        for (Map.Entry<String, String> words : Dictionary.entrySet()) {
            String wordsEnglish = words.getKey();
            String wordsRomanian = words.getValue();
            System.out.println(wordsEnglish + " - " + wordsRomanian);
        }
    }
}
