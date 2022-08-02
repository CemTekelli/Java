package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        //LinkedHashMap pour garder l'ordre
        // Treemap permet de sort sur l'ordre alphabetique -> keys

        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionary.put("Brilliant", "Clever or talented");
        dictionary.put("Confidence", "feeling certain about the truth of something");
        /*
        for(String word : dictionary.keySet()){
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }
        */

        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
